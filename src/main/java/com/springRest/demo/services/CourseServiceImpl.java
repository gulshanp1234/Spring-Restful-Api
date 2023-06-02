package com.springRest.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.demo.dao.CourseDao;
import com.springRest.demo.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	@Autowired
//	private CourseDao courseDao;
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(123, "Java Core Course", "This course contain the basic of java"));
		list.add(new Course(456, "spring boot", "Creating rest api using spring boot"));
	}

	@Override
	public List<Course> getCourses() {
//		return courseDao.findAll();
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
//		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
//		courseDao.save(course);
		System.out.println(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.forEach(e->{
			if(e.getId()==course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
//		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		list = this.list.stream().filter(e-> e.getId()!= parseLong).collect(Collectors.toList());
//		courseDao.deleteById(parseLong); 
	}

}
