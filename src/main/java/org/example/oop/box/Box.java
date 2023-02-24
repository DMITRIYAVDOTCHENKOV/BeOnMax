package org.example.oop.box;
//В классе Box создать метод, который принимает в качестве параметра объект box, и возвращает новую коробку,
// у которой все размеры равны: размеры вызывающего объекта + размеры переданного объекта.
//
//        Создать конструктор, который принимает 2 коробки. С помощью этого конструктора можно будет создать объект,
//        который по объему больше, чем 2 переданные коробки вместе взятые.
//
//        Продемонстрировать работу метода и конструктора в классе Main в методе main().
public class Box {
    //Все поля объявлены private, все конструкторы и методы public, в процессе программы нам не нужно менять значения
    //ширины, высоты и длины коробки, поэтому оставляем доступ только на чтение, для каждого поля создаем getter

    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    //Ваше решение может отличаться, я сделал так: если мы просто у новой коробки укажем длину и ширину и высоту равную сумме двух коробок,
    //то получившаяся коробка по объему однозначно получится больше суммы тех двух коробок.
    public Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box increase(int i) {
        return new Box(width *i, height * i, length * i);
    }

    public Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    public double volume() {
        return width * height * length;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}