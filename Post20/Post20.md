# Process Scheduling Algorithms | Operating System - M02 P01

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will about process scheduling algorithms. Broadly scheduling algorithms are divided into two parts **Pre-emptive** and **Non pre-emptive**, and both contain several different algorithms._

### Scheduling algorithms
- It is a way of selecting a process from `ready` queue and putting it on CPU.
- According to the degree of multiprogramming, we try to keep multiple processes on the ready queue.

### Pre-emptive

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605624716540/qBxRaiYGG.png)
- In pre-emptive process the process can be sent back to `ready` state from `running` state. Due to many conditions like time quantum or priority. 
- This is used to achieve multiprocessing environment.

### Non pre-emptive

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605624726091/02linhVdo.png)
- In non pre-emptive the process that has been sent to `running` state from `ready` state will not come back to `ready` state, after reaching `running` state, it will be executed completely and get terminated.
- This approach is generally used in Batch operating system.

### Algorithms
Both pre-emptive and non pre-emptive processes have different type algorithms.
- **Pre-emptive:**
    - SRTF (Shortest remaining time first)
    - LRTF (Longest remaining time first)
    - Round Robin.
    - Priority based.
- **Non pre-emptive:**
    - FCFS (First come first serve)
    - SJF (Shortest job first)
    - LJF (Longest job first)
    - HRRN (Highest response ratio next)
    - Multilevel queue/ multilevel feedback queue.

_So, this was a brief about “process scheduling algorithm”. Hope you liked it and learned something new from it._

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