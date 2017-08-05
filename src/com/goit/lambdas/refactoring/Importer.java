package com.goit.lambdas.refactoring;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;

public class Importer {

    public LocalDate findFirstBad(String fileName) throws URISyntaxException, IOException {
        Path path = Paths.get(ClassLoader.getSystemResource(fileName).toURI());
        List<String> lines = Files.readAllLines(path);
        return lines.stream()
                .map(ProductItem::new)
                .sorted(Comparator.comparing(ProductItem::getCreated))
                .findFirst()
                .get().getCreated();
    }

    public LocalDate findFirstBetter(String fileName) throws URISyntaxException, IOException {
        Path path = Paths.get(ClassLoader.getSystemResource(fileName).toURI());

        return Files.lines(path)
                .parallel()
                .map(line -> line.substring(line.lastIndexOf(",") + 1))
                .min((l1, l2) -> l1.compareTo(l2))
                .map(line -> LocalDate.parse(line, DateTimeFormatter.ISO_DATE))
                .get();
    }
}
