package baitap.a5;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1: Introduction");
        chapters.add("Chapter 2: Implementation");
        chapters.add("Chapter 3: Benefits");

        book book = new book.Builder()
                .setTuade("The Builder Pattern")
                .setSotrang(200)
                .setTacgia("John Doe")
                .setDanhsach(chapters)
                .build();

        System.out.println(book);
    }
}
