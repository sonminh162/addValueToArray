package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size,i,index,x;
        int[] array,newArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("kich co mang:");
        size = scanner.nextInt();
        array = new int[size+1];
        newArray = new int[size+1];
        System.out.print("nhap cac gia tri:\n");
        for(i=0;i<array.length-1;i++){
            array[i]=scanner.nextInt();
        }
        System.out.print("in ra danh sach ban dau:\t");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.print("\n");
        System.out.print("nhap vao gia tri can chen:");
        x = scanner.nextInt();
        System.out.print("nhap vao vi tri can chen:");
        index = scanner.nextInt();
        newArray[index-1]=x;
        for(i=0;i<index-1;i++){
            newArray[i]=array[i];
        }
        for(i=index;i<size+1;i++){
            newArray[i]=array[i-1];
        }
        System.out.print("in ra danh sach mang sau khi chen:\t");
        for(i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+"\t");
        }
    }
}
