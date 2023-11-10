# Coding-Test-Questions

I have provided solutions to the following coding test interview questions.

# Problem 1: [Task-Scheduling-Preemption](problem_1.java) - IBM Coding Test


Write a program for preemptive scheduling of tasks. The input is a log array containing strings in the format ["task_id:start/end:timestamp"]. The priority of each task is represented as 0 << 1 << 2 << 3 << ... << n. The output should be an integer array of size n representing the execution time of each task.

For example, given the log array ["0: start :0", "1: start :3", "1: end :6", "0: end :10"], the expected output is an integer array of size 2 with values 7 and 4. Here's an explanation: Task 0 starts at 0 seconds and continues until 3 seconds, then Task 1 arrives and starts execution. Task 0 is preempted. Task 1 ends at 6 seconds, and the preempted Task 0 resumes execution at 7 seconds, finally ending at 10 seconds.
