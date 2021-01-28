package com.company;

import com.company.model.Employee;

public class Main {

    private static Employee[] empArray = new Employee[5];

    public static void main(String[] args) {

        filling();
        task5();

    }

    private static void task5(){
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40)
                empArray[i].infoEmployee();
        }
    }

    private static void filling() {
        empArray[0] = new Employee("Иванов Александр Иванович", "Менеджер по Сковородкам",
                "ivanov@dishes.com", "89251934454", 38000, 25);

        empArray[1] = new Employee("Метелев Максим Иванович", "Менеджер по Тарелкам",
                "metelev@dishes.com", "89252124563", 45000, 36);

        empArray[2] = new Employee("Гагарин Иван Иванович", "Менеджер по Закупкам",
                "gagarin@dishes.com", "89991243636", 52000, 45);

        empArray[3] = new Employee("Медведев Александр Вячеславович", "Гениральный Директор",
                "medvedev@dishes.com", "89991233333", 450000, 51);

        empArray[4] = new Employee("Сафронов Артем Максимович", "Консультант Зала",
                "safronov@dishes.com", "89034032548", 24000, 21);
    }
}
