package Misc.amz;

/**
 * You are given a list of tasks and the dependent tasks which have to be completed before given task.
 * You need to output the order in which tasks should be scheduled.
 *
 * Example:
 * Input - [[1,0],[2,0],[3,1],[3,2]]
 * Output - 0,1,2,3
 *
 *
 * Explanation :
 * Task 1 is dependent on task 0
 * Task 2 is dependent on task 0
 * Task 3 is dependent on task 1 and 2.
 * So you should finish 0th task first, followed by 1/2 or 2/1, followed by task 3.
 */
public class TaskDependentSequence {
}
