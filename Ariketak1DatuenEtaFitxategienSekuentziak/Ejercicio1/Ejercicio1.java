package Ariketak1DatuenEtaFitxategienSekuentziak.Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the image' name:");
        String name = sc.nextLine();
        FileInputStream image = new FileInputStream(name + ".jpg");
        FileOutputStream copy = new FileOutputStream(name + "_CPY.jpg");
        try {

            int readByte = image.read();
            while(readByte != -1){
                copy.write(readByte);
                readByte = image.read();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
        finally{
            image.close();
            copy.close();
        }
    }
}
