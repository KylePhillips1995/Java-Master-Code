package com.example.test;

import java.util.HashMap;
import java.util.Map;


public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, OO platform independent language");
        languages.put("C++", "a compiled high level language that is good at memory management");
        languages.put("Python", "an interpreted, OO high level programming language");
        languages.put("algol", "an algorithmic language");
        languages.put("Basic", "a beginners all purposes symbolic instruction code");
        languages.put("Lisp", "therin lies madness");

        System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")){
            System.out.println(languages.get("Java"));

        }
        else{
            languages.put("Java", "an OOP language");
        }

        System.out.println("==================================");

//        languages.remove("Lisp");
        if(languages.remove("algol", "a family of algorithmic languages")){
            System.out.println("algol removed");
        }
        else{
            System.out.println("algo not removed. Key value pair not found");
        }

        System.out.println(languages.replace("Lisp ", " a functioning program language"));
        System.out.println(languages.replace("Scalar", "This will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

//        languages.put("Java", "This is all about java");
//        System.out.println(languages.get("Java"));


    }
}
