package org.example.oop.dog;

public class Dog {
    private  String nickname;
    private String breed;
    private int speed;

    public Dog(String nickname, String breed, int speed) {
        this.nickname = nickname;
        this.breed = breed;
        this.speed = speed;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void toRun(){
        for (int i = 0; i < getSpeed() ; i++) {
            System.out.print(" бегу ");
        }
    }
    public String info(){
        return "Кличка: " + nickname + "\nПорода: " + breed + "\nСкорость: " + speed;
    }
}
