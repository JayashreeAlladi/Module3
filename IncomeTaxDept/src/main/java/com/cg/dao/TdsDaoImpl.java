package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.model.TdsMaster;


@Component("dao")
@Repository
@ComponentScan("com")
public class TdsDaoImpl implements TdsDao{
	
	@PersistenceContext
	EntityManager entityManager;
	

	@Override
	public TdsMaster getById(int id) {
		TdsMaster tdsMaster=entityManager.find(TdsMaster.class, id);
		return tdsMaster;
	}
	
}
