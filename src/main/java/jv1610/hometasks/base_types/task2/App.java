package jv1610.hometasks.base_types.task2;

/**
 *
 * @author Владимир Литовченко
 * 
 * Используя числовые типы данных создать программу, которая рассчитывает:
 * - длину окружности, площадь окружности, площадь кольца
 * - периметр треугольника, площадь треугольника
 * - периметр, площадь прямоугольника
 */
public class App {
    public static void main(String[] args) {
        
//Вычисление длины окружности, площади окружности, площади кольца        
        double pi = 3.14;
        double r = 10, R = 20, l, So, Sk;
        
        l = 2 * pi * R;
        So = pi * R * R;
        Sk = pi * (R * R - r * r);
                
                System.out.println("Длина окружности равна: " + l);
                System.out.println("Площадь окружности равна: " + So);
                System.out.println("Площадь кольца равна: " + Sk);
                
// Вычисление периметра и площади треугольника  

        int a = 18, b = 30, c = 25, h = 15, S, P;
        
        P = a + b + c;
        S = (int) (0.5 * b * h);
        
                System.out.println("Периметр треугольника равен: " + P);
                System.out.println("Площадь треугольника равна: " + S);
                
// Вычисление периметра и полщади прямоугольника 

        int d = 10, e = 20, S1, P1;
        
        P1 = d * 2 + e * 2;
        S1 = d *e;
        
                System.out.println("Периметр прямоугольника равен: " + P1);
                System.out.println("Площадь прямоугольника равна: " + S1);
    }  
}
