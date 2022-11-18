package com.company;
import java.util.*;

public class Menu {
    static Map<Students, Groups> studentsGroupsMap = new HashMap<Students, Groups>();
    static List<Groups> groupsList = new ArrayList<Groups>();

    public static void menu(){
        groupsList.add(new Groups("PO21"));
        groupsList.add(new Groups("PO22"));
        groupsList.add(new Groups("PO23"));

        int flag = 1;
        Scanner scanner = new Scanner(System.in);
        Students student = null;
        Students student1;
        while(flag == 1) {
            System.out.println("1. Добавить студента");
            System.out.println("2. Добавить группу");
            System.out.println("3. Изменить студента");
            System.out.println("4. Удалить студента");
            System.out.println("5. Удалить группу");
            System.out.println("6. Вывод всех студентов");
            System.out.println("7. Выход");
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
                    student = new Students(name, surname);

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
                    System.out.println("Введите имя и фамилию");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    surname = scanner.nextLine();
                    student1 = new Students(name, surname);
                    Groups groupDel = studentsGroupsMap.remove(student1);
                    // System.out.println(student.hashCode() + " " + student1.hashCode() + " " + student.equals(student1));
                    System.out.println(groupDel);
                    // добавить новую запись студента с
                    break;

                case 4:
                    // закомитить код в гидхабе хихихиха
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
