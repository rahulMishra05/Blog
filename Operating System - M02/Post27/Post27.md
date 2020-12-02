# Pre-emptive Priority Scheduling Algorithm | Operating System - M02 P08

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will see about priority scheduling algorithm with pre-emptive in an operating system with the help of a question._

### Pre-emptive priority scheduling algorithm
- The criterion of this scheduling algorithm is **priority**, which means the process with height priority will be executed first.
- The mode of pre-emptive priority scheduling algorithm is as the name suggest **pre-emptive**.

Let us understand about pre-emptive priority scheduling algorithm with an example. We have to complete this table by solving this question by using gantt chart.

Process No. | Priority | Arrival time | Burst time | Completion time | Turnaround time | Waiting time |
--- | --- | --- | --- | --- | --- | --- |
P1 | 10 | 0 | 5 | | | |
P2 | 20 | 1 | 4 | | | |
P3 | 30 | 2 | 2 | | | |
P4 | 40 | 4 | 1 | | | |

***Higher the number higher the priority***

Before solving this question you need to keep few point in mind.
- We have to check that what does the priority means that is _(higher the number higher the priority)_ or _(higher the number lower the priority.)_
- In case if the priority of two processes is same then check the arrival time and treat as _(first come first serve)_, generally in question how to deal with such conflicts is mentioned but if nothing is mentioned then you can easily follow _(FCFS)_.
- If arrival time is also same then in that case execute according to the ID of the process.

<!-- First image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606306966646/uhVHe307C.png)
- The process `P1` arrives at time unit `0` so it starts executing.
- We execute `P1` for `1` time unit only because at time unit `1` another process with higher priority arrives in the ready queue, so `P1` will get preempted.

<!-- Second image will come here -->

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606306984496/74O1DnF8w.png)
- P2’s execution will start as it has higher priority than `P1`.
- `P2` will get executed for `1` unit of time because at time unit `2` another process with higher priority arrives in the ready queue, `P2` will get preempted.

<!-- Third image will come here -->

![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606306993659/n4t6INjCN.png)
- `P3` will start executing as it has higher priority than `P2` and `P1`.
- `P3` will get executed for `2` unit of time and then get terminated as its burst time is `2`.

<!-- Forth image will come here -->

![Untitled Diagram (3).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606307004233/_pqhkKxdZ.png)
- `P4` will execute for `1` unit of time and then get terminated as its burst time is only `1`.
- Now the process from the ready queue will again come in the running state.

<!-- Fifth image will come here -->

![Untitled Diagram (4).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606307014852/qB-Yi19kn.png)
- P2’s execution will start again as it is the process with height priority.
- It will get executed `3` unit of time and then get terminated as it got complete.

<!-- Sixth image will come here -->

![Untitled Diagram (5).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606307023009/fDTydTfzN.png)
- `P1` is the only process in the ready queue all the other processes are terminated, so it will execute completely.

All the process got completely executed. Now we will complete the table, but for it you need to know some formulas.
- **Completion time:** The time at which process completes its execution.
- **Turnaround time =** `Completion time – arrival time`.
- **Waiting time =** `Turnaround time – burst time`.

Process No. | Priority | Arrival time | Burst time | Completion time | Turnaround time | Waiting time |
--- | --- | --- | --- | --- | --- | --- |
P1 | 10 | 0 | 5 | 12 | 12 | 7 |
P2 | 20 | 1 | 4 | 8 | 7 | 3 |
P3 | 30 | 2 | 2 | 4 | 2 | 0 |
P4 | 40 | 4 | 1 | 5 | 1 | 0 |

_So, this was all about **Pre-emptive priority scheduling algorithm**. Hope you like it and learned something new from it._

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