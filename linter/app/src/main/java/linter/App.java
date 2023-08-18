package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<String> errors = readFileAndDiscoveredError("gatesTest4.js");
        System.out.println(errors);
    }

    public static List<String> readFileAndDiscoveredError(String fileName) {
        List<String> errors = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(Path.of("src/test/resources/" + fileName));
            int count = 1;

            if (!scanner.hasNextLine()) {
                errors.add("Empty File");
            } else {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (!line.trim().isEmpty() && !line.trim().endsWith(";") &&
                            !line.trim().endsWith("{") && !line.trim().endsWith("}") &&
                            !line.contains("if") && !line.contains("else") &&
                            !line.trim().startsWith("//")) {
                        errors.add("Line " + count + ": Missing ;");
                    }
                    count++;
                }
            }

            scanner.close();

            if (errors.isEmpty()) {
                errors.add("No errors found");
            }
        } catch (IOException e) {
            System.out.println("Error Reading The File: " + e.getMessage());
        }
        return errors;
    }

}
