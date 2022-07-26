package com.endava.tmd.tmdbookclub.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BooksAndOwners {
    private final String title;
    private final String author;
    private final String name;
    private final String surname;
}
