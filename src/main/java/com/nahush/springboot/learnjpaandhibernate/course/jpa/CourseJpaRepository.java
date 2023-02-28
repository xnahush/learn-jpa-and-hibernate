package com.nahush.springboot.learnjpaandhibernate.course.jpa;
import com.nahush.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public void insert(Course course){
        entityManager.merge(course);
    }

    public void deleteById(int id) {
        entityManager.remove(entityManager.find(Course.class, id));
    }

    public Course selectById(int id) {
        return entityManager.find(Course.class, id);
    }
}
