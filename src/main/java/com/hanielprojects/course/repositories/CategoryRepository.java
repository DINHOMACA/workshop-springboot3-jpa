package com.hanielprojects.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.hanielprojects.course.entities.Category;

public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long> {

}
