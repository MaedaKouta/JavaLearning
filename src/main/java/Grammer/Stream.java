package Grammer;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        var data = List.of("HHKB", "kt", "github");

        data.stream().toList();

        // 数える
        data.stream().count();

        // 全ての要素が条件を満たすかどうか
        data.stream().allMatch(s -> s.contains("t"));
    }

}
