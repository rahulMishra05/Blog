# Shortest Remaining Time First | Operating System - M02 P05

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will try to understand about **shortest remaining time first** CPU scheduling in an operating system with the help of a question. But before that let’s get a little bit idea about SRTF._

### Shortest remaining time first
- Shortest job first (SJF) with **pre-emptive** mode is known as shortest remaining time first. 
- A criterion of SRTF is burst time.
- Mode of SRTF is pre-emptive.
- We execute the process for every one unit of time and check that at that particular time is there any processes which have less burst time. If yes then the current process will get preempt and execution of the process with less burst time will be started.

_Let us understand about shortest remaining time first scheduling with an example. We have to complete this table by solving this question by using **ghantt chart**._

Process No. | Arrival time | Burst time | Completion time | Turnaround time | Waiting time | Response time |
--- | --- | --- | --- | --- | --- | ---| 
P1 | 0 | 5 | | | | |
P2 | 1 | 3 | | | | |
P3 | 2 | 4 | | | | |
P4 | 4 | 1 | | | | |

Before solving this question you need to keep few points in mind.
- If at particular time a process is in CPU and is being execute, but there a process arrives in ready queue which have less burst time then the already executing process, then in that case the executing process will get preempt and the new arrived process will start getting executed. 
- If one process has arrived at a particular time than we will not check the burst time and execute that process, while if multiple process arrive at same time so in that case we will check the burst time and process with least burst time will be executed first.
- If there is situation that the burst time of two processes is same then we will execute that process whose arrival time is less means the process who had arrived first.
- If there is a situation that the burst time and arrival time of two processes is same, then you can select the process to execute by the process Id, process with less process Id will be executed first.

<!-- First image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605961526734/FyZR_f4ij.png)
- The process `P1` arrives at time unit `0` therefore it started executing. For 1 unit of time
- It will execute for one unit of time because we have to check that is there any process which have less burst time in the ready queue then `P1`.
- And yes `P2` have less burst time then `P1`.

<!-- Second image will come here -->

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605961541438/5o9T_xVeF.png)
- `P1` will get preempt and `P2` start executing because P2’s burst time is less than that of P1’s burst time.
- `P2` keep executing for `3` unit of time because no process in the ready queue have less burst time then it. And get terminated after executing completely.
- Now `P1`, `P3` and `P4` are in ready queue.

<!-- Third image will come here -->

![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605961550467/SPReNK56q.png)
- In the ready queue `P1`, `P3` and `P4` processes are present, and in all them `P4` has the least burst time so it will get executed.
- As `P4` required `1` unit time to complete so it get completely executed and terminated.
- Now, we have `P1` and `P3` in the ready queue.

<!-- Forth image will come here -->

![Untitled Diagram (3).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605961566192/epyFriYAB.png)
- `P1` and `P3` both have `4` unit of burst time remaining. `P1` has initially `5` unit burst time but in starting it get executed for `1` unit of time.
- We will execute `P1` because it had arrived earlier.
- It will be executed for `4` unit of time as there is no other processes which have less burst time remaining then it.

<!-- Fifth image will come here -->

![Untitled Diagram (4).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605961575248/cyGg-hSMc.png)
- As no other process is remaining therefore `P3` will get executed completely for `4` unit of time and then get terminated.

_All the process got completely executed. Now we will complete the table, but for it you need to know some formulas._
- **Completion time:** The time at which process completes its execution.
- **Turnaround time =** `Completion time - Arrival time`
- **Waiting time =** `Turnaround time - burst time`
- **Response time =** `CPU first time allocated – Arrival time.`

So, the final table obtained will be.

Process No. | Arrival time | Burst time | Completion time | Turnaround time | Waiting time | Response time |
--- | --- | --- | --- | --- | --- | ---| 
P1 | 0 | 5 | 9 | 9| 4 | 0 |
P2 | 1 | 3 | 4 | 3 | 0 | 0 |
P3 | 2 | 4 | 13 | 11 | 7 | 7 |
P4 | 4 | 1 | 5 | 1 | 0 | 0 |

_So, this was all about **Shortest Remaining Time First (SRTF)**. Hope you like it and learned something new from it._

If you have any doubt, question, queries related to this topic or just want to share something with me, then please feel free to contact me.

### 📱 Contact Me

[Twitter](https://twitter.com/r_mishra10),
[LinkedIn](https://www.linkedin.com/in/rahul-mishra-66210b185),
[Telegram](https://t.me/rahul_mishra10),
[Instagram](https://www.instagram.com/rahul_mishra10/?hl=en),

### 📧 Write a mail
<rahulmishra102000@gmail.com>

#### 🚀 Other links

[GitHub](https://github.com/rahulMishra05),
[HackerRank](https://www.hackerrank.com/rahulmishra10201)