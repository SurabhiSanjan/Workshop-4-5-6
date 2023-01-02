package org.example;
import java.util.*;
import java.util.stream.*;

public class MinMax {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();
        number.add(4);
        number.add(5);
        number.add(2);
        number.add(6);
        number.add(7);
        number.add(33);
        number.add(45);
        number.add(32);
        number.add(45);
        number.add(89);
        number.add(102);
        number.add(117);
        number.add(8);
        number.add(10);
        number.add(11);
        number.add(18);

        // Get the max value
        Integer max = number.stream().max(Integer::compare).get();
        System.out.println("maximum value is " + max);
        // Get the min value
        Integer min = number.stream().min(Integer::compare).get();
        System.out.println("minimum value is " + min);

        // Get duplicate value
        Set<Integer> list1= number.stream().filter(n-> Collections.frequency(number,n)>1).collect(Collectors.toSet());
        System.out.println(list1);
        }

    }


