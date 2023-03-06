package ecommerce;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tymek", "Michał", "Jakub", "Agnieszka", "Maciej");

        Greeter greeter = new Greeter();
        greeter.greet("Jakub");
        List<String> ladies = new ArrayList<String>();
        for (String name : names){
            if (name.endsWith("a")) {
                ladies.add(name);
            }
        }
        for (String ladyName: ladies) {
            greeter.greet(ladyName);
        }

        names.stream()
                .filter(name -> name.endsWith("a"))
                .forEach(greeter::greet);
    }
}