package Grammer;

import java.util.List;

public class ForAndList {

    public static void main(String[] args) {

        // Java4までのforの取り出し
        var strs1 = List.of("要素１", "要素2", "要素3", "要素4");
        for(int i = 0; i < strs1.size(); i++) {
            var str1 = strs1.get(i);
            System.out.println(str1);
        }

        // Java5以降の拡張for分
        var strs2 = new String[]{"要素１", "要素2", "要素3", "要素4"};
        for(String str2: strs2) {
            System.out.println(str2);
        }
    }

}
