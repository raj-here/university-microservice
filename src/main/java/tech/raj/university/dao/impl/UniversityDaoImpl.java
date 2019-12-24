package tech.raj.university.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tech.raj.university.dao.UniversityDao;
import tech.raj.university.model.University;
import tech.raj.university.repository.UniversityRepository;

@Repository
public class UniversityDaoImpl implements UniversityDao {

	@Autowired
	private UniversityRepository universityRepository;

	@Override
	@Transactional
	public void save(University university) {
		universityRepository.save(university);
	}

	@Override
	public List<University> getAll() {
		return universityRepository.findAll();
	}

	@Override
	public University findById(String id) {
		return universityRepository.findById(id).get();
	}

}
