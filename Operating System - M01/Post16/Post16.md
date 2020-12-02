# Question on Fork System Call | Operating System - M01 P09

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the first module which consists of 12 articles.**

_In this article we will see a question on fork system call, and by that question I will try to explain you the concept of fork system call._

So, in the previous article I had explained about fork system call, it is recommended that first you go through that article for getting a basic understanding of the topic, [Fork system call](https://programmingport.hashnode.dev/fork-system-call-or-operating-system-m01-p08)

I am going to use a `C` program to explain you about `fork` system call 
```c
#include <stdio.h>
#include <unistd.h>

int main() {
    if(fork() && fork())
        fork();
    printf("Hello");
    return 0;
}
```
Now, the compiler will execute the code and when the `if` statement come, the first `fork` command will be executed, and a child process will be created, and both the process _(child process and parent process)_ will run parallelly, as you can see in the below diagram.
![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605508750461/sVVqEhiBe.png)

Now the child process `C1` will print _Hello_

As you can see that `AND` operator is written after first `fork()` so it will also get executed, so another child process from parent process will get created. As you can see in the diagram below.

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605508819072/nonrBRYjI.png)

This `C2` will also print _Hello_

Now the `if` statement is completely executed, and now the `fork()` statement  written inside the `if` statement will get executed. And again a child process of parent process will be created. As you can see in the diagram below. 

![Untitled Diagram (2).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605508827736/Y3umiDR-f.png)

This child process and parent process will print _Hello_

_Here, in total `fork` is done **3** times, and in total **4** times __Hello__ will be printed._

Hope you learned something. If you have any question, query, doubt or just want to share something with me, then please feel free to contact me.  

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