package com.nahush.springboot.learnjpaandhibernate.course.springdatajpa;

import com.nahush.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Integer> {
}
