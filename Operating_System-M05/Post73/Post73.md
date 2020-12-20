# Question on Contiguous Memory Management | Operating System - M05 P06

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we are going to see a question based on various allocation methods in contiguous memory management, so we can get a better understanding of the concept._

***Question:*** Request from process are 300 KB, 25 KB, 125 KB, 50 KB respectively, the above request could be satisfied with 

<!-- Image one will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608448919100/qHXD1IjOl.png)

1. Best-fit but not first-fit
2. First-fit but not best-fit
3. Both 
4. None

***Answer:***
- `(ii)` _First-fit but not best-fit_
- If we allocate process according to the concept of first-fit than all the process will get place, like this 

<!-- Image two will come here -->

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608448930908/hx3I9fbQQ.png)

- But if we use best-fit concept to allocate the process into the RAM, then the structure of the RAM will look like this.

<!-- Image three will come here -->

![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608448941604/iwMHBkaXh.png)

- Here we cannot put `50 KB` process _(`P4`)_ in RAM due to external fragmentation. This is because in contiguous memory allocation we cannot divide process into different fragments.

_So this was a simple question on various allocation methods in contiguous memory management. Hope you liked it and learned something new from it._

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