package Opgave04;

public class Opgave04Main {
    public static String reverse(String s){
        if(s.length()==0)
            return s;
        return s.substring(s.length()-1) + reverse(s.substring(0,s.length()-1));
    }
}
