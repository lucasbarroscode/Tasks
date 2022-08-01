package com.book.task.repository;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.book.task.entity.Task;

import antlr.collections.List;

@RepositoryRestResource(path="task",collectionResourceRel="tasks")
public interface TaskRepository	extends JpaSpecificationExecutor<Task>, QuerydslPredicateExecutor<Task> {
	
	
	Page<Task> findByIdIn(@Param(value = "id") List eventid,Pageable pageable);
	
	Page<Task>findByNameIn(@Param("name")Collection<String>names,Pageable pageable);
	
	@Query(name="Task.findByName",nativeQuery=true)
	List findByName(@Param("name")String name);
	
	Page<Task> findAll(Pageable pageable);
	
	@Query(name="Task.findById", nativeQuery = true)
	@RestResource(exported = false)
	Optional<Task> findById(@Param("id")long id);
	
	
}
	