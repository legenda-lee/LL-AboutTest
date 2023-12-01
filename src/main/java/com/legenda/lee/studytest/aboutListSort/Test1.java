package com.legenda.lee.studytest.aboutListSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2023-06-22 下午8:06
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {
        List<Movie> movies2 = Arrays.asList(
                new Movie("《指环王》", 8.8, true),
                new Movie("《肖申克的救赎》", 9.1, false),
                new Movie("《星球大战》)", 8.0, true),
                new Movie("《我和我的祖国》", 10.0, false));

        movies2.sort(Comparator.comparingDouble(analysis->analysis.getRating()));

        for (Movie movie : movies2) {
            System.out.println(movie.getRating());

        }


    }
}
