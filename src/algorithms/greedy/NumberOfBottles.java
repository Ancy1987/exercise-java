package algorithms.greedy;

import java.util.Arrays;

/*
You are given container full of water. Container can have limited amount of water.
You also have N bottles to fill. You need to find the maximum numbers of bottles you can fill.

Input:
First line contains one integer, T, number of test cases.
First line of each test case contains two integer, N and X, number of bottles and capacity of the container.
Second line of each test case contains N space separated integers, capacities of bottles.

Output:
For each test case print the maximum number of bottles you can fill.

Constraints:
1≤T≤100
1≤N≤10^4
1≤X≤10^9
1≤capacity of bottle≤10^6

SAMPLE INPUT
1
5 10
8 5 4 3 2

SAMPLE OUTPUT
3
 */
public class NumberOfBottles {


    public static void main(String[] args) {
        int n= 5;
        int x = 10;
        int[] a= {8,5,4,3,2,1,1};
        Arrays.sort(a);
        int maxNoofBottle= 0;
        int sum = 0;
        for(int i=0;i<a.length;i++){
           if(a[i]<x && a[i]+sum <x){
               sum += a[i];
               maxNoofBottle++;
           }
        }
        System.out.println("Maximum "+maxNoofBottle);
    }

}
