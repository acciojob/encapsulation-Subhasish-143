package com.driver;

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        RWOnly rw = new RWOnly();
        
        // wrong step 1st-- 
        //rw.name = str;
        // Error:- name has private access in Encapsulate
        
        rw.setName(str);
        System.out.println(getName());
    }
}
