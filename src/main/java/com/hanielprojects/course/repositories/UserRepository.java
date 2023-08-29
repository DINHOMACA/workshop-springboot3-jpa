package com.hanielprojects.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.hanielprojects.course.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long> {

}
