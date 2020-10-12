package com.company;

import java.io.IOException;

import static com.company.FileForWork.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String path="part.txt";
        String pathSort="part_sorted.txt";
        randomArr();
        sortArr();
        System.out.print("Вывод рандомного массива: ");
        readingArr(path);
        System.out.println("");
        System.out.print("Вывод отсортированого массива: ");
        readingArr(pathSort);
    }
}
