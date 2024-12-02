package com.example.quizzapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizzapp.models.Quiz;
import com.example.quizzapp.models.Result;
import com.example.quizzapp.models.User;
import com.example.quizzapp.repositories.ResultRepository;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;


    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }


    public Result getResultById(Long id) {
        return resultRepository.findById(id).orElse(null);
    }


    public List<Result> getResultsByUser(User user) {
        return resultRepository.findByUser(user);
    }

    // Fetch all results by quiz
    public List<Result> getResultsByQuiz(Quiz quiz) {
        return resultRepository.findByQuiz(quiz);
    }
}
