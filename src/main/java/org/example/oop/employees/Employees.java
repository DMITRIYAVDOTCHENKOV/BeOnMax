package org.example.oop.employees;
//Создать класс работник, в котором будет 3 поля: имя, должность и зарплата.
// В конструкторе с параметрами проинициализировать все поля.
// метод с параметром int, тип возвращаемого значения - String, который возвращает информацию о сотруднике,
// а также о сумме зарплаты, которую он получил за i месяцев (значение i передается в качестве параметра).
//Продемонстрировать работу методов в классе Main.

public class Employees {
    String name;
    String post;

    int salary;

    public Employees (String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String info (int number) {
        return "Сотрудник: " + name + "на должности: " + post + "Получает: " + salary +"т.р." + "\n" + "Через " + number
                + " месяцев " + "Он получит: " + (salary * number);
    }



}
