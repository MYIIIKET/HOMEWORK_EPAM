package com.mylllket_inc.app;

import junit.framework.TestCase;


public class FilmClassTest extends TestCase {
    public void testDeserialize() throws Exception {
        FilmClass a = new FilmClass();
        a=a.deserialize("./src/main/java/com/mylllket_inc/app/filmArchive.pkg");
        System.out.println(a.getActorByFilm("ddd"));
    }

    public void testSerialize() throws Exception {
        FilmClass a = new FilmClass();
        a.addActor("aaa", "bbb");
        a.addActor("aaa", "ccc");
        a.addActor("eee", "ddd");
        a.serialize("./src/main/java/com/mylllket_inc/app/filmArchive.pkg");
    }

    public void testAddActor() throws Exception {
        FilmClass a = new FilmClass();
        a.addActor("aaa", "bbb");
        a.addActor("aaa", "ccc");
        a.addActor("eee", "ddd");
    }

}