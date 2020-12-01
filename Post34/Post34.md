# Printer Spooler Problem | Operating System - M03 P03

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the third module which consists of 10 articles.**

_In this article we will discuss about printer spooler problem, and how can we overcome that problem._

### Printer spooler problem
- As we know that printer is a peripheral device, so it is slower in comparison of CPU and memory.
- So, if multiple users send some file to printer to print then **spooler** comes into play.
- Spooler is a program in printer which stores all the files coming to print and when printer is free it gives it to the printer in sequential manner.
 
<!-- Image will come here -->

***This four line code is executed by each process in order to store its file in spooler directory to print.***
```c
Load Ri, m[in]
store SD[Ri], "F-N"
INCR Ri
store m[in], Ri
```
`in: Shared variable`
`m: Memory location`
`Ri: Register`
`F-N: File name`
`SD: Spooler directory`

1. **Line 1:** In line one we are loading free memory location `m[in]`, in register `Ri`
2. **Line 2:** In line two we are storing file name _(F-N)_ in spooler directory _(SD)_ at position `Ri`, which is for instance `0`
3. **Line 3:** In line three we are incrementing the count of `Ri` from `0` to `1`, so next file can be stored in at index `1`
4. **Line 4:** In line four the new file will be stored at incremented memory location `m[in]`

_So this was all about printer spooler problem. Hope you liked it and learned something new from it._

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