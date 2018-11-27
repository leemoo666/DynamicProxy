package com.lxm.proxy.four;

import com.lxm.proxy.three.Person;

public class Student extends Person {
    public String desc;
    private String wifeName;
    public Student(int id, String name) {
        super(id, name);
    }

    public Student(int id, String name, boolean sex) {
        super(id, name, sex);
    }

}
