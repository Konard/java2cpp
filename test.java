package sosalesosa;

import java.util.*;

// Hello world program

class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.print("ban");
        var a = 1;

        for (int i = 0; i < 100; ++i){
            System.out.println(test());
        }

        HashMap<String, Integer> m = new HashMap<>();
        m.put("hello world", 5);
        m.put("a", 1777);
        System.out.println(m.get("hello world"));
        System.out.println(m.get("a"));

        if (m.containsKey("b"))
            System.out.println("contains!");
        else
            System.out.println("not contains :(");

        HashSet<String> b = new HashSet();
        b.add("lol");
        System.out.println(b);
        if (b.contains("lol")) System.out.println("lol contains :|");

        ArrayList<String> c = new ArrayList();
        c.add("Hello world");
        System.out.println(c);
        var index = c.indexOf("Hello world");
        System.out.println(c.get(0));
    }
    public static int test(){
        var r = new Random();
        int b = 5 + r.nextInt(64 - 5 + 1);
        return b;
    }
    public String test(String a){
        long i = 100L;
        long j = 100_000L;
        String timed = "timed";
        return timed + a;
    }
}