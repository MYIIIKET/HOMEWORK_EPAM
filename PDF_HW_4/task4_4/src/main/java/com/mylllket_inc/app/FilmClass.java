package com.mylllket_inc.app;

import java.io.*;
import java.util.HashMap;

public class FilmClass implements Serializable {
    private HashMap<String, String> filmArchive = new HashMap<String, String>();
    private FilmClass obj;

    public void addActor(String name, String film) {
        filmArchive.put(film, name);
    }

    public String getActorByFilm(String film) {
        return filmArchive.get(film);
    }

    public void serialize(String path) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this);
        out.close();
        fileOut.close();
    }

    public FilmClass deserialize(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        obj = (FilmClass) in.readObject();
        in.close();
        fileIn.close();
        return obj;
    }
}
