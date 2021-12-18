package com.pb.panasjuk.hw11;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Paths;
import java.util.List;

public class DeserialMain {
    public static void main(String[] args) throws Exception {
        File file = Paths.get("files/abonent.data").toFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Abonent> list = (List<Abonent>) objectInputStream.readObject();

        System.out.println(list);
    }
}
