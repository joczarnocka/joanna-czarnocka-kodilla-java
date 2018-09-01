package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException{
        ClassLoader classLoader = getClass().getClassLoader();
        File file =  new File(classLoader.getResource("files/names.txt").getFile());
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            //System.out.println("Something went wrong");
            throw new FileReaderException();
        } finally {
            System.out.println("Always after all");
        }
    }
}
