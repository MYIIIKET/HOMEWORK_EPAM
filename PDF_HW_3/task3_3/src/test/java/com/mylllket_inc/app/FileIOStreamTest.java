package com.mylllket_inc.app;

import junit.framework.TestCase;

import java.io.File;

//\(Рис\. \d\)?

//[А-ЯA-Z].*[.!?]

public class FileIOStreamTest extends TestCase {
    public void testRead() throws Exception {

        FileIOStream file = new FileIOStream("./src/main/java/com/mylllket_inc/app/file.html");
        String text = file.read();
        String[] arrText = file.getSentencesWithPics(text);
        file.printSentences(arrText);

        System.out.println(file.checkOnPicSequence(text));
    }
}