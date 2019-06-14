package com.me;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String string = "I am a string. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        // . is a wildcard for any character
        System.out.println(alphanumeric.replaceAll(".","Y"));
        // ^ is for the beginning of a character
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        System.out.println();

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

        // using matches
        // when using the match, you will have match the string as a whole and not part of it
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));

        // $ matches with the end of the string while the ^ matches with the start of the string
        System.out.println(alphanumeric.replaceAll("ijkl99z","THE END"));

        // using square brackets, to replace repeated occurences, it matches individual character and replace "X"
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
        System.out.println(alphanumeric.replaceAll("[aei]","I Replaced the letter here"));
        // this will replace if the initial characters is a or e or i, followed by an "F" or a "J"
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));

        System.out.println();
        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        System.out.println();
        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        // if caret is used inside the bracket, it will replace what is not inside the brackets
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));
        // without the use of the caret, it will replace the individual characters to X
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]","X"));
        // we can work with range using dash
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X"));
        // no case sensitivity
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));

        System.out.println();
        // replace all number in a string
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X")); 
        // using the \\d to replace all the number in a string
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
        // using the \\D to replace all the non-digits in a string
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));

        System.out.println();
        
        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        // to remove the whitespaces
        System.out.println(hasWhitespace.replaceAll("\\s",""));
        System.out.println(hasWhitespace.replaceAll("\\t","x"));
        //remove all the non whitespaces
        System.out.println(hasWhitespace.replaceAll("\\S",""));
        // \\w will match [A-Z][0-9]
        System.out.println(newAlphanumeric.replaceAll("\\w","X"));
        System.out.println(hasWhitespace.replaceAll("\\w","X"));
        // \\b will match words
        System.out.println(hasWhitespace.replaceAll("\\b","X"));

        System.out.println();
        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
        // {} is using quantifier is how many repeating of the letter for it to match
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}","YYY"));
        // + is to match the nth number of string after the letter
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+","YYY"));
        // * is a wildcard, the value that comes after that does not matter
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{2,5}","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j","Y"));

        System.out.println();
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        // . will match anything before or anything after
        //String h2Pattern = ".*<h2>.*";

        // () is using groups, groups when bracketed, will begin with group 0
        String h2Pattern = "(h2>)";


        // to be defined in the pattern
        // Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE
        Pattern pattern = Pattern.compile(h2Pattern); // define the pattern
        Matcher matcher = pattern.matcher(htmlText); // compare whether h2 tag is available
        System.out.println(matcher.matches());

        //matcher only can be used once, to reuse again, will need to reset
        matcher.reset();

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        // . means any character, * means return everything after
        // this is a greedy quantifer
        // String h2GroupPattern = "(<h2>.*</h2>)";

        // putting a ? will make the quanitifer a lazy one, so that once it search, it will not search for
        // any more
        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.t?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        System.out.println();
        // "abc" is ard using the AND operator "A" and "B" and "C"
        // [H || h] is the OR operator
        System.out.println("harry".replaceAll("[H || h]arry","Larry"));
        System.out.println("Harry".replaceAll("[H || h]arry","Larry"));

        // [^abc] the caret is the not operator
        System.out.println();

        String tvTest = "tstvtkt";
        // String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)"; // ? dont consume the letter that is ahead
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        // t(?=v) positive lookahead

    }
}
