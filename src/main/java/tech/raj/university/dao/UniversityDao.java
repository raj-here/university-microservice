package tech.raj.university.dao;

import java.util.List;

import tech.raj.university.model.University;

public interface UniversityDao {

	void save(University university);

	List<University> getAll();

	University findById(String id);
}
