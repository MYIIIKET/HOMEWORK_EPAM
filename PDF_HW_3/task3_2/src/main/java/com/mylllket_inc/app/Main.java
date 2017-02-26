package com.mylllket_inc.app;


import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Question q = new Question("en_US");
        System.out.println(q.getQuestions());
        q.setLocale("ru_RU");
        System.out.println(q.getAnswer(4));
    }

}
