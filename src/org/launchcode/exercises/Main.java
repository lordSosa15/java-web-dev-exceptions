package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            try {
                int points = CheckFileExtension(entry.getValue());
                System.out.println(entry.getKey() + " gets " + points + " points.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error for " + entry.getKey() + ": " + e.getMessage());
                System.out.println(entry.getKey() + " gets -1 points.");
            }
        }
    }

    public static int Divide(int x, int y) {
        // Write code here!
        try {
            if (y == 0){
                throw  new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
            return 0;
        }

    }

    public static int CheckFileExtension(String fileName) throws IllegalArgumentException {
        // Write code here!
        if (fileName == null || fileName.isEmpty()){
            throw new IllegalArgumentException("File name cannot be null or empty");
        }
        if(fileName.endsWith(".java")){
            return 1;
        } else {
            return 0;
        }
    }

}
