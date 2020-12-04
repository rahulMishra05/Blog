# Binary Semaphore | Operating System - M03 P06 

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the third module which consists of 10 articles.**

_In this article we will see that what is binary semaphore and how does it work, in order to achieve synchronization and remove race condition._

### Binary semaphore
- The counting semaphore has a range of `– infinity to + infinity` but in binary semaphore there are only two values `0` and `1`.
- Binary semaphores are used more in systems then counting semaphore.

<!-- Image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607068944472/_86eBp0rN.png)
***Entry section pseudo code***
```c
Down(Semaphore S) {
    if (Svalue = 1) {
        Svalue = 0;
    }
    else {
        Block this process and place in suspend list, Sleep();
    }
}
```
***Exit section pseudo code***
```c
Up(Semaphore S) {
    if(Suspend list is empty) {
        Svalue = 1;   
    }
    else {
        Select a process from suspend list and wake up();
    }
}
```
- If the value of **S** is `1` and then it become `0` after performing Down operation, then it is considered as successful operation.
- If the value of **S** is `0` and then process execute Down operation, then in that case the process will be block/sleep and it will be sent to suspended list, it will be considered as unsuccessful operation.
- The Up operation first check that if the suspended list is empty or not, and if it is empty then it will change the value of **S** to `1`, does not matter that what was the value the value of **S**, if the value of **S** previously was `0` then it will become `1` and if it `1` then it will remain `1`.
- If the suspended list is not empty then **else** part will be executed and the process in the block/sleep state will get wake up and then get a chance to try to go in critical section by executing the Down operation.

_So, this was all about binary semaphore. Hope you liked it and learned something new from it._

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