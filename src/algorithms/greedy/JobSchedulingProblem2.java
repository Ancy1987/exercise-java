package algorithms.greedy;
/*
You have the following:

List of all the tasks that you need to complete today
Time that is required to complete each task
Priority (or weight ) to each work.
You need to determine in what order you should complete the tasks to get the most optimum result.

To solve this problem you need to analyze your inputs. In this problem, your inputs are as follows:

Integer N for the number of jobs you want to complete
Lists P: Priority (or weight)
List T: Time that is required to complete a task
 */
public class JobSchedulingProblem2 {
    static class Job implements Comparable<JobSchedulingProblem.Job>{
        char id;
        int deadline;
        int profit;

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }

        @Override
        public int compareTo(JobSchedulingProblem.Job o) {
            return o.profit-this.profit;
        }
    }
}
