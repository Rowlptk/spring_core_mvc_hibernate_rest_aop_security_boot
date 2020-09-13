package com.progress.tracker.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progress.tracker.dao.ProgressDAO;
import com.progress.tracker.entity.Progress;

@Service
public class ProgressServiceImpl implements ProgressService {

	@Autowired
	private ProgressDAO progressDAO;
	
	@Override
	@Transactional
	public List<Progress> getProgressList() {
		
		return progressDAO.getProgressList();
	}

}
