package com.exoZenika.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface JPA pour la gestion des Users
 * @author hector
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User	, Long>{}
