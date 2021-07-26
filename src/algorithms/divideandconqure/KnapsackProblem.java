package algorithms.divideandconqure;

import java.util.*;

/*
0/1 Knapsack Problem – Divide & Conquer – Top Down (No Memoization) – Recursion
 */
public class KnapsackProblem {
    static List<Items> itemsList = new ArrayList<>();
    static class Items{
        String name;
        int weight;
        int value;

        public Items(String name,int weight, int value) {
            this.name = name;
            this.weight = weight;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        int maxBagWeight = 50;
        itemsList.add(new Items("T1",12,100));
        itemsList.add(new Items("T2",32,200));
        itemsList.add(new Items("T3",33,50));
        itemsList.add(new Items("T4",5,60));
        itemsList.add(new Items("T5",34,150));
//        itemsList.add(new Items("T1",10,60));
//        itemsList.add(new Items("T2",20,100));
//        itemsList.add(new Items("T3",30,120));
        System.out.println("value= " + knapsack(itemsList,maxBagWeight, itemsList.size()));
    }

    private static int knapsack(List<Items> itemsList, int maxBagWeight, int index) {
            if(index == 0||maxBagWeight ==0){
                return 0;
            }
            if(itemsList.get(index-1).weight>maxBagWeight){
                return knapsack(itemsList,maxBagWeight,index-1);
            }
            int weight = maxBagWeight- itemsList.get(index-1).weight;
            return Math.max(itemsList.get(index-1).value + knapsack(itemsList,weight,index-1),
                    knapsack(itemsList,weight,index-1));
    }

}
