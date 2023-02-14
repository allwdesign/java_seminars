import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;


public class Homework4 {
    public static void main(String[] args) {
        // 1.Save a string to a file and load the output string from the file
        // to the console using the FileWriter and FileReader classes
        String greetingText = "Hi Natalia! Glad to see you!";
        String readText = "";

        FileWriter fileWriter = null;
        FileReader reader = null;
        try {
            fileWriter = new FileWriter("greeting.txt");
            fileWriter.append(greetingText);
            fileWriter.flush();

            reader = new FileReader("greeting.txt");
            while (reader.ready()){
            // .read() return the number of the letter int, so you need to
            // bring to char
            readText += (char) reader.read();
            }
        } catch (IOException e) {
        // Displays an exception message to the console
        System.out.println(e.getMessage());
        }
        // Displays a message to the console
        System.out.println(readText);

        // 2.Load from a file a multi-line text in the format of full name, age
        // and gender separated by spaces. 
        // Split by lines and output to the console in the format "Иванов И.И. 32 М"
        
        readText = "";

        try {
            reader = new FileReader("people.txt");
            while (reader.ready()) {
                readText += (char) reader.read();
            }
            ArrayList<String> surnames = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            ArrayList<String> patronymics = new ArrayList<>();
            ArrayList<Integer> ages = new ArrayList<>();
            ArrayList<String> genders = new ArrayList<>();
            LinkedList<Integer> index = new LinkedList<>();

            // Split by line
            String[] strings = readText.split("\n"); // ["Иванов Иван Иванович 47 Мужчина", "Селезнева Алиса Игоревна 13
                                                     // Женщина", "Сидоров Константин Александрович 85 Мужчина",
                                                     // "Болконская Марья Николаевна 20 Женщина", "Безухов Пётр
                                                     // Кириллович 27 Мужчина"]

            for (int i = 0; i < strings.length; i++) {

                // human: ["Иванов", "Иван", "Иванович", "47", "Мужчина"]
                String[] human = strings[i].split(" ");
                // System.out.println(i + ":" + Arrays.toString(human));
                System.out.println(human[0] +
                        " " + human[1].charAt(0) + "." + human[2].charAt(0) + "." +
                        " " + human[3] + " " + human[4].charAt(0));

                // 3.Upload the text loaded and divided into lines into the prepared lists.
                // Surnames, first names, patronymics, ages and gender in separate lists.
                surnames.add(human[0]);
                names.add(human[1]);
                patronymics.add(human[2]);
                ages.add(Integer.parseInt(human[3]));
                genders.add(human[4]);
                index.add(i);

            }
            System.out.println(surnames);
            System.out.println(names);
            System.out.println(patronymics);
            System.out.println(ages);
            System.out.println(genders);
            System.out.println(index);
            // 4.Sort by age using an optional index list.
            boolean sorted = false;
            int tmp;
            while (!sorted) {
                sorted = true;

                for (int j = 0; j < index.size() - 1; j++) {
                    if (ages.get(index.get(j)) > ages.get(index.get(j + 1))) {
                        tmp = index.get(j);// elem with idx0
                        index.set(j, index.get(j + 1));
                        index.set(j + 1, tmp);
                        sorted = false;
                    }
                }
            }
            // Sorted indexes: [1, 3, 4, 0, 2] -> Sorted ages: [13, 20, 27, 47, 85]
            System.out.println(index);
            for (int i = 0; i < index.size(); i++) {
                System.out.println(surnames.get(index.get(i)) +
                        " " +
                        names.get(index.get(i)) +
                        " " +
                        patronymics.get(index.get(i)) +
                        " " +
                        ages.get(index.get(i)) +
                        " " +
                        genders.get(index.get(i)));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
