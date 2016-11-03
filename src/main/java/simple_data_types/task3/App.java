package jv1610.hometasks.simple_data_types.task3;

/**
 *
 * @author Владимир Литовченко
 * 
 * Задание 3
 * Используя данные задания 2 создать программу, которая рассчитывает
 * - объем цилиндра
 * - объем полого цилиндра
 * - площадь боковой поверхности цилиндра (не полого)
 */
public class App {
    public static void main(String[] args) {

        double pi = 3.14;
        double r = 10, R = 20, Sb, h = 10, V, Vp;
        
        V = pi * R * R * h;
        Vp = pi * (R * R - r * r) * h;
        Sb = 2 * pi * R * h;

                System.out.println("Объем цилиндра равен: " + V);
                System.out.println("Объем полого цилиндра равен: " + Vp);
                System.out.println("Площадь боковой поверхности цилиндра равна: " + Sb);
    }
}
