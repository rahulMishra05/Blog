# 2-Level Paging | Operating System - M05 P13

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will see what 2 level paging is, and with the help of a question we will try to understand the need of 2 level paging._

### 2-level paging
- Suppose the size of page table is greater than that of frame table, so it cannot fit in frame that’s why we use multiple page tables.
- Because it divides the page table in smaller parts which can get fit in frame table.

Let’s see an example to get better understanding of the topic.

***Question:*** Physical address space = 256 MB = 228, logical address space = 4 GB, frame size = 4 KB = 212, page table entry = 2 B. Solve and find that whether outer page table is required or not.

***Answer:*** As we know that `frame number = physical address space – frame size`

Frame number = 228 – 212 = 216 

Size of page table = 210 x 2 = 2 MB

Size of frame and page is not equal. So, we have to divide page into smaller parts.

Therefore, 
2 MB/ 4 KB = 221/212 = 29

Now we will make another page table and it will be known as outer page table, which will have 29 entries.

Total size of outer page table = 29 x 2 B = 1 KB 

_So this was all about 2 level paging, I tries to explain you the concept with the help of a question. Hope you liked it and learned something new from it._

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