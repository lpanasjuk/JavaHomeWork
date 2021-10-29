package com.pb.panasjuk.hw4;
import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String vs = sc.nextLine();

        String[] vsParts = vs.split(" ");
        // Вывод результата на экран
         for(int i = 0; i < vsParts.length; i++) {
         String vsParts2 = (vsParts[i].substring(0, 1).toUpperCase() + vsParts[i].substring(1) + " ");
         System.out.print(vsParts2);
}


 }


}

