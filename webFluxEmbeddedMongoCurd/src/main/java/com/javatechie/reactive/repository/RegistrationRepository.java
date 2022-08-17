package com.javatechie.reactive.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.reactive.entity.Student;



@Repository
public interface RegistrationRepository extends  ReactiveMongoRepository<Student, String>{

}
