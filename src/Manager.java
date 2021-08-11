
import java.io.IOException;
import java.util.Scanner;

/*
 * Copyright(C) 2021 ,FPT UNIVERSITY
 * 
 * DATE        Version         Author          DESCRIPTION
 * 11/08/2021    1.0            Vanhv   
 */
/**
 *
 * @author vanhv
 */
public class Manager {

    Scanner sc = new Scanner(System.in);

    void bookManager() throws IOException {
        BookManager m = new BookManager();
        System.out.println("===================\n"
                + "1.  Load data from file\n"
                + "2.  Input & add to the end\n"
                + "3.  Display data\n"
                + "4.  Save book list to file\n"
                + "5.  Search by bcode\n"
                + "6.  Delete by bcode\n"
                + "7.  Sort by bcode\n"
                + "8.  Input & add to beginning\n"
                + "9.  Add after position  k\n"
                + "10. Delete position k"
                + "\n===================");
        while (true) {
            System.out.println("\n\t\t----------------");
            System.out.print("Option : ");
            int choice = Integer.valueOf(sc.nextLine());
            switch (choice) {
                case 1: {
                    m.f1();
                    break;
                }
                case 2: {
                    m.f2();
                    break;
                }
                case 3: {
                    m.f3();
                    break;
                }
                case 4: {
                    m.f4();
                    break;
                }
                case 5: {
                    m.f5();
                    break;
                }
                case 6: {
                    m.f6();
                    break;
                }
                case 7: {
                    m.f7();
                    break;
                }
                case 8: {
                    m.f8();
                    break;
                }
                case 9: {
                    m.f9();
                    break;
                }
                case 10: {
                    m.f10();
                    break;
                }
                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }

    void readerManager() {
        System.out.println("===================\n"
                + "1.  Load data from file\n"
                + "2.  Input & add to the end\n"
                + "3.  Display data\n"
                + "4.  Save reader list to file\n"
                + "5.  Search by rcode\n"
                + "6.  Delete by rcode"
                + "\n===================");
        while (true) {
            System.out.println("\n\t\t----------------");
            System.out.print("Option : ");
            int choice = Integer.valueOf(sc.nextLine());
            switch (choice) {
                case 1: {
                    // m.f1();
                    break;
                }
                case 2: {
                    //    m.f2();
                    break;
                }
                case 3: {
                    // m.f3();
                    break;
                }
                case 4: {
                    //  m.f4();
                    break;
                }
                case 5: {
                    // m.f5();
                    break;
                }
                case 6: {
                    // m.f6();
                    break;
                }
                default: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
