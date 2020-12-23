# paging | Operating System - M05 P09

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will learn about the concept of paging in operating system._

### Paging
- Suppose we have a process `P1`, which is divided into pages.
- We have a problem while executing `P1`. CPU will call for `P1` but the CPU doesn’t know that paging is done in main memory. So to remove this problem we use the concept of mapping.
- Mapping is done with the help of MMU _(memory management unit)_, MMU does it by using page table, and page table contains the frame number where the process _(page)_ is situated/ present.
- Every process has its own page table. The entries in page table are equal to number of pages a particular process has.
- When CPU make a call to access byte number `3` then first we will check that in which page that byte is present and then we will check that in which frame that page is present. 
- For example if CPU wants to access byte `3` then as we can see that byte `3` is present in page number `1` and page number `1` is placed in frame number `4`, hence CPU now know that it can get byte `3` from frame number `4` of main memory _(RAM)_.
- CPU always works on **logical address**. Logical address consists of two things **page number** and **page offset**.

_So this was a brief explanation of paging in operating system. Hope you liked it and learned something new from it._

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