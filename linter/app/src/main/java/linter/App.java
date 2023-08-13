package linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        readFileAndDiscoveredError();
    }
    public static void readFileAndDiscoveredError (){
// linter/app/src/main/resources
        Path path = Path.of("app/src/main/resources/gates.js");
        try ( Scanner read = new Scanner(path) ) {
            System.out.println("********************************************************\n");
            int count = 1;
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                if( line.endsWith(";") ||
                        line.isEmpty() ||
                        line.endsWith("{") ||
                        line.endsWith("}") ||
                        line.contains("if") ||
                        line.contains("else") ||
                        line.startsWith("//")){
                    System.out.println("Line " + count + ": " + line);
                }else{
                    System.out.println("Line "+count+" : Missing semicolon.");
                }
                count++;
            }
            // read.close(); no need for closing the file it will close automatically
            System.out.println("\n********************************************************");
        }
        catch (IOException e){
            System.out.println("Error Reading The File : " + e.getMessage());
        }

    }

}
