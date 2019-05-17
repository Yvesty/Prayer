package com.yvesty;

public class JavaCore {
    public static void main(String[] args) {

        String all = String.join("S","/","M","L","XL");
        System.out.println(all);
        System.out.println("hello".equalsIgnoreCase("Hello"));

        String greeting = "Hello";
        int cpCout = greeting.codePointCount(0,greeting.length());
        System.out.println(cpCout);

        int index =greeting.offsetByCodePoints(0,3);
        int cp = greeting.codePointAt(index);
        System.out.println(cp);
        if (greeting == "Hello"){
            System.out.println("相等");
        }else {
            System.out.println("不等");
        }

        if (greeting.substring(0,3) == "Hel") {
            System.out.println("相等1");
        }else{
            System.out.println("不等1");
        }
//        Scanner in = new Scanner(System.in);
//        System.out.println("What is you name ?");
//        String name = in.nextLine();
//        System.out.println(name);

//        Console cons = System.console();
//        String username = cons.readLine("user name");
//        char[] passwd = cons.readPassword("Password");

    }
}
