package com.example.webquizengine;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Quiz {

    private String title;
    private String text;
    private String [] options;

}
