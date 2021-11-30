public class HomeWork2 {
    public static void main(String[] args) {

    }

    public static boolean checkSumBetween(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    public static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean positiveOrNegativeNumber2(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void printString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }
}
