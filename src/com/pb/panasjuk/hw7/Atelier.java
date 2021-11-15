package com.pb.panasjuk.hw7;

import com.pb.panasjuk.hw7.Clothes;

public class Atelier {
    public static void main(String[] args) {
        //футболка - Ж
        Clothes tshirt = new Tshirt();
        tshirt.setName("Футболка");
        tshirt.setSize(Size.M);//"M"
        tshirt.setPrice(360);
        tshirt.setColor("Красная");

        //штаны - М
        Clothes pants = new Pants();
        pants.setName("штаны");
        pants.setSize(Size.XS);//"XS"
        pants.setPrice(250);
        pants.setColor("Синие");

        //юбка - Ж
        Clothes skirt = new Skirt();
        skirt.setName("юбка");
        skirt.setSize(Size.S); //"S"
        skirt.setPrice(500);
        skirt.setColor("Красная");

        //галстук - М
        Clothes tie = new Tie();
        tie.setName("галстук");
        tie.setSize(Size.XXS); //"XXS"
        tie.setPrice(300);
        tie.setColor("Черный");


//массив Clothes со всеми видами одежды
        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
        System.out.println("Список всей одежды: ");
        for (Clothes с : clothes) {
            System.out.println(с);
        }
        dressWomen(clothes);
        dressMan(clothes);

    }

//еще двумя статическими методами
        public static void dressWomen(Clothes[] clothes){
            System.out.println("Информация о женской одежде: ");
            for (Clothes сloth: clothes) {
                if (сloth instanceof WomenClothes) {
                    WomenClothes womenClothes = (WomenClothes) сloth;
                    womenClothes.dressWomen();

                }

            }
        }


        public static void dressMan(Clothes[] clothes) {
        System.out.println("Информация о мужской одежде: ");
        for(Clothes cloth: clothes) {
            if (cloth instanceof ManClothes) {
                ManClothes manClothes = (ManClothes) cloth;
                manClothes.dressMan();
            }
        }

        }


        //  System.out.println(skirt.getSize());






    }

