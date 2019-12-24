package tech.raj.university.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.raj.university.model.University;

public interface UniversityRepository extends JpaRepository<University, String> {
	Optional<University> findById(String id);
}
