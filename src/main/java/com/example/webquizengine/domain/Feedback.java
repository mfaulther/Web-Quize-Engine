package com.example.webquizengine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Feedback {

    private boolean success;
    private String feedback;

}
