package main.java;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer{

    public ImprovedStringTokenizer(String str, String delimtr, boolean returnDelimtrs) {
        super(str, delimtr, returnDelimtrs);
    }

    public ImprovedStringTokenizer(String str, String delimtr) {
        super(str, delimtr);
    }

    public ImprovedStringTokenizer(String str) {
        super(str);
    }

    public ArrayList<String> getTokenizedArray() {
        ArrayList<String> arrayToken = new ArrayList();
        while(this.hasMoreTokens()) {
            arrayToken.add(this.nextToken());
        }
        return arrayToken;
    }
}