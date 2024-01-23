package app;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter distance");
        Scanner number = new Scanner(System.in);
        double a = number.nextInt();
        System.out.println("1) ml -> km\n" +  "2) km -> ml");
        Scanner choice = new Scanner(System.in);
        int b = choice.nextInt();
        if (b == 1){
            Main obj = new Main();
            obj.mlInKm(a);
        }
        if (b == 2){
            Main obj1 = new Main();
            obj1.kmInMl(a);
        }
        if (b != 1 && b != 2)
            System.out.println("error");

    }
    public void mlInKm(double a){
        double result = a * 1.61;
        System.out.println("distance in km = " + result);
    }
    public void kmInMl(double a){
        double result = a * 0.6214;
        System.out.println("distance in ml = " + result);
    }
}