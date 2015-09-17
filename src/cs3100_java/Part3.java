package cs3100_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by greg on 9/17/15.
 */
public class Part3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pattern p = Pattern.compile("\\s\\(\\d\\d\\d\\)\\s?\\d\\d\\d-\\d\\d\\d\\d\\b");

        String input = "";

        while (s.hasNextLine()) {
            input += s.nextLine() + "\n";
        }

        Matcher m = p.matcher(input);
        int result = 0;
        while (m.find()) {
            result++;
        }
        System.out.println(result);
    }
}
