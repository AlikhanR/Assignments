package com.company;

import java.util.*;

    public class week4_1 {
        public static void main(String[] args) {
            ArrayList<Number> list = new ArrayList<>();
            Scanner shyn = new Scanner(System.in);

            int n = shyn.nextInt();
            for(int i = 0; i < n; i++){
                list.add(shyn.nextInt());
            }

            shuffle(list);

            for (Number number : list) {
                System.out.print(number + " ");
            }
        }

        public static void shuffle(ArrayList<Number> list) {
            for (int i = 0; i < list.size(); i++) {
                int rn = (int) (Math.random() * list.size());
                Number temp = list.get(rn);
                list.set(rn, list.get(i));
                list.set(i, temp);
            }
        }
    }
