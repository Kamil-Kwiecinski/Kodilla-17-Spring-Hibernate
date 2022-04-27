package com.kodilla.good.patterns;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> map =  movieStore.getMovies();

        String movies = map.entrySet()
                .stream()
                .flatMap(n -> n.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.print(movies);

    }
}
