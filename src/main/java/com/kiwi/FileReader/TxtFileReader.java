package com.kiwi.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by malithi on 1/4/17.
 */
public class TxtFileReader {

    public static void main(String[] args) {
        try {
            System.out.println(" about to read the file myFile.txt");
            FileReader txtFileRd = new FileReader("./myFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error catched  " + e.getMessage());
        }finally {
            System.out.println(" finally called ..");
        }


    }
}
