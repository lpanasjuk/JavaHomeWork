package com.pb.panasjuk.hw7;

public class enumeration {
    private Size description;
    private Size euroSize;

    public enumeration(Size description, Size euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }
/*
    public void getDescription() {
        if(Size.XXS) {
            System.out.println(Size.XXS + " " + description);
        } else if (Size.XS) {
            System.out.println(Size.XS + " " + description);
        } else if (Size.S) {
            System.out.println(Size.S + " " + description);
        } else if (Size.M) {
            System.out.println(Size.M + " " + description);
        } else {
            System.out.println(Size.S + " " + description);
        }

    }
*/
    public void getEuroSize() {
        System.out.println(euroSize);
    }



}
