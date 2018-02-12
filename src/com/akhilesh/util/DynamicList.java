/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.util;

/**
 *
 * @author Akhilesh
 */
public interface DynamicList<T> extends Iterable<T>{
    void add(T t);
    T get(int index);
    int size();
    void sort(boolean flag);
}
