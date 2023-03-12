package com.temirzhanov.springsecurity.repository;

import com.temirzhanov.springsecurity.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Meiram Sopy Temirzhanov
 */
@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}
