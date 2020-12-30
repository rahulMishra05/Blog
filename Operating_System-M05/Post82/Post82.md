# Question on Inverted Paging | Operating System - M05 P15

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will see a question on inverted paging and try to understand the concept of inverted paging._

***Question:*** Consider a virtual address space of 32 bits and page size of 4 KB, system is having a RAM of 128 KB. Than what will be the ratio of page table and inverted page table size, if each entry in both is of size 4 B?

***Answer:*** Virtual address space = 32 bits

Page size = 4 KB = 2<sup>2</sup> x 2<sup>10</sup> = 2<sup>12</sup>

Therefore, Number of page = 2<sup>20</sup>

Number of page bits = 20

Size of page table = 2<sup>20</sup> x 4 B

In inverted paging table `number of entries = number frames in main memory`

Physical address = 128 KB = 2<sup>7</sup> x 2<sup>10</sup> = 2<sup>17</sup>

`Frame offset = Page offset`

Therefore, number of frames in main memory = 2<sup>5</sup>

Size of inverted page table = 2<sup>5</sup> x 4 B

Therefore, according to the question 

2<sup>20</sup> x 4 B/ 2<sup>5</sup> x 4 B = 2<sup>15</sup>:1

_So this was a simple question on inverted paging. Hope you liked it and learned something new from it._

If you have any doubt, questions, quires related to this article or just want to share something with me, than please feel free to contact me.

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