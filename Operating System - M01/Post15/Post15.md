# Fork System Call | Operating System - M01 P08

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the first module which consists of 12 articles.**

_In this article I am going to explain about “fork” system call. We will see some examples of implementation of fork system call to get a better understanding of the concept._

### Fork
- Fork is a system call.
- It comes under _process control system call_.
- We use fork system call to make child process.
- Suppose, we have a C program, if we write `fork()` in it then a child process will be created. This child process also has its unique ID.
- We use the concept of fork, because let’s assume that the parent process is busy, so a clone will be created which will perform the task which parent process is unable to complete/execute. _(Another approach to solve this problem and it is known as `Thread` it is somewhat different from fork.)_
- Fork system call generally returns two value 0 and +1 (+ve). 0 denotes child process while +ve denotes parent process. -1 can also be created this happen when due to some reasons child process cannot be created, for example in case operating system/kernel is busy.
- Let us take an example to understand about fork system call.

```c
main() {
fork();
    printf("Hello");
}
```

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605446640947/rCaPmE8tm.png)
In this case two process are running parallel, due to the fork statement.

Here `Hello` will be printed two times because, before the execution of the `printf` statement, the fork statement will be executed and a child process is created.

The id of child process is 0, while the id of parent process is +1 (+ve)

- Let’s see one more example; this will help you to understand the concept of fork system call more clearly.
```c
main() {
fork();
fork();
    printf("Hello");
}
```

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605446650854/IDn3vER8j.png)
In this case at the time of 2nd fork **C1** and **P** will behave as a parent. Therefore the following output will be obtained as shown in diagram.
Here `Hello` will be printed 4 times.

-  Total number of execution = 2<sup>n</sup>
- Total number of child process = 2<sup>n</sup>-1
- n stands for **number of fork commands.**

_This was all about the fork system call, hope you likes it and learn something new from it._

If you have any question, query, doubt or just want to share something with me, then please feel free to contact me.

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
