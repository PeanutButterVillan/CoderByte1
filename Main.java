import java.util.*;
import java.io.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static String CodelandUsernameValidation(String str) {
        // code goes here
        String str_return = "false";


        if (str.length() >= 4 && str.length() <= 25) {
            Pattern pattern = Pattern.compile("^[a-z][a-z0-9_]*(?:_[a-z0-9]+)*$(?<![_])");
            Matcher matcher = pattern.matcher(str);
            boolean matchFound = matcher.find();
            if (matchFound) {
                str_return = "true";
            } else {
                str_return = "false";
            }

        }

        return str_return;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}