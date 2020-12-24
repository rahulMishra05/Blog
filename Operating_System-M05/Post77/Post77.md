# Question on Logical Address & Physical Address | Operating System - M05 P10

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will see a question on logical address and physical address space and try to gain better understanding on this topic._

***Question:*** We have given _LAS = 4 GB_, _PAS = 64 MB_, _Page size = 4 KB_, and we have to find number of process, number of frames, number of entries in page table, size if page table. _(LAS = logical address space)_ the memory is byte addressable.

***Answer:*** Logical address = 2<sup>2</sup> x 2<sup>30</sup> = 2<sup>32</sup>
The logical address is of 32 bits.

4 KB = 2<sup>2</sup> x 2<sup>10</sup> = 2<sup>12</sup>
The page size is of 12 bits and total size of page table is 32 bits 
Therefore, No of pages = 2<sup>32</sup> – 2<sup>12</sup> = 2<sup>20</sup>
PA = 2<sup>6</sup> x 2<sup>20</sup> = 2<sup>26</sup> bits
Size of physical address = 26 bits
We know that `frame offset = page offset`
Therefore, frame offset = 4 KB = 2<sup>2</sup> x 2<sup>10</sup> = 2<sup>12</sup>
Number of frames = 2<sup>14</sup>
`Number of entries in page table = Number of pages in a process`
Therefore number of entries in page table = 2<sup>20</sup>
Size of page table = 2<sup>20</sup> x 14 bits _(To represent one frame 16 bits are required and there are 220 entries in page table therefore the size of page table will be 220 x 14)_

_So this was a question based on logical address and physical address space. Hope you liked it and learned something new from it._

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