package com.ps;

import static com.ps.Main.displayHomescreen;
import static com.ps.Main.scanner;

public interface Menus {
    public static void displayAvailableBooks(Book[] books){
        System.out.println("--------------------------------------------------------------");
        System.out.println("                The Available Books are:         ");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < books.length; i++){
            if(!books[i].getisCheckedOut()){
                System.out.println(" Title: " + books[i].getTitle()+ "\t\t| ID: "+ books[i].getId()+"\t\t| ISBN: "+ books[i].getIsbn()+"\n");
            }
        }

    }

    public static String displayBookToCheckout(Book[] books) {
        System.out.println("Please provide the ID of the book");
        int usercheckoutBookId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please provide your name: ");
        String checkoutUsername = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {

            if (usercheckoutBookId == i + 1) {
                books[i].setCheckedOutTo(checkoutUsername);
                books[i].setisCheckedOut(true);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("You have checked out: " + books[i].getTitle()+ "\nYour name is: " + books[i].getCheckedOutTo());

            }

        }
        return("Please try again!");

    }

    public static String displayCheckedOutBooks(Book[] books) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("             Here is the list of Checked Out Books\n");

        for (int i = 0; i < books.length; i++) {
            if (books[i].getisCheckedOut()) {
                System.out.println(" Title: " + books[i].getTitle() + "\t\t| ID: " + books[i].getId() + "\t\t| ISBN: " + books[i].getIsbn() + "\t\t|Name: " + books[i].getCheckedOutTo() + "\n");

            }
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter C to Check In a Book or X to go back to main menu");

        char checkInBookInput = scanner.next().charAt(0);

        if (checkInBookInput == 'C' || checkInBookInput == 'c') {
            System.out.println("Please enter the ID of the book you want to check in");
            int checkInBookId = scanner.nextInt();

            for (int i = 0; i < books.length; i++) {
                if (checkInBookId == books[i].getId()) {
                    books[i].setisCheckedOut(false);
                    System.out.println("-------------------------------------------------");
                    System.out.println("You have checked in: " + books[i].getTitle());
                    System.out.println("-------------------------------------------------");

                }
            }
        } else if (checkInBookInput == 'x' || checkInBookInput == 'X') {
            displayHomescreen();
        }
            return("Please try again!");
    }}

























