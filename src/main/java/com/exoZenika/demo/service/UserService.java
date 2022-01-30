package com.exoZenika.demo.service;

import java.util.List;

import com.exoZenika.demo.service.bo.UserBO;

/**
 * Service de gestion des utilisateur
 * @author hecto
 *
 */
public interface UserService {
	
	List<UserBO> getUser();

}
