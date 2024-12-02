package com.example.quizzapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quizzapp.models.Quiz;
import com.example.quizzapp.models.User;
import com.example.quizzapp.repositories.QuizRepository;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepo;

    public List<Quiz> getAllPublicQuizzes() {
        return quizRepo.findByIsPrivateFalse();
    }


    public void createQuiz(Quiz quiz, User creator) {
        quiz.setCreator(creator);  
        quizRepo.save(quiz);  
    }

    public Optional<Quiz> findById(Long id) {
        return quizRepo.findById(id);
    }

    public Quiz findByCode(String code) {
        return quizRepo.findByCode(code);
    }
}