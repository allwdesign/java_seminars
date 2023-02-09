import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Homework3 {
    public static void main(String[] args) {

        // Create a new list, add some lines, and display the collection on the screen.
        ArrayList<String> list = new ArrayList<>();
        list.add("В недрах тундры");  //0
        list.add("Выдры в гетрах");  //1
        list.add("Тырят в вёдра");  //2
        list.add("Ядра кедров!");  //3
        list.add("Мама мыла раму");  //4

        System.out.println(list);

        // Iterate through all the elements of the list of colors and add a '!' character to each.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");  //0
        colors.add("Оранжевый");  //1
        colors.add("Жёлтый");  //2
        colors.add("Зелёный");  //3
        colors.add("Голубой");  //4
        colors.add("Синий");  //3
        colors.add("Фиолетовый");  //4
        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println(colors);  // [Красный!, Оранжевый!, Жёлтый!, Зелёный!, Голубой!, Синий!, Фиолетовый!]

        // Insert an element into the list at the first position.
        list.add(1, "Корабли лавировали, лавировали, да не вылавировали.");
        System.out.println(list);
        
        // Retrieve the element (at the specified index) from the given list.
        System.out.println(list.get(4));  // Ядра кедров!

        // Update a specific list element at a given index.
        list.set(5, "Карл у Клары украл кораллы");
        System.out.println(list);

        // Remove the third element from the list.
        list.remove(2);
        
        // Finding an element in a list by string.
        System.out.println(list.indexOf("Ядра кедров!"));
        
        // Create a new list and add some elements of the first list to it.
        ArrayList<String> list2 = new ArrayList<>();
        Random rnd = new Random();
        // Copy 3 random elements of the list into the list2
        for (int i = 0; i < (list.size() / 2) + 1; i++) {
            list2.add(list.get(rnd.nextInt(list.size() - 1)));
            
        }
        System.out.println(list2);


        // Remove from the first list all elements that are not in the second list.
        System.out.println("List before: " + list);
        System.out.println("List2: " + list2);
        list.removeAll(list2);
        System.out.println("List after: " + list);
        
        // *Sort list.
        // Unsorted colors: [Красный!, Оранжевый!, Жёлтый!, Зелёный!, Голубой!, Синий!, Фиолетовый!]
        System.out.println("Unsorted colors: " + colors);  
        Collections.sort(colors);
        // Sorted colors: [Голубой!, Жёлтый!, Зелёный!, Красный!, Оранжевый!, Синий!, Фиолетовый!]
        System.out.println("Sorted colors: " + colors);


    }
}
