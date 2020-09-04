package com.example.webquizengine;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class QuizController {

    @GetMapping("/quiz")
    public Quiz quiz()
    {
        Quiz result = new Quiz("title", "some text", new String[] {"Robot", "Tea Leaf", "Cup of coffee", "Bug"});
        return result;
    }

    @PostMapping("/quiz")
    public Answer postQuiz(@RequestParam(name="answer") int answer) {
        if (answer != 2) {
            return new Answer(false, "Wrong answer :(");
        } else {
            return new Answer(true, "Congratulations, you're right!");
        }
    }


}
