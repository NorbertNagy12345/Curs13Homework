package org.fasttrackit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Quote>quotes = fileReader();
        System.out.println(quotes.get(0).getId());
        QuoteService quoteService = new QuoteService(quotes);
        System.out.println(quoteService.getAllQuotes());
        System.out.println(quoteService.getQuotesForAuthor("John Lennon").get(0).getAuthor());
        System.out.println(quoteService.getAuthors());
        System.out.println(quoteService.getRandomQuote());
    }

    private static List<Quote> fileReader() throws FileNotFoundException {
        List<Quote> quotes = new ArrayList<>();
        Scanner scanner =new Scanner(new File("src/main/files","quotes.txt"));
        while (scanner.hasNext()) {
            String[]words = scanner.nextLine().split("~");
            Quote quote = new Quote(words[0],words[1]);
            quotes.add(quote);
        }
        return quotes;
    }
}