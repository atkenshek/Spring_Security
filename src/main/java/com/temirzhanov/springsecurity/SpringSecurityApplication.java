package com.temirzhanov.springsecurity;

import com.temirzhanov.springsecurity.entity.AppUser;
import com.temirzhanov.springsecurity.entity.Role;
import com.temirzhanov.springsecurity.service.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserServiceImpl userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new AppUser(
				null, "John Travolta", "john", "1234", new ArrayList<>())
			);
			userService.saveUser(new AppUser(
				null, "Will Smith", "will24", "1234", new ArrayList<>())
			);
			userService.saveUser(new AppUser(
				null, "Jim Carry", "jim223", "1234", new ArrayList<>())
			);
			userService.saveUser(new AppUser(
				null, "Arnold Schwarzenegger", "arnold", "1234", new ArrayList<>())
			);

			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("john", "ROLE_MANAGER");
			userService.addRoleToUser("will24", "ROLE_MANAGER");
			userService.addRoleToUser("jim223", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_USER");
		};
	}

}
