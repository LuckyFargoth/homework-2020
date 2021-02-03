package homeworks.iostreams;

import java.io.*;

public class TextReader {

    public static void main(String[] args) throws IOException {
        int noteCapacity = 0;
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("enter file name below");
        String fileName = null;
        try {
            fileName = reader.readLine() + ".txt";
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("fileName = " + fileName);
        System.out.println("Enter file path");
        String filePath = null;
        try {
            filePath = reader.readLine() + '/';
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("filePath = " + filePath + fileName);
        File file = new File(filePath + fileName);


        while (true) {
            int input = 0;
            System.out.println("============ Menu ==============");
            System.out.println("Press 1 to write note \n" +
                    "Press 2 to view notes \n" +
                    "Press 0 to exit");
            try {
                input = Integer.parseInt(reader.readLine());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            if (input == 1) {
                writeNote(file, noteCapacity);
                noteCapacity++;
            } else if (input == 2) {
                printFileContent(file);
            } else {
                System.err.println("Wrong input! Enter a number please");
            }
        }


    }

    public static void writeNote(File file, int noteCapacity) throws IOException {
        if (noteCapacity <= 10) {
            System.out.println("Enter your note!");
            System.out.println("WARNING! NOTES ARE LIMITED! ONLY 10 AVAILABLE! \n" +
                     + (10 - noteCapacity) + " notes left" );

            BufferedReader noteReader = new BufferedReader(new InputStreamReader(System.in));
            String note = noteReader.readLine();
            try (FileWriter fw = new FileWriter(file, true)) {
                PrintWriter out = new PrintWriter(fw);
                out.println(note);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Note limit reached!");
        }
    }


    public static void printFileContent(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

}
