package org.example.oop.myCollections;

public class Main {
    public static void main (String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Ваня");
        employees.add("Дима");
        employees.add("Максим");
        employees.add("Ирина");
        employees.add("Алексей");
//        for (int i = 1; i < 100; i++) {
//            employees.add("Сотрудник " + i);
//        }

//        employees.remove(3);
        employees.remove("Игорь");
        employees.remove("Игоь");

        for (int i = 0; i < employees.getSize() ; i++) {
            System.out.println(employees.get(i));
        }
    }
}
