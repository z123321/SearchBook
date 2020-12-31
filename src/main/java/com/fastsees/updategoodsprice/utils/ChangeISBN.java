package com.fastsees.updategoodsprice.utils;

public class ChangeISBN {
    private static String getISBN13(String isbn) {
        if (isbn.length() != 10) {
            return isbn;
        }
        isbn = isbn.substring(0, isbn.length() - 1);
        isbn = "978" + isbn;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < isbn.length(); i++) {
            int x = Integer.parseInt(isbn.substring(i, i + 1));
            if (i % 2 == 0) {
                a += x;
            } else {
                b += x;
            }
        }
        c = a + 3 * b;
        d = 10 - c % 10;
        isbn = isbn + d;
        return isbn;
    }

    public static void main(String[] args) {
        System.out.println(getISBN13("0643533508"));
    }
}