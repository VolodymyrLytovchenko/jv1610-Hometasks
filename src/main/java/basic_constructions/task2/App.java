package basic_constructions.task2;

/**
 *
 * @author Владимир
 * 
 * Используя конструкцию switch, простейшие арифметические операции и 
 * операции сравнения реализовать приложение, которое выводит в консоль текстовое 
 * представление случайного целого числа в диапазоне от 0 до 99 включительно.
 */
public class App {
    public static void main(String[] args) {
        int value = 15;
        
        if(value < 10){
            getOneDigitPresentation(value);
        }else{
            getTwoDigitPresentation(value);
        }
    }
      
    static String getOneDigitPresentation (int value){
        switch (value){
            case 0:{
               System.out.println("ноль");
            }break;
            case 1:{
                System.out.println("один");
            }break;
            case 2:{
                System.out.println("два");
            }break;
            case 3:{
                System.out.println("три");
            }break;
            case 4:{
                System.out.println("четыре");
            }break;
            case 5:{
                System.out.println("пять");
            }break;
            case 6:{
                System.out.println("шесть");
            }break;
            case 7:{
                System.out.println("семь");
            }break;
            case 8:{
                System.out.println("восемь");
            }break;
            case 9:{
                System.out.println("девять");
            }break;     
        }
        return null;
    }
    
    static String getTwoDigitPresentation(int value){
        switch (value){
                case 10:{
                    System.out.println("десять");
                }break;
                case 11:{
                    System.out.println("одинадцать");
                }break;
                case 12:{
                    System.out.println("двенадцать");
                }break;
                case 13:{
                    System.out.println("тринадцать");
                }break;
                case 14:{
                    System.out.println("четырнадцать");
                }break;
                case 15:{
                    System.out.println("пятнадцать");
                }break;
                case 16:{
                    System.out.println("шестнадцать");
                }break;
                case 17:{
                    System.out.println("семнадцать");
                }break;
                case 18:{
                    System.out.println("восемнадцать");
                }break;
                case 19:{
                    System.out.println("девятнадцать");
                }break;
            }
        
        int firstDigit = value / 10; // целая часть от деления на десять
        int secondDigit = value % 10; // остаток от деления на десять
        
        String totalString = "";
        switch (firstDigit){
            case 2:
                totalString = "двадцать";
            case 3:
                totalString = "тридцать";
            case 4:
                totalString = "сорок";
            case 5:
                totalString = "пятьдесят";
            case 6:
                totalString = "шестьдесят";
            case 7:
                totalString = "семьдесят";
            case 8:
                totalString = "восемьдесят";
            case 9:
                totalString = "девяносто";
        }
        if(secondDigit !=0){
        totalString +="" + getOneDigitPresentation(secondDigit);
        }
        return totalString;
    }
}  

   

