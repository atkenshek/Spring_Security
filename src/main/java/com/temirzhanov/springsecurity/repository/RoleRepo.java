package com.temirzhanov.springsecurity.repository;

import com.temirzhanov.springsecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Meiram Sopy Temirzhanov
 */
@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
