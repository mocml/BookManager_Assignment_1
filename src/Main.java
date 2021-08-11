/*
 * Copyright(C) 2021 ,FPT UNIVERSITY
 * 
 * DATE        Version         Author          DESCRIPTION
 * 10/08/2021    1.0            Vanhv   
 */

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vanhv
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Validation v = new Validation();
        Manager manager = new Manager();
        System.out.println("1.  Book Manager");
        System.out.println("2.  Reader Manager");
        System.out.println("3.  Lending Manager");
        while (true) {
            System.out.println("\n\t\t----------------");
            int choice = v.getInt("Option : ", "Option into [1, 3]", 1, 3);
            switch (choice) {
                case 1: {
                    manager.bookManager();
                }
                case 2: {

                }
                case 3: {

                }
                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
