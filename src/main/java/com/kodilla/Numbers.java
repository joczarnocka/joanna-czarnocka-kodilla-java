package com.kodilla;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
* Napisz metodę: public int solution(int[] A);
Metoda ta, będzie przyjmować tablicę liczb. Wynikiem powinna być najmniejsza dodatnia liczba, która nie występuje w tablicy A.

Przykład:
A = [1, 3, 6, 4, 1, 2] - metoda powinna zwrócić 5
A = [1, 2, 3] - metoda powinna zwrócić 4
A = [-3, -1] - metoda powinna zwrócić 1

Pomocny kod:
public static void main(String[] args) {
int[] lista = new int[] {1, 2, 4, 5};
int result = solution(lista);
wyswietlWynik(lista, result);

int[] lista2 = new int[] {1, 4, 8, 3, 2};
int result2 = solution(lista2);
wyswietlWynik(lista2, result2);

int[] lista3 = new int[] {-3, -1};
int result3 = solution(lista3);
wyswietlWynik(lista3, result3);

int[] lista4 = new int[] {1, 3, 6, 4, 1, 2};
int result4 = solution(lista4);
wyswietlWynik(lista4, result4);
}

public static void wyswietlWynik(int[] arr, int result) {
StringBuilder builder = new StringBuilder();
builder.append("Wynik dla tablicy: ");
for (int a : arr) {
builder.append(a);
builder.append(" ");
}
builder.append("to: ");
builder.append(result);
System.out.println(builder.toString());
}
* */
public class Numbers {

    public static int solution(int[] A) {

        Set<Integer> hs = new HashSet<>();

        for (Integer i : A) {
            hs.add(i);
        }

        int j = 1;
        while (hs.contains(j)) {
            j++;
        }
        return j;
        //inaczej sotowanie tablicy:

    }



    public static int solutionArraySort(int[] A) {
        int num = 1;
        Arrays.sort(A);
        for(int number: A) {
            if (number == num) {
                num++;
            }
        }
        return num;
    }


    public static void main(String[] args) {


        int[] lista = new int[]{1, 2, 4, 5};
        long t1 = System.nanoTime();
        int result = solution(lista);
        long t2 = System.nanoTime();
        System.out.println("time solution " + (t2-t1));
        wyswietlWynik(lista, result);

        //int[] lista = new int[]{1, 2, 4, 5};
        t1 = System.nanoTime();
        result = solutionArraySort(lista);
        t2 = System.nanoTime();
        System.out.println("time solutionArrayList " + (t2-t1));
        wyswietlWynik(lista, result);


        int[] lista2 = new int[]{1, 4, 8, 3, 2};
        t1 = System.nanoTime();
        int result2 = solution(lista2);
        t2 = System.nanoTime();
        System.out.println("time solution " + (t2-t1));

        t1 = System.nanoTime();
        result2 = solutionArraySort(lista2);
        t2 = System.nanoTime();
        System.out.println("time solution " + (t2-t1));
        wyswietlWynik(lista2, result2);



        int[] lista3 = new int[]{-3, -1};
        t1 = System.nanoTime();
        int result3 = solution(lista3);
        t2 = System.nanoTime();
        System.out.println("time solution " + (t2-t1));


        t1 = System.nanoTime();
        result3 = solutionArraySort(lista3);
        t2 = System.nanoTime();
        System.out.println("time solution " + (t2-t1));

        wyswietlWynik(lista3, result3);



        int[] lista4 = new int[]{1, 3, 6, 4, 1, 2};
        t1 = System.nanoTime();
        int result4 = solution(lista4);
        t2 = System.nanoTime();
        System.out.println("time solution " + (t2-t1));

        t1 = System.nanoTime();
        result4 = solutionArraySort(lista4);
        t2 = System.nanoTime();
        System.out.println("time solution " + (t2-t1));

        wyswietlWynik(lista4, result4);
    }

    public static void wyswietlWynik(int[] arr, int result) {
        StringBuilder builder = new StringBuilder();
        builder.append("Wynik dla tablicy: ");
        for (int a : arr) {
            builder.append(a);
            builder.append(" ");
        }
        builder.append("to: ");
        builder.append(result);
        System.out.println(builder.toString());
    }
}




