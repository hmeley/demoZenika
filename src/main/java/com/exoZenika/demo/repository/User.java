package com.exoZenika.demo.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Class reopsitory correspondant à la table User
 * @author hecto
 *
 */
@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;

	private String mail;
	private String name;
	

	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @param id
	 * @param mail
	 * @param name
	 */
	public User(String mail, String name) {
		this.mail = mail;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
