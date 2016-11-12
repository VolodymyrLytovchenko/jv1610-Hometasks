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
        int value = 87;
        System.out.println(getStringFromNumber(value));
    }
        
    static String getStringFromNumber(int value){
        if(value < 10){
            return getOneDigitPresentation(value);
        }
        if(value>10 && value<20){
            return getTwoDigitPresentation1(value);
        }
 
        if(value>20 && value<=99){
            return getTwoDigitPresentation2(value);
        }
        return getStringFromNumber(value);
    }
      
    static String getOneDigitPresentation (int value){
        switch (value){
            case 0:
               return "ноль";
            case 1:
               return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
        }
        return "ноль";
    }
    
    static String getTwoDigitPresentation1(int value){
        switch (value){
                case 10:
                    return "десять";
                case 11:
                    return "одинадцать";
                case 12:
                    return "двенадцать";
                case 13:
                    return "тринадцать";
                case 14:
                    return "четырнадцать";
                case 15:
                    return "пятнадцать";
                case 16:
                    return "шестнадцать";
                case 17:
                    return "семнадцать";
                case 18:
                    return "восемнадцать";
                case 19:
                    return "девятнадцать";
            }
        return "ноль";
    }
        
        static String getTwoDigitPresentation2(int value){
        int firstDigit = value / 10; // целая часть от деления на десять
        int secondDigit = value % 10; // остаток от деления на десять
        
        String totalString = "";
        switch (firstDigit){
            case 2:
                totalString = "двадцать  ";
                break;
            case 3:
                totalString = "тридцать ";
                break;
            case 4:
                totalString = "сорок  ";
                break;
            case 5:
                totalString = "пятьдесят  ";
                break;
            case 6:
                totalString = "шестьдесят ";
                break;
            case 7:
                totalString = "семьдесят ";
                break;
            case 8:
                totalString = "восемьдесят ";
                break;
            case 9:
                totalString = "девяносто ";
                break;
        }
        if(secondDigit !=0){
        totalString +="" + getOneDigitPresentation(secondDigit);
        }
        return totalString;
    }
}  

   

