package com.pb.panasjuk.hw7;

public class Atelier {
    public static void main(String[] args) {
        //футболка
        Tshirt tshirt = new Tshirt();
        tshirt.setName("Футболка");
        tshirt.setSize("XXS");
        tshirt.setPrice(360);
        tshirt.setColor("Красная");

        //штаны
        Pants pants = new Pants();
        pants.setName("штаны");
        pants.setSize("XS");
        pants.setPrice(250);
        pants.setColor("Синие");

        //юбка
        Skirt skirt = new Skirt();
        skirt.setName("юбка");
        skirt.setSize("S");
        skirt.setPrice(500);
        skirt.setColor("Красная");

        //галстук
        Tie tie = new Tie();
        tie.setName("галстук");
        tie.setSize("M");
        tie.setPrice(300);
        tie.setColor("Черный");

    }
}
