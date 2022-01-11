package day31_Constructors;

import day02_HelloWorld.WhatILearnedToday;

public class Person {

    public String name;
    public char gender;
    public int age;

    public Person(String name,char gender,int age){
        this.name=name;
        this.age=age;
        this.gender=gender;


    }



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
