package com.mylllket_inc.app;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaParser {
    private String path;

    private String data = null;
    private String template;

    private static int fileId = 0;


    public JavaParser(String path) throws FileNotFoundException {
        this.path = path;
    }

    public String read() throws IOException {
        int content;
        File file = new File(this.path);
        FileInputStream fis = new FileInputStream(file);
        StringBuilder result = new StringBuilder();
        while ((content = fis.read()) != -1) {
            result.append((char) content);
        }
        fis.close();
        return data = result.toString();
    }

    public static void parseJavaCode(String text) throws IOException {
        Map<String, Integer> hashMap = new HashMap<>();
        Pattern pattern;
        Matcher matcher;
        int counter = 0;
        for (int i = 0; i < JavaWords.values().length; i++) {
            pattern = Pattern.compile(JavaWords.values()[i].getName());
            matcher = pattern.matcher(text);
            while (matcher.find() != false) {
                counter++;
            }
            hashMap.put(JavaWords.values()[i].getName(), counter);
            counter = 0;
        }
        fileId++;
        File file = new File("./src/main/java/com/mylllket_inc/app/" + fileId + ".txt");
        FileOutputStream fop = new FileOutputStream(file);
        if (!file.exists()) {
            file.createNewFile();
        }
        fop.write((hashMap.toString() + "\n").getBytes());
        fop.flush();
        fop.close();
    }
}
