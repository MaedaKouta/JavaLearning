package Hop;

import java.util.ArrayList;
import java.util.List;

public class ListSearch {

    // Listの３文字以上を整形する
    public static void main(String[] args) {
        var data = List.of("HHKB", "kt", "github");

        var result = new ArrayList<String>();
        for (var s : data) {
            if (s.length() >= 3) {
                result.add(s);
            }
        }

        System.out.println(result);
    }

}
