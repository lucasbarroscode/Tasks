//package com.book.task.controller;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.rest.webmvc.RepositoryRestController;
//import org.springframework.data.web.PagedResourcesAssembler;
//import org.springframework.hateoas.PagedModel;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.book.task.dto.TaskDto;
//import com.book.task.entity.Task;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@RepositoryRestController
//@RequestMapping("/todo")
//@RequiredArgsConstructor
//public class TaskController {
//	
//	private final PagedResourcesAssembler pagedResourcesAssembler;
//	private final TaskService taskService;
//	
//	
//	public ResponseEntity<?> getTasks(TaskDto taskDto, Pageable pageable, PersistentEntityResourcesAssembler resourceAssembler){
//		log.info("TasksController:" + taskDto);
//		Page<Task> events taskService.getTasks(pageable);
//		PagedModel<?> resource = pagedResourcesAssembler.toModel(events,resourceAssembler);
//		return ResponseEntity.ok(resource);
//	}
//	
//
//}
