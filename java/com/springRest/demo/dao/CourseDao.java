package com.springRest.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.demo.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
