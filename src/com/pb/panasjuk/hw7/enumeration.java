package com.pb.panasjuk.hw7;

public class enumeration {
    private Size description;
    private Size euroSize;

    public enumeration(Size description, Size euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public void getDescription() {
        System.out.println( description);
    }

    public void getEuroSize() {
        System.out.println(euroSize);
    }



}
