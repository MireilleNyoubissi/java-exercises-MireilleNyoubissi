package com.cbfacademy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        //readFile();   
        copyFile();     
      
    }

    //Write a program that uses a FileReader to read the content of a file, and print it to the screen, line by line.
        //We've provided the input exercise.txt file in this project's resources folder.


        private static void readFile(){
                String filePath = "exercises/input-output/src/main/resources/exercise.txt";

            try(
               BufferedReader reader = new BufferedReader(new FileReader(filePath));
            ){
                String outputLine = reader.readLine();
                while(outputLine != null){
                    System.out.println(outputLine);
                    outputLine = reader.readLine();
                }
            }catch(IOException e){
                System.out.println("File reading exception:" + e.getMessage());
                e.printStackTrace();
            }
        }

        //Expand on the previous program, and use a FileWriter to copy the content of the exercise.txt to a new file.
        //The output file should be created in this project's resources folder.


        private static void copyFile() {
            String filePath = "exercises/input-output/src/main/resources/exercise.txt";
            String fileName = "exercises/input-output/src/main/resources/newExercise.txt";

            try(
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            ){
                int character = reader.read();
                while(character != -1) {
                    writer.write(character);
                    character = reader.read();
                }

            }catch(IOException e){
                System.out.println("File copying exception:" + e.getMessage());
                e.printStackTrace();
            }

        }


        


        




}


