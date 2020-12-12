# Banker's Algorithm Question | Operating System - M04 P06

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the forth module which consists of 8 articles.**

_In this article we will see a question on banker’s algorithm, to get better understanding of the concept._

***Question:*** Check for the deadlock, if deadlock is not present then find the safe sequence.

Process No. | Allocation of E | Allocation of F | Allocation of G | Max need of E | Max need of F | Max need of G | Current availability of E | Current availability of F | Current availability of G | Remaining need of E | Remaining need of F | Remaining need of G | 
--- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P1 | 1 | 0 | 1 | 4 | 3 | 1 | 3 | 3	| 0 | 3 | 3 | 0 |
P2 | 1 | 1 | 2 | 2 | 1 | 4 | 4 | 3 | 1 | 1 | 0 | 2
P3 | 1 | 0 | 3 | 1 | 3 | 3 | 5 | 3 | 4 | 0 | 3 | 0
P4 | 2	| 0	| 0	| 5	| 4	| 1	| 6	| 4	| 6	| 3	| 4	| 1

***Answer:***
- Current availability: _(3,3,0)_
- With the current availability we can fulfill the request of `P0`
- Current availability: _(4,3,1)_
- With current availability we can fulfill the request of `P2`
- Current availability: _(5,3,4)_
- With current availability we can fulfill the request of `P1`
- Current availability: _(6,4,6)_
- With current availability we can fulfill the request of `P3`
- `Safe sequence = P0 -> P2 -> P1 -> P3`
- No deadlock will occur. Therefore it is safe.

_So this was a question on banker’s algorithm. Hope you liked it and learned something new from it._

If you have any doubt, question, queries related to this topic or just want to share something with me, than please feel free to contact me.

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