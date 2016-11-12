package basic_constructions.task4;


import java.util.Random;


/**
 *
 * @author Владимир
 * 
 * Создать одномерный массив на n элементов, заполнить его случайными 
 * числами. Реализовать методы, позволяющие: 
 * - вывести все элементы массива в прямом и обратном порядке 
 * - вывести все четные элементы массива 
 * - вывести все нечетные элементы массива 
 * - сумму элементов, кратных 7 
 * - произведение элементов, кратных 3
 */
public class App {
    public static void main(String[] args) {
        
        int sum = 0;
        int multiplication = 1;
        Random rand = new Random();
        int[] array = new int [15];
        
        System.out.print("Элементы массива: ");
        for(int i=0; i<array.length; i++){
            array [i] = rand.nextInt(100);
            System.out.print(array [i]+" ");
        }
        System.out.println("");
        
        System.out.print("Элементы массива в обратном порядке: ");
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array [i]+" ");
        }
        System.out.println("");
        
        System.out.print("Четные элементы массива: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2 == 0){
                System.out.print(array [i]+" ");
            }
        }
        System.out.println("");
            
        System.out.print("Нечетные элементы массива: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2 != 0){
                System.out.print(array [i]+" ");
            }
        }
        System.out.println("");
////////////////////////////////////////////////////////////////////        
        System.out.print("Элементы массива, кратные 7: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%7 == 0){
            System.out.print(array [i]+" ");
            }
        }
        for(int num : array){
            if(num%7 == 0){
                sum=sum+num;
            }
        }
        System.out.println("");
        System.out.print("Сумма элементов, кратных 7: " + sum);
        System.out.println("");
/////////////////////////////////////////////////////////////////////        
        System.out.print("Элементы массива, кратные 3: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%3 == 0){
            System.out.print(array [i]+" ");
            }
        }
        for(int num : array){
            if(num%3 == 0){
                multiplication=multiplication*num;
            }
        }
        System.out.println("");
        System.out.print("Произведение элементов, кратных 3: " + multiplication);
    }    
    
}