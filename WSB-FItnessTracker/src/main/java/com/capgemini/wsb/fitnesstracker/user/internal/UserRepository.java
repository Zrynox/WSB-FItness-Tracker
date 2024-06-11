package com.capgemini.wsb.fitnesstracker.user.internal;

import com.capgemini.wsb.fitnesstracker.user.api.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    default Optional<User> findByEmail(String email) {
        return findAll().stream()
                .filter(user -> Objects.equals(user.getEmail(), email))
                .findFirst();
    }

    @Query("SELECT u.id AS id, u.email AS email FROM User u WHERE LOWER(u.email) LIKE %:emailFragment%")
    List<User> findIdAndEmailByEmailContainingIgnoreCase(String emailFragment);

    List<User> findByEmailContainingIgnoreCase(String emailFragment);
    List<User> findByBirthdateBefore(LocalDate date);


}