package midterm2018;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import  java.util.Map;
import java.util.Set;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
                + "Host: localhost:1298\n"
                + "Connection: keep-alive\n"
                + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
                + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
                + "Referer: http://localhost:1298/\n"
                + "Accept-Encoding: gzip, deflate, br\n"
                + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
                + "    “task” : “inc”,\n"
                + "    “num” : 3\n"
                + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        //System.out.println(question1and2);
        //System.out.println(question3);
        //System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host
        String[] lines = question1and2.split("\n");

        for (int i = 0; i < lines.length; i++) {
            String[] items = lines[i].split(":");

            if (items[0].equals("Host")) {
                System.out.println("the host is:" + items[items.length - 1]);

            }
        }
        // Question 2
        // return sum of a and b

        for (int i = 0; i < lines.length; i++) {
            String[] items = lines[i].split(" ");

            if (items[0].equals("GET")) {
                String addends[] = items[1].split("\\?");
                String addend[] = addends[1].split("&");
                String num1[] = addend[0].split("=");
                String num2[] = addend[1].split("=");

                int sum = Integer.parseInt(num1[num1.length - 1]) + Integer.parseInt(num2[num2.length - 1]);
                System.out.println("the sum of a and b is: " + sum);

            }
        }
        // Question 3
        // convert to java object, increment num, convert back to json and return
        //JsonParser jsonParser = new JsonParser();
        //JsonObject obj = jsonParser.parse(question3).getAsJsonObject();

        // Question 4
        // return unique words
        int numOfUnique;
        String[] wordsWithPunctuation = question4and5.split(" ");
        Set<String> s = new HashSet<>();


        for (int i = 0; i < wordsWithPunctuation.length; i++) {
            s.add(wordsWithPunctuation[i].toLowerCase());
        }
        numOfUnique = s.size();

        System.out.println("the number of unique is: " + numOfUnique);

        // Question 5
        // return 2nd most common word
        List list = new ArrayList();
        for (int i = 0; i < wordsWithPunctuation.length; i++) {
            list.add(wordsWithPunctuation[i].toLowerCase());
        }

        Set<String> uniqueSet = new HashSet(list);
        int[] counter = new int[s.size()];
        int i=0;
        int largest = 0;
        for (String temp : uniqueSet) {
             counter[i] = Collections.frequency(list, temp);
            if (largest < counter[i]) {
                
                }
            }
        }

        /*Map map = new HashMap();

        for (String temp : list) {
            int count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        printMap(map);

        System.out.println("\nMap排序-以key排序");
        Map treeMap = new TreeMap(map);
        printMap(treeMap);

    }

    public static void printMap(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key-value : " + entry.getKey() + "- "
                    + entry.getValue());
        }
    }*/
    }
}
