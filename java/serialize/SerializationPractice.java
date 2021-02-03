package serialize;

import java.io.*;

public class SerializationPractice {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person vladimir = new Person("Vladimir", 37);
        System.out.println("Before serialization" + vladimir);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/vladimir.out"));

        objectOutputStream.writeObject(vladimir);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/vladimir.out"));

        Object objVladimir = objectInputStream.readObject();
        Person vladimirAfterSer = (Person) objVladimir;

        System.out.println("After serialization" + vladimirAfterSer);



    }
}
