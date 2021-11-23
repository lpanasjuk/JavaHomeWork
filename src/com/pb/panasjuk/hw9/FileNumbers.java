package com.pb.panasjuk.hw9;
import java.io.*;
import java.util.Scanner;

public class FileNumbers {

//метод createNumbersFile
    public void createNumbersFile() throws Exception{

//Создает Writer с помощью FileWriter
       try (Writer writer = new FileWriter("files/numbers.txt")) {

//Записываем в файл
            int[][] array = new int[10][10];
            for (int i=0; i< array.length; i++, System.out.println()){
                for (int j=0; j<array.length; j++){
                    array[i][j]=((int) (Math.random()*99+1));
                    System.out.println(array[i][j] + " ");
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
 }

//метод createOddNumbersFile
public void createOddNumbersFile() throws IOException {
            try (Scanner in = new Scanner(new File("files/numbers.txt"))) {
                PrintWriter pw = new PrintWriter(new File("files/odd-numbers.txt"));
                System.out.println("Вывод, с учетом замены целых четных чисел на '0':");
                while (in.hasNextLine()) {
                    Scanner line = new Scanner(in.nextLine()); // Одна строка файла
                    while (line.hasNextInt()) {               // Разберем ее на числа
                        int ch = line.nextInt();              // Очередное число
                        if (ch % 2 == 0) {                    // Если чётное
                            System.out.println("0");          // Чтоб было видно, что делается
                            ch = 0;                           // Заменим его нулём
                        } else
                            System.out.println(ch + " ");     // Чтоб было видно, что делается
                        pw.println(ch + " ");
                    }
                    line.close();                             // Закрываем, чтобы не было утечек
                    pw.println();                             // Строка закончена - перенос строки в вых. файл
                    System.out.println();                     // и на экране

                }
                pw.close();
            } catch (IOException ioException) {
                System.out.println("Файл не записан" + ioException);
            }
  }

}
