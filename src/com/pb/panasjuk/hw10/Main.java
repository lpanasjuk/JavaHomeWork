package com.pb.panasjuk.hw10;

public class Main {
    public static void main(String[] args) {

        NumBox<Float> numbox = new NumBox<>(3);
        try {
            numbox.add(0, 5.0F);
            numbox.add(1, 3.1F);
            numbox.add(2, 5.7F);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен! ");
            e.printStackTrace();
        }
        System.out.println(numbox.get(0));
        System.out.println(numbox.get(1));
        System.out.println(numbox.get(2));

        System.out.println("------------------");

        NumBox<Double> numbox2 = new NumBox<>(2);
        try {
        numbox2.add(0,3.8);
        numbox2.add(1,1.4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен! ");
            e.printStackTrace();
        }
        System.out.println(numbox2.get(0));
        System.out.println(numbox2.get(1));
        System.out.println("В массиве заполнено элементов - " + numbox2.length());
        System.out.println("Среднее арифметическое элементов массива - " + numbox2.average());
        System.out.println("Сумма всех эелементов массива - " + numbox2.sum());
        System.out.println("Максимальный элемент массива - " + numbox2.max());



    }
}



    /*

       NumBox<java.lang.Float> floatNumBox = new NumBox<>(5);
        try {
            floatNumBox.add(0,4.1F);
            floatNumBox.add(1,5.3F);
            floatNumBox.add(2,7.3F);
            floatNumBox.add(3,2.3F);
            floatNumBox.add(4,6.3F);
        } catch (Exception e) {
            System.out.println("В массиве нет места");
            try {
                float float0 = floatNumBox.get(0);
                float float1 = floatNumBox.get(1);
                float float2 = floatNumBox.get(2);
                float float3 = floatNumBox.get(3);
                float float4 = floatNumBox.get(4);

                System.out.println(float0);
                System.out.println(float1);
                System.out.println(float2);
                System.out.println(float3);
                System.out.println(float4);
            } catch (IndexExeption e) {
                System.out.println("Шось не те ");
                return;
            }
            }
     */