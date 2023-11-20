package editor;

import java.util.ArrayList;

public class Displayer {

    public static void displayErrors(ArrayList<String> errors) {
        for (int i = 0; i < errors.size(); i++) {
            System.out.println("ERROR: " + errors.get(i));
        }|
    }

    public static void displaySuccessMessage() {
        System.out.println("No errors found!");
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }
}
