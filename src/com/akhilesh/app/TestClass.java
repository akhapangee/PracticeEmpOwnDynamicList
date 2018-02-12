/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.app;

import com.akhilesh.util.DynamicList;
import com.akhilesh.util.MyList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Akhilesh
 */
public class TestClass {

    public static void main(String[] args) {
        DynamicList<Integer> obj = new MyList<>();
        obj.add(4);
        obj.add(3);
        obj.add(5);
        obj.add(1);
        
       
        for(Integer n: obj){
            System.out.println(n);
        }

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        Collections.sort(list);
        System.out.println("");
        
        for(int i =0; i<list.size(); i++){
          Integer num = list.get(i);
//            System.out.println(num);
        }
        
        
        
    }
    
}
