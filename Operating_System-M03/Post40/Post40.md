# Semaphores and Counting Semaphore | Operating System - M03 P05

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the third module which consists of 10 articles.**

_In this article we will discuss about semaphores in operating system, and see that how counting semaphores a type of semaphore works._

### Semaphores
- It is a method/ tool which are used to prevent race condition.
- When we try to run multiple cooperative processes at single time then race condition can occur.
- Race condition can cause loss of data, deadlock etc.
- A semaphore is an integer variable which is used in mutual exclusive manner by various concurrent cooperative processes in order to achieve synchronization. 

<!-- Image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607005891040/c-jgxT56E.png)
***PCB :*** _Process control block, store all the information related to a process like processed, list of open files, priority etc._

**Entry section code**
```c
Down(Semaphore S) {
    Svalue = Svalue - 1
    if(Svalue < 0) {
        put process (PCB)m
        suspend list, sleep(),
    }
    else 
        return ;
}
```

**Exit section code**
```c
Up(Semaphore S) {
    Svalue = Svalue + 1
    if(Svalue <= 0>) {
        select a process from suspend list and wake up();
    }
}
```
- _S_: S is an integer and it is semaphore value which varies from _(-infinity to + infinity)_, as this is counting semaphore.
- If the Svalue is `0` then no other process can enter critical section, all process that want to enter critical section at that time will be blocked/ sleep.
- If the Svalue is in negative then it _(critical section)_ cannot take any other process.
- So, when process exit critical section, they execute exit section code, which as you can see increase the value of Svalue.
- In the code of exit section **wake up()** means that the process can again try to go in critical section, now it is not in sleep/ block state or critical section.
- If the Svalue is `0` then there is no process in block/ sleep state, means no process has been suspended.
- If the Svalue is `10`, then `10` processes can enter critical section successfully.
- If a process enters the critical section then it is stated as successful operation and if a process fails to enter the critical section then it is termed as unsuccessful operation.

***Question:*** Let `S = 10` we perform `6 P` operation and `4 V` operations. What is the current value of `S`?

***Answer:***

Given,

`S = 10`, `P =6`, `V = 4`

After performing `6 P` operations 

`S = 10 - 6 = 4`

After performing `4 V` operations

`S = 4 + 4 = 8`

**Therefore the current value of S = 4**

***Question:*** Let `S = 17`, we perform `5 P` operation, `3 V` operation, `1 P` operation in sequence. What is the current value of `S`?

***Answer:***

Given,

`S = 17`, `P1 = 5`, `V = 3`, `P2 = 1`

After executing `P1` we get

`S = 17 – 5 = 12`

After executing `V` we get

`S = 12 + 3 = 15`

After executing `P2` we get

`S = 15 – 1 = 14`

**Therefore the current value of S = 14**

_So this was all about semaphores and counting semaphores. Hope you liked it and learned something new from it._

If you have any doubt, question, quires related to this topic or just want to share something with me, then please feel free to contact me. 

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