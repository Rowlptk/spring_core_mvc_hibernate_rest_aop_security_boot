package com.progress.tracker.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.progress.tracker.entity.Progress;

@Repository
public class ProgressDAOImpl implements ProgressDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Progress> getProgressList() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Progress> theQuery = 
				currentSession.createQuery("from Progress order by date desc", 
											Progress.class);
		
		List<Progress> progress_list = theQuery.getResultList();
		
		return progress_list;
	}
}
