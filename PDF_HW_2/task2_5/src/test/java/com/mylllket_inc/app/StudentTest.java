package com.mylllket_inc.app;

import junit.framework.TestCase;


public class StudentTest extends TestCase {

    public void testAddDiscipline() throws Exception {
        Student s = new Student("aaa");
        Student s2 = new Student("bbb");

        s.addDiscipline(Discipline.PROPERTY_PROTECTION);
        s.addDiscipline(Discipline.PROPERTY_PROTECTION);
        s.addDiscipline(Discipline.CRYPTOGRAPHIC_METHODS_OF_INFORMATION_PROTECTION);
        s.setMark(Discipline.PROPERTY_PROTECTION, 5);
        s.setMark(Discipline.MODELING, 4);
        s.setMark(Discipline.CRYPTOGRAPHIC_METHODS_OF_INFORMATION_PROTECTION, 3);
        s.setMark(Discipline.CRYPTOGRAPHIC_METHODS_OF_INFORMATION_PROTECTION, 5);
        s.setMark(Discipline.CRYPTOGRAPHIC_METHODS_OF_INFORMATION_PROTECTION, 5);

        s2.addDiscipline(Discipline.HARDWARE_AND_SOFTWARE_DATA_PROTECTION);
        s2.setMark(Discipline.HARDWARE_AND_SOFTWARE_DATA_PROTECTION, 4);
        s2.setMark(Discipline.HARDWARE_AND_SOFTWARE_DATA_PROTECTION, 5);
        s2.setMark(Discipline.HARDWARE_AND_SOFTWARE_DATA_PROTECTION, 3);
        s2.addDiscipline(Discipline.MODELING);
        s2.setMark(Discipline.MODELING, 3);
        s2.setMark(Discipline.MODELING, 3);
        s2.setMark(Discipline.MODELING, 5);
        s2.setMark(Discipline.MODELING, 7);
        System.out.println(s.getInfo());
        System.out.println(s2.getInfo());
    }

    public void testGetDiscipline() throws Exception {

    }

}