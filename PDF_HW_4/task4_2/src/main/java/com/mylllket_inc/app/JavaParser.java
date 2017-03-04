package com.mylllket_inc.app;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaParser {
    private String path;
    private FileReader fr = null;
    private BufferedReader br = null;
    private String data = null;
    private String template;

    private static int fileId = 0;


    public JavaParser(String path) throws FileNotFoundException {
        this.path = path;
    }

    public String read() throws IOException {
        this.fr = new FileReader(this.path);
        this.br = new BufferedReader(fr);
        String line;
        StringBuilder result = new StringBuilder();
        while ((line = br.readLine()) != null) {
            result.append(line + "\n");
        }
        if (br != null)
            br.close();

        if (fr != null)
            fr.close();
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

        FileWriter fw = new FileWriter("./src/main/java/com/mylllket_inc/app/" + fileId + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(hashMap.toString());
        if (bw != null)
            bw.close();

        if (fw != null)
            fw.close();
    }
}
