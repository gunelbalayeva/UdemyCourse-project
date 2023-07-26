package udemyCourse_project;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student gunel = new Student("gunel", "letter title.", "gunelbalayeva_");
        Teacher mainTeacher = new Teacher("mainTeacher", "Java SE", "javalessons");
        Teacher teacher2 = new Teacher("teacher2", " Spring Boot", "udemycourse");
        Lesson l1 = new Lesson(1, "Java SE", 30);
        Lesson l2 = new Lesson(2, "JDBC ", 10);
        Lesson l3 = new Lesson(1, " Spring Boot", 20);
        Lesson l4 = new Lesson(1, "SQL ", 45);
        Lesson l5 = new Lesson(1, "PL-SQL", 6);
        Course javaCourse = new Course("Java course ", mainTeacher);
        System.out.println(gunel + " " + mainTeacher+ " "+teacher2);


    }


    public static void courseOpen(LinkedList<Lesson> followLessonList) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        boolean next = true;
        ListIterator<Lesson> iterator = followLessonList.listIterator();
        if ((followLessonList.size() == 0)) {
            System.out.println("Lesson not available..");
        } else {
            Lesson lesson1 = iterator.next();
            System.out.println(" Follow lesson: " + lesson1.getLessonTitle() + " minute: " + lesson1.getMinute());
        }
        showTheMenu();
        while (!exit) {
            System.out.println("Enter the number: ");
            int user = sc.nextInt();
            switch (user) {
                case 0:
                    System.out.println("exits the program");
                    break;
                case 1:
                    if (!next) {
                        next = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }

                    if (iterator.hasNext()) {
                        Lesson lesson1 = iterator.next();
                        System.out.println("==================================================================================");
                        System.out.println("current lesson: " + lesson1.getLessonNo() + " minute: " + lesson1.getMinute());
                        System.out.println("==================================================================================");
                    } else {
                        System.out.println("end of list");
                    }
                    break;
                case 2:
                    if (next) {
                        next = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        Lesson lesson1 = iterator.previous();
                        System.out.println("==================================================================================");
                        System.out.println("current lesson: " + lesson1.getLessonNo() + " minute: " + lesson1.getMinute());
                        System.out.println("==================================================================================");
                    } else {
                        System.out.println("start of list");
                    }
                    break;
                case 3:
                    followList(followLessonList);
                    break;
                case 9:
                    showTheMenu();
                    break;
            }

        }
    }

    private static void followList(LinkedList<Lesson> followLessonList) {
        ListIterator<Lesson> iterator = followLessonList.listIterator();
        if ((followLessonList.size() == 0)) {
            System.out.println("Lesson not available..");
        } else {
            while (iterator.hasNext()) {
                Lesson lesson1 = iterator.next();
                System.out.println(" Follow lesson no: " + lesson1.getLessonNo() + " minute: " + lesson1.getMinute());
            }
        }
    }

    private static void showTheMenu() {
        System.out.println("*********MENU********");
        System.out.println(
                "0. Exit \n" +
                        "1. Next lesson  \n" +
                        "2. Last lesson \n" +
                        "3. Show the list \n" +
                        "9. Show the menu \n");
    }
}