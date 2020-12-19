package com.example.seriesFunctions;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {


    public static void main(String[] args) {

        Map<String, String> language = new HashMap<>();

        language.put("Java", "a compiled high level, object-oriented, platform independent language");
        language.put("Python", "an interpreted, high level programming language with dynamic semantics");
        language.put("Algol","an algorithmic language");
        language.put("basic", "beginner language");
        language.put("Lisp", "low end language");
        System.out.println(language.put("Java", "this course is about Java"));
        if (language.containsKey("Java")) {

            System.out.println("Java is already in the map");
        } else {

            language.put("Java", "New language added");
        }
        System.out.println(language.get("Java"));
        System.out.println("==========================");

        for (String key: language.keySet()) {

            System.out.println(key + " : " + language.get(key));
        }
    }
}
