package com.legenda.lee.studytest.aboutListSort;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2023-06-22 下午8:04
 * @description:
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    private String title;
    private Double rating;
    private Boolean starred;

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, Double rating) {
        this.title = title;
        this.rating = rating;
    }

}
