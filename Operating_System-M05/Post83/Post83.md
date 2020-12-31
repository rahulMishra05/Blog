# Thrashing | Operating System - M05 P16

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will see that what is thrashing? Why it is used and what are the problems thrashing has and also how can be solve those problems._

### Thrashing
- We divide process into multiple pages and load them in RAM. Our main focus is to increase degree of multiprogramming so CPU utilization can also increase.
- One way to do this is we can load one page of every process in RAM so degree of multiprogramming would be highest.
- But there is a problem with this approach that suppose CPU request a page from `P1` process which is not present in RAM than it will be termed as **page fault** and there could be a worst case scenario that RAM is full with different pages of different processes but CPU call a page which is not present in RAM.
- In this scenario to recover from page fault a large amount of time is required, and during that time CUP utilization will also decrease.

 <!--Image will come here  -->

![Thrashing-300x236.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1609412977519/hMPWaDo7W.png)

- When the system is recovering from page fault and CPU utilization is less that is known as thrashing.
- We can remove thrashing when we use long term scheduler.

_So this was all about **thrashing**. Hope you liked it and learned something new from it._ 

If you have any doubt, question, quires related to this article or just want to share something with me, than please feel free to contact me. 

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