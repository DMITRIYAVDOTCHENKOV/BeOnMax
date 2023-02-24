package org.example.oop.rect;

public class Rect {
    double width;
    double height;


    public Rect (double width, double height) {
        this.width = width;
        this.height = height;
    }

    double area () {
        return width * height;
    }
    double perimeter() {
        return (width + height) * 2;
    }
}
