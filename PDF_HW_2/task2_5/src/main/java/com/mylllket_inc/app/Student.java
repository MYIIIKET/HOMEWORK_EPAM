package com.mylllket_inc.app;


import java.util.ArrayList;
import java.util.List;

public class Student<T extends Discipline> implements Addable, Marks {
    private String name;
    private Discipline[] discipline;
    private int size = 0;
    private List<Number> mark = new ArrayList<Number>();

    private static int global_id = 0;
    private int id = 0;

    public Student(String name) {
        global_id++;
        id = global_id;
        this.name = name;
    }

    public void addDiscipline(Discipline discipline) {
        size++;
        Discipline[] tmp = new Discipline[size];
        Student.this.discipline = (Discipline[]) add(Student.this.discipline, tmp, discipline);
        size = Student.this.discipline.length;
    }


    private Discipline getDiscipline(Discipline discipline) {
        for (int i = 0; i < size; i++) {
            if (this.discipline[i].equals(discipline))
                return this.discipline[i];
        }
        return null;
    }


    public void setMark(Discipline discipline, Number mark) {
        if (getDiscipline(discipline) != null) {
            addMark(mark);
            getDiscipline(discipline).addMark(mark);
        }
    }

    @Override
    public void addMark(Number data) {
        mark.add(data);
    }

    @Override
    public List getMarks() {
        return this.mark;
    }

    public String getInfo() {
        StringBuilder result = new StringBuilder();
        result.append("Name: " + this.name + " ID: " + this.id + "\n");
        for (int i = 0; i < size; i++) {
            result.append("\tDiscipline: " + this.discipline[i] + "\n");
            result.append("\t\tMarks: " + this.discipline[i].getMarks() + "\n");
        }
        return result.toString();
    }
}
