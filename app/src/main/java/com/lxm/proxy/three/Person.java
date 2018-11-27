package com.lxm.proxy.three;

public class Person {

    public int grade;
    private int id;
    private String name;
    private boolean sex;

    public Person(int id, String name, boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }



    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private Person(boolean sex) {
        this.sex = sex;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        System.out.println("Person{" +
                "grade=" + grade +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}');

        return "Person{" +
                "grade=" + grade +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
