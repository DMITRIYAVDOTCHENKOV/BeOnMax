package org.example.oop.man;

public class Man {
    private String name;
    private String post;
    private int age;
    private double height;

    public Man (String name, String post, int age, double height) {
        this.name = name;
        this.post = post;
        this.age = age;
        this.height = height;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getPost () {
        return post;
    }

    public void setPost (String post) {
        this.post = post;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double height) {
        this.height = height;
    }

    @Override
    public String toString () {
        return "Man{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
