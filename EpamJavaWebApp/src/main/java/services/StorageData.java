package services;

import entities.Student;
import java.util.ArrayList;

public class StorageData {

    public static ArrayList<Student> students;

    static {
        students = new ArrayList<>();

        students.add(new Student("Андреева Ирина", 3.48d, false));
        students.add(new Student("Анферова Анастасия", 3.45d, false));
        students.add(new Student("Беднов Андрей", 4.98d, true));
        students.add(new Student("Белозуб Яна", 4.5d, true));
        students.add(new Student("Белоус Алексей>", 3.84d, true));
        students.add(new Student("Котума Андрей", 4.25d, true));
        students.add(new Student("Колодин Денис", 3.08d, false));
        students.add(new Student("Кузьмин Дмитрий", 4.69d, true));
        students.add(new Student("Ланин Иван", 4.62d, false));
        students.add(new Student("Локтев Илья", 3.38d, true));
        students.add(new Student("Павлова Александра", 4.84d, false));
        students.add(new Student("Петров Алексей", 4.18d, false));
        students.add(new Student("Роках Глеб", 4.04d, true));
        students.add(new Student("Салаутин Дмитрий", 3.42d, false));
        students.add(new Student("Семенов Егор", 4.82d, false));
        students.add(new Student("Шкодин Максим", 4.59d, true));
        students.add(new Student("Шмыгин Семен", 3.27d, true));
        students.add(new Student("Амангалиев Артём", 4.18d, false));
        students.add(new Student("Гаджимурадов Руслан", 4.12d, true));
        students.add(new Student("Горячкин Александр", 4.1d, false));
        students.add(new Student("Карпенко Дмитрий", 3.29d, false));
        students.add(new Student("Мартышин Иван", 3.99d, true));
        students.add(new Student("Подкосов Антон", 3.25d, false));
        students.add(new Student("Соседова Виктория", 3.5d, true));
        students.add(new Student("Долгов Денис", 3.11d, false));
        students.add(new Student("Тарасов Олег", 3.09d, false));
        students.add(new Student("Черникова Алина", 4.01d, false));
        students.add(new Student("Кулаков Максим", 3.85d, true));
    }
}

