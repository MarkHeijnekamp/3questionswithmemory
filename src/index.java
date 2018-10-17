import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class index {

        private static final String FILENAME = "calculatordata.txt";

        public static void main(String[] args) {

            // Geef de gebruiker een boodschap of de file al bestaat of juist niet
            if (fileExists()) {
            }

            readMyDataAndWriteDataToFile();

        }



        public static void readMyDataAndWriteDataToFile() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("what is your age ?");
            System.out.println();
            String age = scanner.nextLine();

            System.out.println("what is your eye color ?");
            System.out.println();
            String eyecolor = scanner.nextLine();

            System.out.println("what is your name ?");
            System.out.println();
            String name = scanner.nextLine();

            writeToFile(, );

        }


        // Aan de hieronder code hoef je niets meer te doen behalve te
        // begrijpen wat er gebeurd.

        public static Boolean fileExists() {
            Boolean exists;
            File fileName = new File(FILENAME);

            if (fileName.exists()) {
                exists = true;
            } else {
                exists = false;
            }

            return exists;
        }

        public static void writeToFile(String age, String name) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

                String content = name + "\n";
                bw.write(content);
                bw.write(age + "\n");


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


