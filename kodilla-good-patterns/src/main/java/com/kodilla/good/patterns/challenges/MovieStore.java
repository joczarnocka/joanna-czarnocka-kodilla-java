package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MovieStore {

    private final static String SEPARATOR_EM = "!";
    private final static String EMPTY_STRING = "";

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public void printMovies(String separator) {
        String totalTitles = getMovies()
                .entrySet()
                .stream()
                .flatMap(l -> l.getValue().stream())
                .reduce(EMPTY_STRING, (total, current) -> total + separator + current)
                .substring(1);

        System.out.println(totalTitles);
    }

    public static void main(String[] args) {
        MovieStore ms = new MovieStore();
        ms.printMovies(SEPARATOR_EM);
    }
}