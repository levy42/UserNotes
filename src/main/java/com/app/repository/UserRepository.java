package com.app.repository;

import com.app.domain.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vitaliy on 3/31/16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
