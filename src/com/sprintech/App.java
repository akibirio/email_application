package com.sprintech;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int age = 30;
        String name = "Ayub Kibirio";
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now + ": Hello " + name.toUpperCase() + ". You are "+age+ " Years Old");
        System.out.println(name.toLowerCase().charAt(0));
        System.out.println(Math.sqrt(age));

        //Arrays
        int[] numbers = {3, 8, 9, 90, 36, 1 };
        for(int i=0; i< numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }

   System.out.println();

        //
        // int num = 0;
        // ++num;
        // System.out.println(num);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats you Name?");
        String nameF = scanner.nextLine();
        System.out.println("You name is : " + nameF);

        scanner.close();

            
    }
}

