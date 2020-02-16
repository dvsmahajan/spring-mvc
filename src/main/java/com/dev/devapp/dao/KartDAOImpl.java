package com.dev.devapp.dao;

import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dev.devapp.dto.KartDTO;

@Repository
public class KartDAOImpl implements KartDAO {

	@Autowired
	private SessionFactory factory;

	public void saveKart(KartDTO dto) {
		Transaction tx = null;
		Session session=null;
		try {
		 session = factory.openSession();
			tx = session.beginTransaction();
			session.save(dto);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();

		}
		finally {
			if(Objects.nonNull(session))
			{
				session.close();
			}
		}
	}

}
