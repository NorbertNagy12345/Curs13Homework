package org.fasttrackit;

public class Quote {
    private static int count = 1;
    private Integer id;
    private String author;
    private String quote;
    private Boolean favorite;

    public Quote( String author, String quote) {
        this.id = count;
        count++;
        this.author = author;
        this.quote = quote;
        this.favorite = false;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
