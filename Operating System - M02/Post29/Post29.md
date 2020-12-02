# Multi Level Queue Scheduling | Operating System - M02 P10

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the second module which consists of 11 articles.**

_In this article we will that what is multi level queue scheduling in an operating system._

### Multi level queue scheduling
- Till now in this article series you have seen that we are trying to put as much possible process on the ready queue, and then we execute all the process one-by-one.
- But in real life more than one type of process are present in the operating system, so this concept the earlier concept was not useful in the real life scenario. 
- While in multi level queue there are generally three types of process **system process**, **interactive process** and **batch process.**

<!-- Image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1606486672420/wXAbDT_vn.png)
- System process has the heights priority in the operating system. For example if a system process like _interpret_ take place then operating system will give it the highest priority and execute it first at any cost.
- Interactive process has the medium priority in the operating system. For example _video playing_, _coding_ etc.
- Batch process has the lowest priority in the operating system, these processes run in the background while we are using our system. 
- So, when there is different type of process than one type of ready queue is useless and not beneficial. 
- That’s why in multi level queue scheduling there is different queue for different process.
- One more thing that different processes can have different scheduling algorithms, suppose system process follow _round robin scheduling algorithm_, interactive process can follow _shortest job first scheduling algorithm_ and batch process can follow _first come first serve scheduling algorithm._
- By using this we can allot different process of different type to CPU.
- But this approach has one problem of starvation, which means suppose if we have many system process then due to the high priority of system process, interactive process and batch process will not get chance to get executed, or they will get executed very late.
- To solve this problem we can take the help of multilevel feedback queue.

_This was all about **multi level queue scheduling**, to know about multilevel feedback queue please refer to the next article in the series. Hope you liked it and learned something new from it._

If you have any doubt, question, query related to this topic or just want to share something with me, then please feel free to contact me.

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

