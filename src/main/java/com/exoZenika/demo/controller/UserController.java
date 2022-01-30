package com.exoZenika.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exoZenika.demo.service.UserService;
import com.exoZenika.demo.service.bo.UserBO;

/**
 * Controlelr rest de gestion des utilisateur
 * @author hecto
 *
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	private final UserService userService;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Constructeur de la class, inject les dépendances
	 * @param pUserService
	 */
	public UserController(UserService pUserService) {
		userService = pUserService;
	}
	
	
	@GetMapping("/users")
	public List<UserBO> getUsers(){
		logger.info("Recupération des user");
		return userService.getUser();
	}
	
	@PostMapping("/users")
	public void saveUser(@RequestBody UserBO user) {
		logger.info("Sauvegarde de l'utilisateur : {}" , user);
		userService.saveUser(user);
	}

}
