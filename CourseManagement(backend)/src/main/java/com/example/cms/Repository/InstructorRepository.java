package com.example.cms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cms.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
	
}

