package com.exoZenika.demo.service;

import java.util.List;

import com.exoZenika.demo.service.bo.UserBO;

/**
 * Service de gestion des utilisateur
 * @author hecto
 *
 */
public interface UserService {
	
	/**
	 * Récupère la liste des utilisateurs en base de donnée
	 * @return la liste des utilisateurs
	 */
	List<UserBO> getUser();

	/**
	 * Enregistre l'utilisateur en base de donnée
	 * @param user : l'utilisateur à enregistrer
	 */
	void saveUser(UserBO user);

}
