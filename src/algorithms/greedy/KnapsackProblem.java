package algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
0/1 Knapsack Problem - Integer Knapsack Problem
 */
public class KnapsackProblem {
    static List<Treasure> treasureList = new ArrayList<>();
    static class Treasure implements Comparable<Treasure>{
        String name;
        int weight;
        int value;

        public Treasure(String name, int weight, int value) {
            this.name = name;
            this.weight = weight;
            this.value = value;
        }
        @Override
        public int compareTo(Treasure o) {
            return o.value - this.value;
        }
    }
    public static void main(String[] args) {
        int maxBagWeight = 50;
//        treasureList.add(new Treasure("T1",10,60));
//        treasureList.add(new Treasure("T2",20,100));
//        treasureList.add(new Treasure("T3",30,120));
        treasureList.add(new Treasure("T1",11,100));
        treasureList.add(new Treasure("T2",32,200));
        treasureList.add(new Treasure("T3",33,50));
        treasureList.add(new Treasure("T4",5,60));
        treasureList.add(new Treasure("T5",34,150));

        Collections.sort(treasureList);
        treasureList.forEach(treasure -> System.out.println(treasure.name+"-"+treasure.weight+"-"+treasure.value));
        System.out.println("Picked treasures = "+ printTreasuresTaken(treasureList,maxBagWeight));
    }

    private static List<String> printTreasuresTaken(List<Treasure> treasureList, int size) {
        List<String> treasurePicked = new ArrayList<>();
        AtomicInteger remaining = new AtomicInteger(size);
        treasureList.forEach(item ->{
            if(remaining.get() == 0){
                return;
            }
            if(item.weight<= remaining.get()){
               int rem = remaining.get()-item.weight;
                remaining.set(rem);
                treasurePicked.add(item.name+"-"+item.weight);
            }
        });
        return treasurePicked;
    }


}
