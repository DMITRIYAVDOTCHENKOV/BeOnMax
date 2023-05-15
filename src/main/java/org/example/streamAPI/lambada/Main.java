package org.example.streamAPI.lambada;

public class Main {
    public static void main(String[] args) {

        Director director1 = new Director();
        Director director2 = new Director();
        ////////////////////////
        System.out.println("Вариант 1 : ");
        System.out.println(" ");
        String result = director1.force((int n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Working....");
            }
            return "Success";
        }, 6);
        System.out.println(result);


        System.out.println(" ");
        System.out.println(" ");

        ///////////////////////////
        System.out.println("Вариант 2 : ");
        System.out.println(" ");
        Worker worker = (int n1) -> {
            for (int i = 0; i < n1; i++) {
                System.out.println("Working2...");
            }
            return "Success2";
        };
        String result2 = director2.force(worker, 4);
        System.out.println(result2);
//        director1.force(new Worker() {
//            @Override
//            public void work() {
//                System.out.println("Я работаю!!");
//            }
//        });
//
//        director2.force(() -> System.out.println("Я работаю!!"));
    }
}
