package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.itwillbs.dao.MainDAO;
import com.itwillbs.domain.ActivityDTO;

@Service
public class MainServiceImpl implements MainService {

	@Inject
	private MainDAO mainDAO; 
	
	@Override
	public List<ActivityDTO> getMainContentList() {
		
		return mainDAO.getMainContentList();
	}

	@Override
	public List<ActivityDTO> getMainInterestList(String userId) {
		return mainDAO.getMainInterestList(userId);
	}

	@Override
	public List<ActivityDTO> getMainAreaList(String userId) {
		return mainDAO.getMainAreaList(userId);
	}

	
}
