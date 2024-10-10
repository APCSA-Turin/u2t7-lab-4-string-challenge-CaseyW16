package com.example.project;

public class StringProblemsRunner {
    public static void main(String[] args) {
        StringProblems o = new StringProblems();
        System.out.println(o.endsLy("oddly"));
        System.out.println(o.endsLy("y"));
        System.out.println(o.endsLy("oddy"));
        System.out.println(o.conCat("abc", "cat"));
        System.out.println(o.conCat("dog", "cat"));
        System.out.println(o.conCat("abc", ""));
        System.out.println(o.deFont("Hello"));
        System.out.println(o.deFont("java"));
        System.out.println(o.deFont("away"));
        System.out.println(o.withoutX("xHix"));
        System.out.println(o.withoutX("xHi"));
        System.out.println(o.withoutX("Hxix"));
        System.out.println(o.fizzString("fig"));
        System.out.println(o.fizzString("dib"));
        System.out.println(o.fizzString("fib"));
        System.out.println(o.fizzString2(1));
        System.out.println(o.fizzString2(2));
        System.out.println(o.fizzString2(3));
    }
}