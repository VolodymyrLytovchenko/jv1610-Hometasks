package jv1610.hometasks.simple_data_types.task2;

/**
 *
 * @author Владимир Литовченко
 * 
 * Задание 2
 * Используя числовые типы данных создать программу, которая расчитывает
 * - длину окружности
 * - площадь окружности
 * - площадь кольца
 */
public class App {
    public static void main(String[] args) {

        double pi = 3.14;
        double r = 10, R = 20, l, So, Sk;
        
        l = 2 * pi * R;
        So = pi * R * R;
        Sk = pi * (R * R - r * r);
                
                System.out.println("Длина окружности равна: " + l);
                System.out.println("Площадь окружности равна: " + So);
                System.out.println("Площадь кольца равна: " + Sk);
    }
}
