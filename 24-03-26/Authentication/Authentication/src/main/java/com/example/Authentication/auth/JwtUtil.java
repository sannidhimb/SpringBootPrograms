package com.example.Authentication.auth;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
    private final String SECRET="qwertyqwertyhgfoudgfishgisorugosdjgifu";
    private final SecretKey key=Keys.hmacShaKeyFor(SECRET.getBytes());
    private final long EXPIRATION=1000*60*60*24;

    public String generateToken(String username){
        return Jwts.builder()
                    .subject(username)
                    .issuedAt(new Date())
                    .expiration(new Date(System.currentTimeMillis()+EXPIRATION))
                    .signWith(key)
                    .compact();
    }
    //from data extract username
    public String extractUsername(String token){
        return getClaims(token).getSubject();
    }

    //token is validate or not
    public boolean validateToken(String token){
        try {
            getClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //extract the claims (data)
    public Claims getClaims(String token){
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}
