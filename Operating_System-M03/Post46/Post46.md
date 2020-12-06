# Dining Philosopher Problem | Operating System - M03 P08

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the third module which consists of 10 articles.**

_In this article we will see about dining philosopher problem, various cases and there solutions in detail._

### Dining philosopher problem
- To understand this problem let’s take an example.
- There is a dining table on which `5` philosophers are stetted and in between every philosopher there is a **fork** to eat the rice from rice bowl placed in center of the table.
- Every philosopher has two state **think** and **eat**.

<!-- First image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607264089979/GA63E9CCf.png)
```c
void philosopher(void) {
    while(true) {
        Thinking();
        take_fork(i);
        take_fork((i+1)%N);
        EAT();
        put_fork(i);
        put_forl((i+1)%N);
    }
}
```

***Case 1:***
- P0 comes.
- This will first complete the `thinking()` function, and then it will pick the left fork, which is in this case will be `f0` _(because i=0)_. And then it will take right fork which is `f1` _(because i=1)_. 
- Now after taking both fork it will start eating and `eat()` function will execute.
- When eating is done _(means `eat()` is executed completely)_ it will put left fork first and then the right fork.

<!-- Second image will come here -->

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607264104491/HF8Pxqj-_.png)
- Now `P1` will come and do the same thing as done by `P0`

<!-- Third image will come here -->

![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607264118823/KIqpE4Ecq.png)
- This is the normal case in it every philosopher comes one by one and this program is fine.

***Case 2:***
- Suppose `P0` comes first and take the left fork _(f0)_, but before he could take the right fork _(f1)_, `P1` came and take the left fork _(f1)_, now `P0` is waiting for the right fork _(f1)_.

<!-- Forth image will come here -->

![Untitled Diagram (3).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607264130249/nRYHIulWX.png)
- `P0` can get `f1` fork only if `P1` get `f2` _(right fork)_ and then execute `eat()` and put `f1` fork and `f1` become free.
- So, if more than one philosopher came at same time then it will cause race condition.
- Now to remove the race condition we use the concept of semaphore _(binary semaphore)_
- We will use array of semaphore, five semaphore as we have `5` philosophers and fork `S0`, `S1`, `S2`, `S3`, `S4`
- All semaphore initialize with `1` value.

```c
void philosopher(void) {
    while(true) {
        Thinking();
        wait(take_fork(Sci + 1)%N);
        EAT();
        signal(put_fork(i));
        signal(out_fork(i+1)%N);
    }
}
```
- Now when `P0` come and if it want to take two fork then it requires two values of semaphore _(`S0`, `S1`)_
- Then if `P1` comes to get executed properly it also require two values of semaphore _(`S1`, `S2`)_

<!-- Fifth image will come here -->

![Untitled Diagram (4).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607264142175/4uoclwRUf.png)
- Now suppose `P0` want to eat so he executed the `wait()` operation and came into critical section and start eating (_executing `eat()`)_ due to which the value of `S0` and `S1` become `0` from `1` while other semaphore values at this point is `1`.
- Suppose while `P0` is in critical section and `P1` arrives and it requires `S1` and `S2` but as we know the value of `S1` is `0` so `P1` get blocked.
- Now at the same time `P2` also arrives and it requires `S2` and `S3` value to be `1` to get into critical section, as the condition is true so `P2` will successfully enter the critical section and start eating _(execute `eat()`)_
- But as we know that first condition of process synchronization is **mutual exclusion** accordingly to which at a time only one process can enter critical section. But this **Dining philosopher problem** is a special case for that.
- `P0` and `P2` are independent and do not have dependency  because `P0` need `f0` and `f1` while `P2` needs `f2` and `f3`, Due to which more than one process can enter critical section _(because both process are independent.)_

***Case 3:***
- Suppose value of all semaphore is initialized with `1`.
- `P0` arrives and it takes the left fork _(f0)_ and get preempt. Then `P1` arrives and take left fork _(f1)_ and also get preempt. Similarly `P2`, `P3` and `P4` take `f2`, `f3` and `f4` fork _(left fork)_ respectively. And all the processes get preempt just before they were going to pick right fork.
- Now every philosopher had taken the left fork but no one have the right fork. Value of all semaphore is `0`
- Now every process is blocked and they cannot unblock if they try they get blocked again because value of all semaphore `0`. This is the **Dead lock condition**
- The only solution to this problem is that we can change the sequence of fork of `P4`. Which means `P4` will first will take the right fork instead of left fork _(f0)_ and then left fork instead of right fork _(f4)_

<!-- Sixth image will come here -->

![Untitled Diagram (5).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607264153311/AiU7dX9Ad.png)
- So, when the P4 comes it cannot take any fork and get blocked due to which `P3` can take the right fork _(f4)_ as `S4` is `1` already, and so on. By this we can overcome the deadlock state.
- For `P4` this will be the sequence of entry section code.
```c
Wait(take fork(S(i+1)%N)
Wait(take fork(Si)
```
_So this was all about dining philosopher problem. Hope you liked it and learned something new from it._

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
