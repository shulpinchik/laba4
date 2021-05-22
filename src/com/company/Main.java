package com.company;


import javax.script.ScriptException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws ScriptException {
        //task1
        String str1="A C B D D D SD ";
        new task1(str1);
        System.out.println();

        //task2
        String str = "152342356789(";
        Deque dec = new LinkedList();
        dec.addLast('1');
        dec.addLast('2');
        dec.addLast('я');
        dec.addLast('л');
        dec.addLast('3');
        dec.addLast('4');
        dec.addLast('ю');
        dec.addLast('б');
        dec.addLast('5');
        dec.addLast('6');
        dec.addLast(' ');
        dec.addLast('с');
        dec.addLast('7');
        dec.addLast('8');
        dec.addLast('и');
        dec.addLast('а');
        dec.addLast('9');
        dec.addLast('(');
        dec.addLast('о');
        dec.addLast('д');

        new task2(dec, str);
        //task3
        System.out.print("task 3: ");
        new task3(4, 'A','B','C');
        //task4
        String str4 = "((((1151()))()))";
        new task4(str4);
        //task 5
        String str5 = "[]";
        new task5(str5);
        //task6
        String str6 = "111qqqwww111--1q-_+";
        new task6(str6);
        System.out.println();
        //task7
        int[] arr7 = {1, -15, 16, 71};
        new task7(arr7);
        System.out.println();
        //task8
        String str8 = "15 q1 1521 qwt";
        new task8(str8);
        System.out.println();
        //task9
        String str9="(F+(T*F+(F+T)))X(NT)";
        new task9(str9);
        //task10
        String str10="N(9,(M(1,N(1,2))))";
        new task10(str10);
        //task11
        String str11="x+(y+z+(z+y)))";
        new task11(str11);
    }
}

