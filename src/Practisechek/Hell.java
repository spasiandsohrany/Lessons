package Practisechek;

import java.util.Scanner;

public class Hell {
    public void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int age = x.nextInt();
        System.out.println(determineGroup(age));
    }
    public int determineGroup(int age) {
        String s= age >=7 && age<=13 ? "1" : "-1";
        return Integer.parseInt(s);
    }
}

