package com.bendouthwaite;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReferenceService {

    private static final String REFERENCE = "./personal-website-backend/src/main/resources/static/reference/";

    public List<String> getDirectories() {

        try {
            return Files.list(
                    Paths.get(REFERENCE))
                    .filter(path -> Files.isDirectory(path))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public String getDirectoryReference(String directoryName) {
        Path path = Paths.get(REFERENCE,directoryName, directoryName + ".md");

        if (Files.exists(path)) {
            try {
                List<String> strings = Files.readAllLines(path);
                return String.join(System.lineSeparator(), strings);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "No top level markdown file exists for " + directoryName + ".md";
    }
}
