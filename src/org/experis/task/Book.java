package org.experis.task;

public class Book {
    private String title;
    private Integer pages;
    private String author;
    private String editor;

    public Book(String title, Integer pages, String author, String editor) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.editor = editor;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
