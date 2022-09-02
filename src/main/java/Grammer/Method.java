package Grammer;

import java.util.List;

public class Method {

    public static void main(String[] args) {
        var result = twice(5);
        System.out.println(result);
    }

    /*
    staticメソッド
    staticメソッドはメソッド名を指定するだけで呼び出すことが可能。つまり、staticメソッドはインスタンス化による影響を一切受けないメソッド。
    また、どのクラスから呼び出されても、staticメソッドの処理内容はまったく同じ。
    このように、staticメソッドはインスタンスを生成しなくても呼び出せる特別なメソッド。
    ほんの少しだけ、インスタンスメソッドよりもstaticメソッドの方が処理速度が早いというメリットもある。
     */
    static int twice(int x) {
        return x * 2;
    }

}
