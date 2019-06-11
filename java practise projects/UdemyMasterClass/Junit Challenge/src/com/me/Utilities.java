package com.me;

public class Utilities {


    // returns a char array containing every nth char. when
    // sourceArray.length < n, returns sourceArray

    public char[] everyNthChar(char[] sourceArray,int n){

        if(sourceArray == null || sourceArray.length < n){
            return sourceArray;
        }


        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];
        int index = 0;

        for(int i = n-1; i < sourceArray.length; i += n){
            result[index++] = sourceArray[i];
        }

        return result;

    }

    // Remove pairs of the same character that are next to each other
    // to each other, by removing on the occurence of the character
    // "AABCDDEFF" -> "ABCDEF"
    // "ABCCABDEEF" -> "ABCABDEF" (the two B's aren't next to each other so they are not removed
    public String removePairs(String source){

        // If length less than 2, there won't be any pairs
        if(source == null || source.length() < 2){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();

        for(int i = 0,j = 1;i < string.length; i++){
            if(i == string.length - 1){
                // System.out.println(string[i]);
                sb.append(string[i]);
                break;
            }
            if(string[i] != string[j]){
                // System.out.println(string[i]);
                sb.append(string[i]);
            }
            j++;
        }

        return sb.toString();

    }

    // perform a conversion based on some internal
    // business rule.
    public int converter(int a,int b){
        return (a/b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source){
        if(source.length() % 2 == 0){
            return source;
        }

        return null;
    }


}