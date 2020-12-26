# Page Table Entry | Operating System - M05 P12

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the fifth module which consists of 26 articles.**

_In this article we will see that what is present inside a page table. We will discuss about all the different fields present in page table briefly._

### Page table entry
- In the page table in one row there are many things/details that are placed/ situated.
- We use page table because by the help of page table **MMU** _(Memory management unit)_ maps the logical address into physical address.

<!-- Image will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1608990626057/qqrVSdTU8.png)

1. **Frame No.:** 
    - At this place frame number is written.
    - One or multiple frames can reside in a frame, so when we want to map frame, fame number is used.
2. **Valid/invalid:**
    - Suppose we are finding a page so we go to frame number, this section tell us that whether the page is actually present or not at the frame number. If not than `0` will be written there.
    - It can happen we are using the concept of virtual memory.
3. **Protection:**
    - _(rwx)_ r-> read, w-> write, x-> execute.
    - This section will tell us that the file is protected or not and what type of permission is given to the user who is trying to access the file.
4. **Reference:**
    - We generally do swap-in swap-out of pages from main-memory. So here, we have to tell that whether in past does this page came in the memory or not.
    - When the page is coming first time in the memory than at this place `0` will be written.
5. **Cashing:**
    - It contains a value of enable and disable which means that if we want to enable or disable cashing.
    - When a data is being called multiple times, than we will place that in cash due to which less time will be required to execute that process.
    - But this is not valid at every place such as while doing transactions. 
6. **Dirty/modify:**
    - By the help of dirty we can check that whether the page is modified or not. So by it we can easily and effetely update the hard disk when data is changed.

_So this was all about page table classification. Hope you liked it and learned something new from it._

If you have any doubt, question, quires related to this article or just want to share something with me, than please feel free to contact me. 

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
