package cs3100_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by greg on 9/17/15.
 */
public class Part2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pattern p = Pattern.compile("//.*");

        String input = "";

        while (s.hasNextLine()) {
            input += s.nextLine() + "\n";
        }

        Matcher m = p.matcher(input);
        String result = m.replaceAll("");
        System.out.println(result);
    }
}
