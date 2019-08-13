package ru.maxx129.patterns;

public class Test {

    public String a = "Строка";

    public void func() {

        char[] start = a.toCharArray();
        char[] fin = start;



        for(int i = 0; i < start.length; i++) {
            System.out.println(start[i]);
            //fin[start.length-1-i] = start[i];
            //System.out.println(fin[start.length-1-i]);

        }

        System.out.println(fin);


    }


    public static void main(String[] args) {

        Test test = new Test();
        test.func();


    }

}
