# Producer Consumer Problem | Operating System - M03 P02

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the third module which consists of 10 articles.**

_In this article we will discuss about producer consumer problem in an operating system._

### Producer consumer problem
- It is standard problem of multiprocessor synchronization.
- In this we have two process one of producer and another of consumer and both the process are arriving at same time and they are sharing something _(cooperative process.)_

***Consumer program***
```c
void consumer(void) {
    int itemC;
    while(true);
    {
        while(count == 0)
        itemC = Buffer(out);
        out = count - 1;
        count = count - 1;
        process_item(itemC); 
    }
}
```

***Producer program***
```c
int count = 0;
void poducer(void) {
    int itemP;
    while(true) {
        producer_item(itemP);
        while(count == n);
        Buffer[in] = itemP;
        in = (in+1)mod n;
        count = count + 1;
    }
}
```
- Here producer process will generate an item while executing and put it in buffer. Consumer will execute the code _(consumer code)_ and then it will use item by taking out line from buffer and perform any task/process.
- This is the ideal case in this case producer will put the item in buffer and consumer will take it out and use, and the buffer is completely field then it will start over again from zero.

_This was all about producer consumer problem. Hope you liked it and learned something new from it._

If you have any doubt, question, queries related to this topic or just want to share something with me, then please feel free to contact me. 

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
