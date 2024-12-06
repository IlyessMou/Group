package com.example.quizzapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.quizzapp.models.Quiz;
import com.example.quizzapp.models.Result;
import com.example.quizzapp.models.User;

public interface ResultRepository extends JpaRepository<Result, Long> {


    List<Result> findByUser(User user);

    List<Result> findByQuiz(Quiz quiz);
}