package basic_constructions.task6;

/**
 *
 * @author Владимир Литовченко
 * 
 * Используя циклические конструкции и массивы создать “рваный массив” 
 * треугольной формы, реализовать вывод данного массива в виде треугольника в 
 * консоль. Реализовать методы, отражающие данный “треугольник”  
 * - по горизонтали 
 * - по вертикали 
 *  по горизонтали и вертикали одновременно
 */
public class App {
    public static void main(String[] args) {
        
        int[][] array = new int[5][];
        
// Вывод массива
        for(int i=0; i<array.length; i++){
            array [i] = new int [i+1];
        }
        for(int[] x: array){
            for(int y:x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
 // Отражение по горизонтали
        for(int i=array.length-1; i>=0; i--){
            for(int y:array[i]){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        System.out.println("");  
    }
}
