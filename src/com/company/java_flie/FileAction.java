package com.company.java_flie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAction {
    public void createFile(String input) {
        try {
            File myObj = new File(input);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeFile(String input, String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(input);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void readFile(String input) {
        try {
            File myObj = new File(input);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void deleteFile(String input){
        File myObj = new File(input);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {
        FileAction fileAction = new FileAction();
        fileAction.createFile("filename.txt");
        fileAction.writeFile("Nguyen The Kien", "fileName.txt");
        fileAction.readFile("fileName.txt");
        fileAction.deleteFile("fileName.txt");
    }
}
