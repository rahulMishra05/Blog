# Variable Partitioning | Operating System - M05 P04

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we are going to discuss about variable partitioning which is also known as dynamic partitioning. We will see how it works, what are its functionalities and problems in variable partitioning._

### Variable partitioning 
- In it the size of partition is not defined it will be defined when the process arrives in the RAM.
- Let’s say a process came `P1` of size `2 MB`, then it will take exactly `2 MB` size in RAM and there is no scope of internal fragmentation.
- There is no limitation on number of processes _(degree of multiprogramming)_.
- There is no limitation on process size.

<!-- Image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608306955121/8HZu3-Zif.png)

- There is a problem with this approach that suppose if `P2` got completely executed or for any reason it go out from the RAM, then `4 MB` _(size of P2)_ will become empty in RAM and this is known as **Hole**
- And another process `P4` removed from the RAM and creates a hole of `4 MB`.
- Now total free space is `8 MB`.
- At that time another process `P5` came which have size of `8 MB`, we cannot place it anywhere because the free space present at different locations in RAM and in contiguous allocation we cannot break the process into multiple fragments. And this is known as **external fragmentation**.
- So variable partitioning suffers with external fragmentation. We can remove it by using **compaction**.
- Compaction means to place the free space one side and used space one side.
- But this process has a problem, to implement compaction we have to first stop the running processes. 
- Another problem variable partitioning is that allocation and deallocation is complex.

_So this was all about variable partitioning. Hope you liked it and learned something new form it._

If you have any doubt, question, quires related to this topic or just want to share something with me, than please feel free to contact me. 

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