package com.hanielprojects.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.hanielprojects.course.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {

}
