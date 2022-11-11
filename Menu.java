package com.company;
import java.util.*;

public class Menu {
    //создать акк, репозиторий и добавить проект туда и дописать по нормальному
    static Map<Students, Groups> studentsGroupsMap = new HashMap<Students, Groups>();
    static List<Groups> groupsList = new ArrayList<Groups>(){{
        Groups group1;
        add(1, group1)); add(2, group1); add(3, "PO23");}};

    public static void menu(){
        int flag = 1;
        Scanner scanner = new Scanner(System.in);
        while(flag == 1) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Добавить группу");
            System.out.println("3. Изменить студента");
            System.out.println("4. Удалить студента");
            System.out.println("5. Удалить группу");
            System.out.println("6. Вывод всех студентов");
            System.out.println("7. Выход");
            // Поместить в 6 пункт вывод словаря из мейна и 7 сделать выход
            System.out.println("Выберите пункт меню:");

            int x = 0;

            try {
                x = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Неверный формат :(");
                menu();
            }

            switch (x) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Введите имя студент");
                    String name = scanner.nextLine();
                    System.out.println("Введите фамилию студент");
                    String surname = scanner.nextLine();
                    Students student = new Students(name, surname);

                    System.out.println("Выберите номер группы из существующих");
                    for (int i = 0; i < groupsList.size(); i++) {
                        System.out.println(i + 1 + ". " + groupsList.get(i));
                    }

                    int id = scanner.nextInt();
                    Groups group = groupsList.get(id - 1);
                    studentsGroupsMap.put(student, group);
                    break;

                case 2:
                    System.out.println("Укажите название группы");
                    scanner.nextLine();
                    String groupName = scanner.nextLine();
                    Groups group1 = new Groups(groupName);
                    groupsList.add(group1);
                    break;

                case 3:
                    System.out.println("3. Изменить студента");
                    break;

                case 4:
                    System.out.println("4. Удалить студента");
                    break;

                case 5:
                    System.out.println("5. Удалить группу");
                    break;

                case 6:
                    showTable(studentsGroupsMap);
                    break;

                case 7:
                    System.out.println("Выход...");
                    flag = 0;
                    break;

                default:
                    System.out.println("Такого пункта меню нет :(");
            }
        }
    }

    static void showTable(Map <Students,Groups> studentsGroupsMap){
        System.out.print("\t\t Студент \t\t Группа\n");
        for (Map.Entry<Students, Groups> mapEntry : studentsGroupsMap.entrySet()) {
            System.out.printf("%20s  |  %s\n",mapEntry.getKey(), mapEntry.getValue());
        }
    }
}