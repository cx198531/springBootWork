package com.company.project.model;

import javax.persistence.*;

public class Book {
    @Id
    @Column(name = "BOOKID")
    private String bookid;

    @Column(name = "NAME")
    private String name;

    /**
     * @return BOOKID
     */
    public String getBookid() {
        return bookid;
    }

    /**
     * @param bookid
     */
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}