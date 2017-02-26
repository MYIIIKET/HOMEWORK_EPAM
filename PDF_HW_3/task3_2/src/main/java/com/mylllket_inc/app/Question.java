package com.mylllket_inc.app;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Question {

    private static final Locale en = new Locale("en", "US");
    private static final Locale ru = new Locale("ru", "RU");
    private static ResourceBundle rbq = null;
    private static ResourceBundle rba = null;

    private static final String answer = "answer_";
    private static final String question = "question_";

    public Question(String locale) {
        setLocale(locale);
    }

    public void setLocale(String locale) {
        if (locale.equals(en.toString())) {
            rbq = ResourceBundle.getBundle("com.mylllket_inc.app.Questions", en);
            rba = ResourceBundle.getBundle("com.mylllket_inc.app.Answers", en);
        } else {
            rbq = ResourceBundle.getBundle("com.mylllket_inc.app.Questions", ru);
            rba = ResourceBundle.getBundle("com.mylllket_inc.app.Answers", ru);
        }
    }

    public String getQuestions() throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        String s = new String();
        for (int i = 0; i < rbq.keySet().size(); i++) {
            result.append((i + 1) + ": " + rbq.getString("question_" + (i + 1)) + "\n");
        }
        return result.toString();
    }

    public String getAnswer(int qNumber) throws UnsupportedEncodingException {
        if (qNumber < 0 || qNumber > rba.keySet().size())
            return "No such question!";
        return rba.getString("answer_" + qNumber);
    }
}
