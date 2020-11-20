# Shortest Job First | Operating System - M02 P04

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will try to understand about “shortest job first” CPU scheduling in an operating system with the help of a question. But before that let’s get a little bit idea about SJF._

### Shortest job first
- Criteria of shortest job first are **burst time**. This means we will execute that process first which will be completed in least time.
- Mode of shortest job first is **non pre-emptive**. This means if we give a process to CPU then it will be executed completely without any kind of interruption.

Let’s see one question and try to solve it using the principal of ***shortest job first***

Process No. | Arrival time | Burst time | Completion time | Turnaround time | Waiting time | Response time |
--- | --- | --- | --- | --- | --- | --- |
P1 | 1 | 3 | | | | |
P2 | 2 | 4 | | | | |
P3 | 1 | 2 | | | | |
P4 | 4 | 4 | | | | |

_Before solving question, it is good to know the following points._
- If one process has arrived at a particular time than we will not check the burst time and execute that process, while if multiple process arrive at same time so in that case we will check the burst time and process with least burst time will be executed first.
- If there is situation that the burst time of two processes is same then we will execute that process whose arrival time is less means the process who had arrived first.
- If there is a situation that the burst time and arrival time of two processes is same, then you can select the process to execute by the process Id, process with less process Id will be executed first.

<!-- First image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605873428945/StOymvKkA.png)
- In starting for 1 unit of time no process has arrived to CPU, that’s why CPU will remain idle during that time.

<!-- Second image will come here -->

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605873466165/YH5d9avNt.png)
- Now at time unit 1 two processes has arrived at CPU P1 and P3. Process P3 has less burst time so it will be executed first for 3 unit of time.

<!-- Third image will come here -->

![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605873475680/ewjuyrKdh.png)
- Now, when P3 was executing at time 2 another process named P2 arrived at CPU, so now we have two process at ready queue P1 and P2, but the burst time of P1 is less than that of P2 that’s why P1 will be executed first for 3 unit of time.

<!-- Forth image will come here -->

![Untitled Diagram (3).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605873492254/w0oXlmVKg.png)
- The CPU is at 6 time unit now, and again we have two process in the ready queue P2 and P4, note that the burst time of both the process is same, so we will execute the process with less arrival time, means that the process which arrives first at the CPU will get executed. So P2 arrived earlier that’s why P2 will get executed.

<!-- Fifth image will come here -->

![Untitled Diagram (4).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605873504004/RkYHVbKOD.png)
- Now only P4 process is remaining and it is already in the ready queue, so it will get executed for 4 unit of time. 

All the process got completely executed. Now we will complete the table, but for it you need to know some formulas.
- **Completion time:** The time at which process completes its execution.
- **Turnaround time =** `Completion time - Arrival time`
- **Waiting time =** `Turnaround time - Burst time`
- **Response time:** In case of non pre-emptive process response time is equal to waiting time.

So, the final table obtained will be.

Process No. | Arrival time | Burst time | Completion time | Turnaround time | Waiting time | Response time |
--- | --- | --- | --- | --- | --- | --- |
P1 | 1 | 3 | 6 | 5 | 2 | 2 |
P2 | 2 | 4 | 10 | 8 | 4 | 4 |
P3 | 1 | 2 | 3 | 2 | 0 | 0 |
P4 | 4 | 4 | 14 | 10 | 6 | 6 |

_So, this was all about Shortest Job First (SJF). Hope you like it and learned something new from it._

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