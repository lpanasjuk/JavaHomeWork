package com.pb.panasjuk.hw7;


public class Atelier {
    public static void main(String[] args) {
        //футболка
        Clothes tshirt = new Tshirt();
        tshirt.setName("Футболка");
        tshirt.setSize(Size.XXS);
        tshirt.setPrice(360);
        tshirt.setColor("Красная");


        //штаны
        Clothes pants = new Pants();
        pants.setName("Штаны");
        pants.setSize(Size.XS);
        pants.setPrice(250);
        pants.setColor("Синие");

        //юбка
        Clothes skirt = new Skirt();
        skirt.setName("Юбка");
        skirt.setSize(Size.S);
        skirt.setPrice(500);
        skirt.setColor("Красная");

        //галстук
        Clothes tie = new Tie();
        tie.setName("Галстук");
        tie.setSize(Size.M);
        tie.setPrice(300);
        tie.setColor("Черный");


//массив Clothes со всеми видами одежды
        Clothes[] clothes = new Clothes[]{tshirt, pants, skirt, tie};
        dressWomen(clothes);
        dressMan(clothes);

    }



//два статических метода
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




    }

