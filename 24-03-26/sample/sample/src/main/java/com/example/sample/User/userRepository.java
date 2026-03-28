package com.example.sample.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);

}
