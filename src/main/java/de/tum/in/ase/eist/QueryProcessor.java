package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "ema";
        }else if (query.contains("plus")) {
            //query = what is 7 plus 14

            //here we get a list of strings of words
            String[] words = query.split(" ");
            int sum  = 0;
            for (String word: words){
                try {
                    int number = Integer.parseInt(word);
                    sum += number;
                }catch (Exception e){
                    //ignore
                }
            }
            return String.valueOf(sum);
        }else if (query.contains("largest")) {
            //or regex query.split("|,")
            query.replace(",", "");
            String[] words = query.split(" ");
            //int sum  = 0;
            int max = -1;

            for (String word: words){
                try {
                    int number = Integer.parseInt(word);
                    max = number > max ? number : max;
                }catch (Exception e){
                    //ignore
                }
            }
            return String.valueOf(old);
        } else { // TODO extend the programm here
           //Add a new comment by ema
            return "";
        }
    }
}
