package com.test;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class Student implements  Cloneable{

    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student(1,"Atmik");
        Student s2 =(Student) s1.clone();
        Student s3 = new Student(s1);
        s3.rollNo =3;
        s3.name ="abc";
        s2.name ="XYZ";
        s2.rollNo =2;

        System.out.println(s1.rollNo+":::Name::"+s1.name);
        System.out.println(s2.rollNo+":::Name::"+s2.name);
        System.out.println(s3.rollNo+":::Name::"+s3.name);
    }


}
