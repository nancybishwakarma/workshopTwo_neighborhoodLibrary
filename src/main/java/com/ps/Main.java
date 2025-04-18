package com.ps;


import java.util.Scanner;

public class Main implements Menus{
    static Scanner scanner = new Scanner(System.in);
    public static void displayHomescreen(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~     Welcome to the Neighborhood Library         ~");
        System.out.println("~   Please select one of the following options:   ~");
        System.out.println("~         Press 1 for Available Books             ~");
        System.out.println("~         Press 2 for Checked Out Books           ~");
        System.out.println("~         Press 0 to Exit                         ~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void main(String[] args) {

        Book[] books = new Book[20];

                books[0] = new Book(1, "978-0140449136", "The Odyssey", false, "");
                books[1] = new Book(2, "978-0439139601", "Harry Potter and the Goblet of Fire", true, "Alice");
                books[2] = new Book(3, "978-0061120084", "To Kill a Mockingbird", false, "");
                books[3] = new Book(4, "978-0451524935", "1984", true, "Bob");
                books[4] = new Book(5, "978-0743273565", "The Great Gatsby", false, "");
                books[5] = new Book(6, "978-1501128035", "It Ends with Us", true, "Sarah");
                books[6] = new Book(7, "978-0062315007", "Sapiens", false, "");
                books[7] = new Book(8, "978-0307474278", "The Girl with the Dragon Tattoo", true, "Jake");
                books[8] = new Book(9, "978-0140449266", "The Iliad", false, "");
                books[9] = new Book(10, "978-1400032716", "Beloved", true, "Emma");
                books[10] = new Book(11, "978-0385472579", "Things Fall Apart", false, "");
                books[11] = new Book(12, "978-0307387899", "The Road", true, "Liam");
                books[12] = new Book(13, "978-0060850524", "Brave New World", false, "");
                books[13] = new Book(14, "978-0142437230", "Moby-Dick", true, "Noah");
                books[14] = new Book(15, "978-0141439556", "Pride and Prejudice", false, "");
                books[15] = new Book(16, "978-0062569369", "The Alchemist", true, "Mia");
                books[16] = new Book(17, "978-0345803481", "Fifty Shades of Grey", false, "");
                books[17] = new Book(18, "978-0743482837", "Macbeth", true, "Olivia");
                books[18] = new Book(19, "978-0143127550", "Norwegian Wood", false, "");
                books[19] = new Book(20, "978-0142424179", "The Fault in Our Stars", true, "Ethan");


                displayHomescreen();

                int userMenuInput = scanner.nextInt();

                if(userMenuInput==1){
                    Menus.displayAvailableBooks(books);
                    System.out.println("--------------------------------------------------------------\n");
                    System.out.println("Please enter 1 to select a book to checkout or enter 2 to exit");

                    int checkoutOptionInput = scanner.nextInt();

                    switch (checkoutOptionInput) {

                        case 1:
                            Menus.displayBookToCheckout(books);
                            break;
                        case 2:
                            System.out.println("You have exited");
                            break;
                    }

                }

                if(userMenuInput==2){
                    Menus.displayCheckedOutBooks(books);
                }

                if(userMenuInput==0){
                    System.out.println("You have exited the application");
                }

                }
            }











