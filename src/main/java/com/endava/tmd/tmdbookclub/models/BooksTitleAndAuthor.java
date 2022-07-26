package com.endava.tmd.tmdbookclub.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BooksTitleAndAuthor {
    private final String title;
    private final String author;
}