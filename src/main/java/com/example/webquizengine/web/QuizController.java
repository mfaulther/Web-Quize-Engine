package com.example.webquizengine.web;


import com.example.webquizengine.domain.Quiz;
import com.example.webquizengine.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QuizController {

    @Autowired
    QuizRepository quizRepo;

  /*  @GetMapping("/quiz")
    public Quiz quiz()
    {
        Quiz result = new Quiz("title", "some text", new String[] {"Robot", "Tea Leaf", "Cup of coffee", "Bug"});
        return result;
    } */

    @GetMapping("/quiz")
    public Iterable<Quiz> getQuizzes() {
        return quizRepo.findAll();
    }

    @GetMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable long id) {
        return quizRepo.findById(id).get();
    }

 /*   @PostMapping("/quiz")
    public Answer postQuiz(@RequestParam(name="answer") int answer) {
        if (answer != 2) {
            return new Answer(false, "Wrong answer :(");
        } else {
            return new Answer(true, "Congratulations, you're right!");
        }
    } */

    @PostMapping("/quiz")
    public Quiz postQuiz(@RequestBody Quiz quiz) {
        return quizRepo.save(quiz);
    }



}
