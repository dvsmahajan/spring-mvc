package com.dev.devapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.devapp.dao.KartDAO;
import com.dev.devapp.dto.KartDTO;


@Service
public class KartServcieImpl implements KartService {
	
	@Autowired
	private KartDAO dao;

	public void kartService(KartDTO dto) {
		// TODO Auto-generated method stub
		dao.saveKart(dto);
	}
	
	

}
