package com.bd.tpfinal.repositories.implementations;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bd.tpfinal.repositories.interfaces.IClientRepository;

@Repository
public class ClientRepositoryImpl implements IClientRepository {
	@PersistenceContext private EntityManager em;
	
	
}
