package com.pproject.ws.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.pproject.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto user);

	}
