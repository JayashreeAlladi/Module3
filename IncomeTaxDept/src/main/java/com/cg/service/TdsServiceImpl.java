package com.cg.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.dao.TdsDao;
import com.cg.model.TdsMaster;



@Component("tdsService")
@Service
@Transactional
public class TdsServiceImpl implements TdsService {

	@Autowired
	TdsDao dao;
	
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	
}
