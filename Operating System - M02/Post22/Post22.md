# First Come First Serve (FCFS) CPU Scheduling | Operating System - M02 P03

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will try to understand the concept of first come first serve CPU scheduling with the help of an example._

### FCFS
- Criteria for FCFS is `arrival time` which means that the process come first will be executed first.
- Mode is `non pre-emptive` which means that, if a process comes into `running state` from `ready state`, it will not be sent back to `ready state` it will be executed completely and terminated.

This is a table we will solve this question with the help of **Gantt chart.**

Process | Arrival time | Burst time | Completion time | Turnaround time | Waiting time | Response time |
--- | --- | --- | --- | --- | --- | --- |
P1 | 0 | 2 | | | | 
P2 | 1 | 2 | | | |
P3 | 5 | 3 | | | |
P4 | 6 | 4 | | | |

We have given the arrival time and burst time of the processes.


![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605792631004/kXe1zPWOH.png)
- **P1** arrives to CPU at 0 and we start executing it for 2 time duration. And after executing for 2 time durations the process will get terminated.


![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605792656240/tDkUIzTRE.png)
- The process **P2** has already at time duration 1, but because another process was getting execute P2 was in ready queue.
- Now, we will take the process P2 form ready queue and start executing it. It will execute for 2 unit of time and after that it will get terminated.


![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605792669480/t0-yH4ptl.png)
- Now, a special situation is happed, that the current time unit is 4 while the next process which is P3 will arrive on time unit 5, that’s why CPU will remain idle for 1 unit of time.


![Untitled Diagram (3).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605792686581/TxczR_zE2.png)
- At time unit 5 process **P3** will arrive and as the CPU is free it will start executing it. It get executed for 3 time units and got terminated.


![Untitled Diagram (4).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605792699062/u8yZNl20o.png)
- The last process **P4** had arrived at 6, but as the CPU was busy in executing process P3 the process was in ready queue. It got chance to get executed at time unit 8 and got executed for 4 time unit and then terminated.

_All the process got completely executed. Now we will complete the table, but for it you need to know some formulas._

- **Completion time:** The time at which process completes its execution.
- **Turnaround time =** `Completion time - Arrival time`
- **Waiting time =** `Turnaround time - Burst time`
- **Response time:** In case of _non pre-emptive_ process response time is equal to waiting time.

_So, the final table obtained will be._

Process | Arrival time | Burst time | Completion time | Turnaround time | Waiting time | Response time |
--- | --- | --- | --- | --- | --- | --- |
P1 | 0 | 2 | 2 | 2 | 0 | 0 |
P2 | 1 | 2 | 4 | 3 | 1 | 1 |
P3 | 5 | 3 | 8 | 3 | 0 | 0 |
P4 | 6 | 4 | 12 | 6 | 2 | 2 |

_So, this was all about **First Come First Serve (FCFS)**, hope you like it and learned something new from it._

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