# Question on Shortest Job First | Operating System - M02 P06

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will see a question on shortest job first and try to understand the concepts of SJF operation in an operating system._

***Question:*** The gantt chart for pre-emptive shortest job first scheduling algorithm will be?

Process No. | Arrival time | Burst time |
--- | --- | --- |
P1 | 0 | 7 |
P2 | 1 | 4 |
P3 | 2 | 8 |

i.) 
![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606137184947/6dbL8q45-.png)
<!-- First image will come here -->

ii.) 
![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606137201141/FQWZRpps_.png)
<!-- Second image will come here -->

iii.) 
![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606137210242/McC7DdqgS.png)
<!-- Third image will come here -->

iv.) 
![Untitled Diagram (3).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606137224563/mNYxCz6MH.png)
<!-- Forth image will come here -->

***Answer:*** (iv.) ![Untitled Diagram (3).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606137224563/mNYxCz6MH.png)
<!-- Forth image will come here -->

***Explanation:***
- Pre-emptive shortest job first (SJF) is also known as _shortest remaining time first_.
- Gantt chart always starts from zero.
- The process `P1` arrives at CPU at time unit `0` with burst time of `7` units, it get executed for `1` unit of time. Now the remaining burst time of process `P1` is `6`.
- At time unit `2` process `P2` also arrives at the CPU with burst time of `4` units less than the burst time of `P1`, so `P1` will be preempt and `P2` will start executing, it will get executed completely and terminated because no other process have less burst time then it.
- Process `P3` has already arrived to CPU at time unit `2`.
- If we check the time units of the both the processes present in the ready queue, we see that `P1` have burst time of `6` unit left and `P3` have `8` units of burst time. So, `P1` will again start its execution till it ends.
- `P1` ends at time unit `11` and then `P3` start its execution and get terminate at time unit `19`.

_So, this was all about pre-emptive shortest job first CPU scheduling algorithm in an operating system. Hope you liked it and learned something from it._

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