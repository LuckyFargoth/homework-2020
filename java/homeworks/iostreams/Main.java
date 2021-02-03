package homeworks.iostreams;

import java.io.*;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //TODO file reader(10 sentences)

        Person user = new Person("User", "12345678910");
        System.out.println("Before ser " + user);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/userFile"));
        objectOutputStream.writeObject(user);

        ObjectInputStream user1 = new ObjectInputStream(new FileInputStream("src/main/resources/userFile"));

        Object objUser = user1.readObject();
        Person afterSer = (Person) objUser;

        System.out.println("After ser " + afterSer);

        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");
        File temporary = new File("src/main/resources/temp.txt");

        try {
            PrintWriter printWriter = new PrintWriter(file1);
            printWriter.println("text1");
            printWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try {
            PrintWriter printWriter = new PrintWriter(file2);
            printWriter.println("text2");
            printWriter.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


        copy("src/main/resources/file1.txt", "src/main/resources/temp.txt");
        copy("src/main/resources/file2.txt", "src/main/resources/file1.txt");
        copy("src/main/resources/temp.txt", "src/main/resources/file2.txt");


    }

    public static void copy(String a, String b) {
        try {
            String temp = "";
            BufferedReader br = new BufferedReader(new FileReader(a));
            BufferedWriter bw = new BufferedWriter(new FileWriter(b));
            while ((temp = br.readLine()) != null) {
                bw.write(temp);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}










