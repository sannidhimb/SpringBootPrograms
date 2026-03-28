package com.example.sample.Auth;


import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.example.sample.User.User;

@RestController
@RequestMapping("/user")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public APiResponse<String> register(@RequestBody RegisterRequest request) {
        String message = authService.register(request.getUsername(), request.getPassword());
        return new APiResponse<>(message, null);
    }

    @PostMapping("/login")
    public APiResponse<String> login(@RequestBody LoginRequest request) {
        String token = authService.Login(request.getUsername(), request.getPassword());
        return new APiResponse<>("Login Success", token);
    }
    @GetMapping("/users")
public APiResponse<List<User>> getAllUsers() {
    List<User> users = authService.getAllUsers();
    return new APiResponse<>("Users fetched successfully", users);
}

    @GetMapping("/{username}")
    public APiResponse<AuthResponse> getUserByUsername(@PathVariable String username) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            throw new RuntimeException("User not authenticated");
        }

        String loggedInUsername = authentication.getName();

        boolean isAdmin = authentication.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"));

        if (!isAdmin && !loggedInUsername.equalsIgnoreCase(username)) {
            throw new RuntimeException("Access Denied");
        }

        User user = authService.getUserByUsername(username);

        if (user == null) {
            return new APiResponse<>("User not found", null);
        }

        AuthResponse response = new AuthResponse(
                user.getId(),
                user.getUsername(),
                user.getRole()
        );

        return new APiResponse<>("User fetched successfully", response);
    }
}

