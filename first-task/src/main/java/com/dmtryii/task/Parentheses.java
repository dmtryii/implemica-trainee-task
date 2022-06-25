package com.dmtryii.task;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {
    private List<String> result; // Resultant list

    /**
     * Searches for the correct parentheses
     *
     * @param n      number of correct parentheses
     * @return       list of correct parentheses
     */
    public List<String> searchParentheses(int n){
        result = new ArrayList<>();

        /// Recursively generate parentheses
        searchParentheses(result, "", 0, 0, n);
        return result;
    }

    /**
     * Searches for the correct parentheses
     *
     * @param result      list in which the result will be recorded
     * @param s           serves for proper concatenation
     * @param open        number of open parentheses
     * @param close       number of close parentheses
     * @param n           number of correct parentheses
     */
    private void searchParentheses(List<String> result, String s, int open, int close, int n){
        // Base case
        if(open == n && close == n){
            result.add(s);
            return;
        }
        // If the number of open parentheses is less than the given n
        if(open < n){
            searchParentheses(result, s + "(", open + 1, close, n);
        }
        // If we need more close parentheses to balance
        if(close < open){
            searchParentheses(result, s + ")", open, close + 1, n);
        }
    }

    /**
     *
     * @return the correct output to the screen
     */
    public String getResultSize(){
        return "number of combinations = " + result.size();
    }
}
