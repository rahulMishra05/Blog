# Fixed Partition | Operating System - M05 P03

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we are going to see about fixed partition which is also known as static partition. We will discuss about various concepts related to fixed partitions and problems present in it._

### Fixed partition
- Numbers of **partitions** are fixed. 
- In RAM multiple partitions are present in which we put fragments of a process _(in contiguous or non-contiguous manner.)_
- When we start our system/ machine the operating system get mounted in RAM in order to load. It takes some space in the RAM and rest space is left for the process to get executed.
- In fixed partition when the system load at that time number of partitions are divided, but what will be the size of all partitions it is not decided _(it can be same or different.)_
- Contiguous allocation so spanning is not allowed, which means a process will not be divided into more than one partition. The complete process will come in one partition.

<!-- Image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608207631775/NQ4Z4cWTo.png)

- Fixed partitioning was used in 1960s, the advantage of this process is that it is easy to implement but it has many disadvantages so it is not used now.
- The size of the process should be less than the size of the partition otherwise the process cannot be placed in the RAM _(partition)_.

#### Case 1:
- The process `P1` size is `4 MB`, than we will place that process in the `4 MB` partition _(as shown in fig(i))_ and the process will be executed successfully and got terminated.

#### Case 2:
- The process `P1` has a size of `2 MB`, than we will place that process in the `4 MB` partition _(as shown in fig(i))_, than the `2 MB` of that `4 MB` will remain empty and in future we cannot use it.
- Because it is contiguous we cannot divide process into multiple fragments. And this thing is known as **Internal fragmentation**.
- ***Internal fragmentation:*** Suppose we have a process `P2` of size `7 MB`, we place `P2` in the RAM of partition `8 MB` _(as shown in fig(i))_, now `1 MB` left empty but we cannot use it _(partition)_ to place another process in it and this is known as _internal fragmentation_

#### Case 3:
- **Limit in process size** for example if we want to place a process with size `32 MB` in _fig(i)_, we cannot do that because there is no partition which can accommodate `32 MB` size process.

#### Case 4:
- **Degree of multiprogramming is limited**, it means as you can see in _fig(i)_ we have `4` partitions so the maximum number of process we can put in RAM is `4` but in case more than `4` processes came then we cannot place them in RAM because number of partitions are limited.
- ***External fragmentation:*** Suppose the process allocation to RAM is using contiguous method, and all the slots are filled but there is some vacant space in some slots _(internal fragmentation)_ and then another process came whose size is less than the total vacant size in all partition, but we cannot allocate that process to RAM, because in contiguous allocation we do not break process into multiple fragments.
- ***Note:*** _If there is internal fragmentation present than external fragmentation will also be there._

_So this was all about fixed partitioning. Hope you liked it and learned something new from it._

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


