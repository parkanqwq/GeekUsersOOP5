package com.company.model;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(){

    }

    public Employee(String fullName, String position, String email, String number, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
        changeNumber(number);
    }

    public void infoEmployee(){
        changeEmail(email);
        changeAge(age);
        System.out.println("\nФИО: " + fullName + "\nДолжность: " + position + "\nЭлектронная почта: " + email +
                "\nТелефон: " + number + "\nЗарплата: " + salary + " рублей" + "\nВозраст: " + age);
    }

    private void changeAge(int age) {
        this.age = age;
        if (age < 0) System.out.print("\nВозраст не может быть меньше нуля!");
        else if (age < 18) System.out.print("\nНесовершеннолетний " + fullName + " не может работать тут!");
    }

    private void changeEmail(String email) {
        this.email = email;
        char dog = '@';
        int task = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == dog) task++;
        }
        if (task != 1) {
            this.email = "некоректный email - " + email;
        }
    }

    private void changeNumber(String number){
        this.number = number;
        String numberRight = "+7(";
        numberRight = numberRight + number.charAt(1) + number.charAt(2) + number.charAt(3) + ")-" +
        number.charAt(4) + number.charAt(5) + number.charAt(6) + "-" + number.charAt(7) + number.charAt(8) +
        "-" + number.charAt(9) + number.charAt(10);
        this.number = numberRight;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("\nВозраст не может быть меньше нуля!\nВозраст сотрудника "
            + fullName + " неизменен!");
            return;
        }
        this.age = age;
    }
}
