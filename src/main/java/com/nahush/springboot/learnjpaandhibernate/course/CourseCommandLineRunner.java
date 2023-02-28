package com.nahush.springboot.learnjpaandhibernate.course;

import com.nahush.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.nahush.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn SQL Spring data JPA", "in28minutes"));
        repository.save(new Course(2, "Learn AWS Spring data JPA", "in28minutes"));
        repository.save(new Course(3, "Learn GCP Spring data JPA", "in28minutes"));

        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
