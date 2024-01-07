package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class QuoteService {
    List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        List<String> quotesList = new ArrayList<>();
        for (int i = 0; i < quotes.size(); i++) {
            quotesList.add(quotes.get(i).getQuote());
        }
        return quotesList;
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> newQuotes = new ArrayList<>();
        for (int i = 0; i < quotes.size(); i++) {
            if (quotes.get(i).getAuthor().equals(author)) {
                newQuotes.add(quotes.get(i));
            }
        }
        return newQuotes;
    }

    public List<String> getAuthors() {
        List<String> authorList = new ArrayList<>();
        for (int i = 0; i < quotes.size(); i++) {
            authorList.add(quotes.get(i).getAuthor());
        }
        return authorList;
    }

    public void setFavorites(int id) {
        for (int i = 0; i < quotes.size(); i++) {
            if (quotes.get(i).getId().equals(id)) quotes.get(i).setFavorite(true);
        }
    }

    public List<Quote> getFavourites(){
        List<Quote> allFavorites = new ArrayList<>();
        for (int i = 0; i < quotes.size(); i++) {
            if(quotes.get(i).getFavorite()){
                allFavorites.add(quotes.get(i));
            }
        }return allFavorites;
    }

    public String getRandomQuote(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, quotes.size() + 1);
        return quotes.get(randomNum).getQuote();
    }

}
