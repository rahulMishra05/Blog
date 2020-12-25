# Question on Logical Address & Physical Address | Operating System - M05 P11

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will see a question on logical address and physical address space, to understand the concept of paging in operating system._

***Question:*** Consider a system which has LA = 7 bits, PA = 6 bits, page size = 8 words, then calculate number of pages and number of frames.

***Answer:*** Total bits of LA = 7 bits, which means it is equal to 2<sup>7</sup>

The page size = 8 words which means 2<sup>3</sup> so we can say it is of 3 bits

Therefore, Page No. = 4 which we can say is 2<sup>4</sup> and then total number of pages = 2<sup>4</sup> = 16

While total number of bits required to respond total number of page = 4 bits.

PA = 6 bits, total size of PA = 2<sup>6</sup> = 64

Now, we know that `frame offset = Page offset`

Number of frames = 2<sup>3</sup> = 8

`Total number of entries in page table = number of pages`

`Total number of entries = 16`

`Total size of page table = 24 x 8`

_So, this was a simple question on logical address and physical address space. Hope you liked it and learned something new from it._

If you have a doubt, question, quires related to this article or just want to share something with me, than please feel free to contact me. 

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