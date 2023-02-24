package org.example.oop.box;

public class Main {
    public static void main (String[] args) {


        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(1, 2, 3);

        Box box3 = new Box(box1,box2);
        Box box4 = new Box(box3);

        System.out.println(box3.toString());
        System.out.println(box4.toString());
    }
}
