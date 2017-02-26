package com.mylllket_inc.app;


import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
//        Locale en = new Locale("en", "US");
        Locale ru = new Locale("ru","ru");
        ResourceBundle rb1 = ResourceBundle.getBundle("Questions", ru);


//        System.out.println(rb1.getString("question_1"));
    }

}
