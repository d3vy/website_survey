package com.website.survey.services;

import com.website.survey.models.Answer;
import com.website.survey.models.Question;
import com.website.survey.models.Response;
import com.website.survey.repositories.AnswerRepository;
import com.website.survey.repositories.QuestionRepository;
import com.website.survey.repositories.ResponseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SurveyService {

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;
    private final ResponseRepository responseRepository;


    public SurveyService(QuestionRepository questionRepository, AnswerRepository answerRepository, ResponseRepository responseRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
        this.responseRepository = responseRepository;
    }


}