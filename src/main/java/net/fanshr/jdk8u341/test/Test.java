package net.fanshr.jdk8u341.test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : LiuYJ
 * @version : v1.0
 * @date : Created at 2022/8/5 11:53
 * @date : Modified at 2022/8/5 11:53
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("test...");

        HashMap<String, String> map = new HashMap<>();
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("k1", "v1");
    }
}
