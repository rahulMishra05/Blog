# Question on Contiguous Memory Management | Operating System - M05 P07

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will see a question on contiguous memory management and will try to understand its concepts._

***Question:*** Calculate the time at which `J7` will be completed. _(Algorithm is best-fit)_

Request No. | J1 | J2 | J3 | J4 | J5 | J6 | J7 | J8 |
--- | --- | --- | --- | --- | --- | --- | --- | --- |
Request size | 2 KB | 14 KB | 3 KB | 6 KB | 6 KB | 10 KB | 7 KB | 20 KB |
Usage | 4 | 10 | 2 | 8 | 4 | 1 | 8 | 6 |

1. 17
2. 19
3. 20
4. 37

<!-- Image one will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608568079147/RKjH5FuBV.png)

***Answer:***
- **(ii)** _19_
- We will put `J1` at location `3` in memory, the internal fragmentation is zero. It will execute for `4` unit of time.

<!-- Image two will come here -->

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608568092006/ni8LCVcSC.png)

- Now, we will put `J2` in memory at location `2`, where it will get execute for `10 units` of time. At present the internal fragmentation at memory location `2` is of `6 KB`.
- Now, we put `J3` in memory location `0`, where it will get executed for `2 unit` of time. At present the internal fragmentation at memory location at `0` is `1 KB`.
- Then `J4` will arrive, we put it in memory location `1`, where it will get executed for `8 units` of time. At present the internal fragmentation at memory location `1` is `2 KB`.
- We want to put `J5` in memory but there is no empty slot. So, we will wait until `J4` gets terminated and then we will place `J5` at memory location `1`, where it will get executed for `4 units` of time.
- Now we want to put `J6` in memory but there is no empty slot that can accommodate `J6`. So we will wait till `J2` gets completed and then we will place `J6` at memory location `2`. Where it will be executed for `1 unit` of time.
- We want to put `J7` in memory but again there is no empty slot which can accommodate `J7`. So we will wait till `J6` gets completed and then place `J7` at memory location `2`, where it will get executed for `8 unit` of time.
- Therefore `J7` will be completed at time unit `19` and time at which `J7` enters RAM is `11`.

_So this was a simple question of contiguous memory management. Hope you liked it and learned something new from it._

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