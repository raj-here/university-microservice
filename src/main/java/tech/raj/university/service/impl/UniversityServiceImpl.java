package tech.raj.university.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.raj.university.bean.UniversityBean;
import tech.raj.university.dao.UniversityDao;
import tech.raj.university.model.University;
import tech.raj.university.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityDao universityDao;

	@Override
	public void save(UniversityBean universityBean) {
		universityDao.save(new University(universityBean));
	}

	@Override
	public List<UniversityBean> getAll() {
		return universityDao.getAll().stream().map(UniversityBean::new).collect(Collectors.toList());
	}

	@Override
	public UniversityBean findById(String id) {
		return new UniversityBean(universityDao.findById(id));
	}
}
