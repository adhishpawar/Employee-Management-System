package com.adhish.Employee.Management.System.repository;

import com.adhish.Employee.Management.System.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
