package com.temirzhanov.springsecurity.service;

import com.temirzhanov.springsecurity.entity.AppUser;
import com.temirzhanov.springsecurity.entity.Role;

import java.util.List;

/**
 * @author Meiram Sopy Temirzhanov
 */
public interface AppUserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
