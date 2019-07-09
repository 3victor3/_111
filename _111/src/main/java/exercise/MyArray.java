package exercise;

import java.util.ArrayList;

public class MyArray {
    //
    private int[] intArray;
    //
    private int elems;
    //
    private int length;

    //
    public MyArray(){
        elems = 0;
        length = 50;
        intArray = new int[length];
    }

    //
    public MyArray(int length){
        elems = 0;
        this.length = length;
        intArray = new int[length];
    }

    //
    public int getSize(){
        return elems;
    }

    //
    public void display(){
        for (int i=0; i<elems; i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
    }

    //
    public boolean add(int value){
        if (elems == length){
            return false;
        }else {
            intArray[elems] = value;
            elems++;
            return true;
        }
    }

    //
    public int getElems(int i){
        if (i<0 || i>elems){
            System.out.println("Access Subscript Crossing Borders");
        }
        return intArray[i];
    }

//    public int find(int SearchValue){
//        for (int i=0; i<elems; i++){
//            if (intArray[i] == SearchValue){
//                return i;
//            }
//        }
//        return -1;

    //

    public int find(int SearchValue){
        int i;
        for (i=0; i<elems; i++){
            if (intArray[i] == SearchValue){
                break;
            }
        }
        if (i == elems){
            return -1;
        }
        return i;
    }

    //
    public boolean delete(int value){
        int k = find(value);
        if (k == -1){
            return false;
        }else if (k == elems){
            elems--;
        }else {
            for (int i=k; i<elems-1; i++){
                intArray[i] = intArray[i+1];
            }
            elems--;
        }
        return true;
    }

    //
    public boolean modify(int oldValue, int newValue){
        int i = find(oldValue);
        if (i == -1){
            return false;
        }else {
            intArray[i] = newValue;
        }
        return true;
    }



}
