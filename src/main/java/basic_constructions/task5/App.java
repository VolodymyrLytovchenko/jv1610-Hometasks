package basic_constructions.task5;

import java.util.Random;

/**
 *
 * @author Владимир
 * 
 *  Создать двумерный массив m на n элементов, заполнить его случайными 
 * числами. Реализовать методы, позволяющие: 
 * - распечатать массив в прямом и обратном порядке 
 * - для каждой четной строки вывести все четные элементы массива 
 * - для каждого нечетного столбца вывести все нечетные элементы массива 
 * - сумму всех элементов, кратных 7 в четных строках 
 * - произведение элементов, кратных 3 в нечетных строках 
 */
public class App {
    public static void main(String[] args) {
 
        Random rand = new Random();
        int [][] array = new int [5][6];
        int sum = 0;
        int multiplication = 1;
        
        System.out.println("Массив случайных чисел в прямом порядке: ");
        for(int m =0; m<array.length; m++){
            for(int n=0; n<array[m].length; n++){
                array [m][n] = rand.nextInt(100);
                System.out.print(array[m][n] + "  ");
            }
            System.out.println("");
        }
       
        System.out.println("Массив случайных чисел в обратном порядке: ");
        for(int m =array.length-1; m>=0; m--){
            for(int n=array[m].length-1; n>=0; n--){
                System.out.print(array[m][n] + "  ");
            }
            System.out.println("");
        }
        
        System.out.println("Четные элементы в четных строках массива: ");
        for(int m =0; m<array.length; m++){
            if(m%2 == 0){
                for(int n=0; n<array[m].length; n++){
                    if(array[m][n]%2 ==0){
                        System.out.print(array[m][n] + "  ");
                    }
                } 
            }
            System.out.println("");
        }
        
        System.out.println("Нечетные элементы в нечетных столбцах массива: ");
        for(int m =0; m<array.length; m++){
            for(int n=0; n<array[m].length; n++){
                if(n%2 !=0){
                    if(array[m][n]%2 !=0){
                    System.out.print(array[m][n] + "  ");
                    }
                }
            }

            System.out.println("");
        }
///////////////////////////////////////////////////////////////////////////////        
        System.out.print("Элементы, кратные 7 в четных строках: ");
        for(int m =0; m<array.length; m++){
            if(m%2 == 0){
                for(int n=0; n<array[m].length; n++){
                    if(array[m][n]%7 == 0){
                        System.out.print(array[m][n] + "  ");
                    }
                    if(array[m][n]%7 == 0){
                        sum += array[m][n]; 
                    }
                }
            }
        }
        System.out.println("");
        System.out.print("Сумма элементов, кратных 7 в четных строках: " + sum);
        System.out.println("");
/////////////////////////////////////////////////////////////////////////////////        
        System.out.print("Элементы, кратные 3 в нечетных строках: ");
        for(int m =0; m<array.length; m++){
            if(m%2 != 0){
                for(int n=0; n<array[m].length; n++){
                    if(array[m][n]%3 == 0){
                        System.out.print(array[m][n] + "  ");
                    }
                    if(array[m][n]%3 == 0){
                        multiplication=multiplication*array[m][n];
                    }
                }
            }
        }
        System.out.println("");
        System.out.print("Произведение элементов, кратных 3 в нечетных строках: " + multiplication);
        System.out.println("");
    }
}


    

