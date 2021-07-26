package algorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
In this problem, they give an array of jobs where every job has a deadline and associated profit if the
 job is finished before the deadline. And they say that every job takes a single unit of time,
 so the minimum possible deadline for any job is 1. The question asks how to maximize the total
 profit if only one job can be scheduled at a time.
 */
public class JobSchedulingProblem {

    static class Job implements Comparable<Job>{
        char id;
        int deadline;
        int profit;

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }

        @Override
        public int compareTo(Job o) {
            return o.profit-this.profit;
        }
    }

    public static void main(String[] args) {
        List<Job> jobs =new ArrayList<>();
        jobs.add(new Job('a', 4, 100));
        jobs.add(new Job('b', 2, 11));
        jobs.add(new Job('c', 3, 43));
        jobs.add(new Job('d', 1, 30));
        jobs.add(new Job('e', 4, 5));

       // 1) Sort all jobs in decreasing order of profit.
        Collections.sort(jobs);
       jobs.forEach(job -> System.out.println(job.id+"-"+job.deadline+"-"+job.profit));
      printJobScheduling(jobs,jobs.size());

    }

    private static void printJobScheduling(List<Job> jobs, int size) {
        Boolean[] slots = new Boolean[size];
        // slots array should be filled with boolean false
        Arrays.fill(slots,false);
        int result[] = new int[size];

        //fill the result array index according to max profit
        for(int i=0;i<size;i++){
            for (int j = jobs.get(i).deadline - 1; j >= 0; j--) {
                System.out.println(jobs.get(i).id);
             if(!slots[j]){
                 result[j]=i;
                 slots[j]=true;
                 break;
             }
            }
        }
        //print the jobs according to the maximum profit with deadline
        for (int i = 0; i < jobs.size(); i++) {
            if (slots[i])
                System.out.print(jobs.get(result[i]).id + " -> ");
        }


}
}
