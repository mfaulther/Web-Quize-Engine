package com.example.webquizengine.repository;

import com.example.webquizengine.domain.Quiz;
import org.springframework.data.repository.CrudRepository;


public interface QuizRepository extends CrudRepository<Quiz, Long> {
}
