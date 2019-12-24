package tech.raj.university.service;

import java.util.List;

import tech.raj.university.bean.UniversityBean;

public interface UniversityService {

	void save(UniversityBean university);

	List<UniversityBean> getAll();

	UniversityBean findById(String id);
}
