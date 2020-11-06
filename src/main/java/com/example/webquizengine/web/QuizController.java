package com.example.webquizengine.web;


import com.example.webquizengine.domain.Feedback;
import com.example.webquizengine.domain.Quiz;
import com.example.webquizengine.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QuizController {

    @Autowired
    QuizRepository quizRepo;

    @GetMapping("/quizzes")
    public Iterable<Quiz> getQuizzes() {
        return quizRepo.findAll();
    }

    @GetMapping("/quizzes/{id}")
    public Quiz getQuiz(@PathVariable long id) {
        return quizRepo.findById(id).orElseThrow(QuizNotFoundException::new);
    }

    @PostMapping("/quizzes")
    public Quiz postQuiz(@RequestBody Quiz quiz) {
        return quizRepo.save(quiz);
    }


    @PostMapping("/quizzes/{id}/solve")
    public Feedback solveQuiz(@PathVariable long id, @RequestParam int answer) {
        Quiz quiz = quizRepo.findById(id).orElseThrow(QuizNotFoundException::new);
        if (quiz.getAnswer() == answer)
            return new Feedback(true, "Congratulations, you're right!");
        else
            return new Feedback(false, "Wrong answer! Please, try again.");
    }

}
