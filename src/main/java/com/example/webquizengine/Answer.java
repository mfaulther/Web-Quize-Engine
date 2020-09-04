package com.example.webquizengine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
public class Answer {

    private boolean success;
    private String feedback;

}
