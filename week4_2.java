package com.company;

import java.util.*;

public class week4_2 {
    public static void main(String[] args) {
        Scanner shyn = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<>();

        int a = shyn.nextInt();

        for (int i = 0; i < a; i++){
            list.add(shyn.nextInt());
        }

        sort(list);
        for (Number number : list) {
            System.out.print(number + " ");
        }

    }

    public static void sort(ArrayList<Number> list) {

        for(int i = 0; i < list.size(); i++) {
            Number Min = list.get(i);
            int In = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j).intValue() > Min.intValue()) {
                    Min = list.get(j);
                    In = j;
                }
            }

            if (In != i) {
                list.set(In, list.get(i));
                list.set(i, Min);
            }
        }
        }

    }

