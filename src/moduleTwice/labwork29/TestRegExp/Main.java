package moduleTwice.labwork29.TestRegExp;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] namesArray={"VOVA","ivan","R2d2","ZX","Anna","12345","fdsf"};

        for (String name : namesArray) {
            System.out.println(name+":"+ checkPersonWithRegExp(name));

        }

    }
    public  static  boolean checkPersonWithRegExp(String userNameString){
        Pattern pattern=Pattern.compile("[A-Z][a-z]*");
        Matcher matcher=pattern.matcher(userNameString);
        return  matcher.matches();
    }
}
