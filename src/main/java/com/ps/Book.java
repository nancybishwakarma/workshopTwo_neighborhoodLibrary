package com.ps;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private Boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String isbn, String title,Boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
        this.title = title;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public Boolean getisCheckedOut() {
        return isCheckedOut;
    }

    public void setisCheckedOut(Boolean ischeckedOut) {
        isCheckedOut = isCheckedOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



}
