# System Call in Operating System | Operating System - M01 P07

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the first module which consists of 12 articles.**

_In this article I am going to explain you that what is system call in an operating system, and we will also see different types of system calls in operating system, which are there of different/specific tasks in an operating system._

### System Call:
- A user while using the system _(performing different tasks)_, is present in user mode. But in case if we want to use any functionality of operating system we have to go in kernel mode, but as a user we cannot access kernel mode _(Because a user is bound to be in user mode)_. So, in that to use the functionalities of operating system we use `System Calls`
- System call is a way by which we can shift from user mode to kernel mode, by which we are able to use the functionalities of kernel/operating system.
System call can also be used with the help of API or GUI applications.
- System call invokes the kernel to perform a specific task.
- You can understand it in this way, that when we write `printf` in C programming language, so basically `printf` is a function which call a system call `write()`, we will see about it later in this article. 
In Linux based operating system we can directly use some system call while writing a simple program in text editor using some programming language like `C++`
- _There are five types of system calls, in an operating system, and they are as follow._

1. **File related system call:**
    - File related system call means, when we want to access something from a file or want to perform any task on a file, so in that case we use _file related system call_.
    - All the task related to a file is done with the help of file related system call.
    - The most common file related system calls are `open()`, `read()`, `close()`, `create file`, etc.
2. **Device related system call:**
    - User cannot access any device, they have to take privilege form operating system and they can get it by `system call` to be more specific by the help of `Device related system call`
    - Some device related system calls are `read`, `write`, `reposition`, `ioctl`, `fcntl`, etc.
3. **Information system call:**
    - If we want any information related to device or any process then, we use `Information related system call`
    - By using information system call, we get metadata _(data of any data)_
    - Some examples of information system call are `get Pid`, `attribute`, `get system time and data`
4. **Process control system call:**
    - This command is generally used when we want to load/execute some data/process, or in other words we can say that process control system call is used to control any task/process.
    - Example of process control system call are `load`, `execute`, `abort`, `fork`, `wait`, `signal`, `allocate`, etc.
    - Fork is one of the most important system calls, it creates a child process and then child process do its job while the parent process do their job, by this way we can create a multiprocessing environment.
5. **Communication system call:**
    - This system call is used when we want to communicate between two processes.
    - Common example of communication system call are `pipe()`, `create/delete connection`, `shmget()`

_This was all about system calls, and different types of system calls, hope you liked it and learned something new._

If you have any doubt, question, query or just want to share something, then please feel free to contact me.  

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