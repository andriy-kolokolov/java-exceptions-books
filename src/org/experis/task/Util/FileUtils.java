package org.experis.task.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
    public static void displayFileContent(String path) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
