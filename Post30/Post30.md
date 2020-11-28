# Multilevel Feedback Queue Scheduling | Operating System - M02 P11

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will see about the multilevel feedback queue scheduling, which is a solution for the multilevel queue scheduling._

### Multilevel feedback queue
- We use multilevel feedback queue, to overcome the problem that arrives in multilevel queue scheduling.
- In multilevel queue scheduling problem of **starvation** is present.
- Starvation in CPU scheduling means that, if multiple process of system process arrives than the processes of interactive process and batch process will not get executed.
- This is because in multilevel queue scheduling system process has highest priority, then interactive process has medium priority and batch process has least priority.
- So, when more number of processes of high priority will arrive then processes of other categories having low priority will not get executed, which is a problematic situation. 

<!-- Image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606567818218/01TrhVuJb.png)
- Suppose we have a process P1 in the lowest priority ready queue.
- As it is in lowest priority ready queue its time quantum for which it can execute is very less.
- It will execute for that time period and then if it got terminated then it will be removed from the ready queue.
- If the process do not complete then its feedback will be given to the upper priority queue having more time quantum to execute a process, and then the process will get execute there.
- This will keep happening if the process does not get terminated.
- If the process not get terminated and arrive in highest priority ready queue, then there it will get executed by following the principle of _FCFS (First Come First Serve)_
- Giving feedback means that we are shifting the process from the lower priority ready queue to upper priority queue and that to by maintaining its state so we do not need to execute it from beginning, we do that by using _PCB (process control block)_.

_This was all about multilevel feedback queue. Hope you liked it and learn something new from it._

If you have any doubt, question query related to this topic or just want to share something with me, then please feel free to contact me. 

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