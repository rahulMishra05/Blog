# User Mode and Kernel Mode in Operating System | Operating System - M01 P10

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the first module which consists of 12 articles.**

_In this article I am going to explain you about **User Mode** and **kernel Mode** in an operating system._

This below diagram will help you to understand about the user mode and kernel mode, and give a better picture about these two modes in operating system.

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1605512650759/zzkSXuDt2.png)

- Whenever we use an application at that time by default we are in user mode.
- All the core functionalities and drivers work in kernel mode.
- The process get switched in between two modes i.e. user mode and kernel mode.
- Operating system works at kernel mode. 
- Suppose we are writing a C program, and in that program suppose it is written that _you have to read a file and have to write something in that file._
- Remember one thing that the file is stored in Hard Disk and hard disk is a hardware and all the hardware are in control of kernel. So a user cannot directly access the hardware it have to take the help of kernel.
- To read that file we have to use system call. System call is a way to by which we can access the kernel. We will use `read()` system call, it means that we want to read some data from any file.
- After it the process gets shifted from user mode to kernel mode.
- Now, we will read the file as we are now in the kernel mode. All the operations of read and write will be completed here.
- After that the process will get shifted to user mode again. The process have to shift to user mode because we the user are working in user mode. 

_This was all about user mode and kernel mode. Hope you liked it and learned something new._

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