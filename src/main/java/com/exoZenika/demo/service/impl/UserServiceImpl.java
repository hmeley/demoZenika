package com.exoZenika.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.exoZenika.demo.repository.User;
import com.exoZenika.demo.repository.UserRepository;
import com.exoZenika.demo.service.UserService;
import com.exoZenika.demo.service.bo.UserBO;

/**
 * Classe d'implémentation du service de gestion des utilisateurs
 * @author hector
 *
 */
@Component
public class UserServiceImpl implements UserService {
	
	
	private final UserRepository userRepo;
	
	
	public UserServiceImpl(UserRepository pUserRepo) {
		userRepo = pUserRepo;
	}

	@Override
	public List<UserBO> getUser() {
		
		
		List<User> usersRepo = (List<User>) userRepo.findAll();
		// TODO Auto-generated method stub
		return usersRepo.stream().map(us ->repoToBo(us)).toList();
	}
	
	/**
	 * Adapter de l'objet user issue du repository vers le userBO
	 * @param user le user issue de la couche repository
	 * @return le userBO
	 */
	private UserBO repoToBo(User user) {
		UserBO userBo = new UserBO();
		userBo.setId(user.getId());
		userBo.setMail(user.getMail());
		userBo.setName(user.getName());
		return userBo;
	}

	@Override
	public void saveUser(UserBO userBO) {	
		User user = boToRepo(userBO);	
		userRepo.save(user);
	}
	
	
	
	/**
	 * Adapter de l'objet user issue du repository vers le userBO
	 * @param user le user issue de la couche service
	 * @return le user repository
	 */
	private User boToRepo(UserBO userBO) {
		User user = new User();
		user.setId(userBO.getId());
		user.setMail(userBO.getMail());
		user.setName(userBO.getName());
		return user;
	}
	
	

}
