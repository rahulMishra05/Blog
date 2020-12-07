# Deadlock | Operating System - M04 P01

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the forth module which consists of 8 articles.**

_In this article we will discuss about deadlock and ways by which deadlock occurs in detail._

### Deadlock
- If two or more processes are waiting on happening of some event, which never happen then we say these processes are involved in deadlock and then it is known as deadlock.

<!-- Image one will come here -->

![Untitled Diagram.png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607321504268/MVwgHrNUi.png)
### Conditions for deadlock are
- Mutual exclusion
- No preemption
- Hold and wait
- Circular wait

1. **Mutual exclusion:** It means that the resource process using should be used in mutual exclusive way. It _(resource)_ should not be used by more than one process at one time.

2. **No pre-emption:** No type/ chance of pre-emption would be there.

3. **Hold and wait:** Process `P1` is holding `R1` resource and waiting for `R2` resource while on the other hand process `P2` is holding `R2` resource and waiting for `R1` resource. `P1` and `P2` should not release any resource, if they do this then deadlock will not happen.

4. **Circular wait:** The above example is an example of circular wait, if there is circular wait, than deadlock can occur. Let’s see another example

<!-- Image two will come here -->

![Untitled Diagram (1).png](https://cdn.hashnode.com/res/hashnode/image/upload/v1607321518251/H2XmlxWEN.png)
***Note: If any one condition is not fulfilled than there may be chances that deadlock do not occur.***

_So this was all about deadlock in an operating system. Hope you liked it and learned something new form it._

If you have any doubt, questions, quires related to this topic or just want to share something with me, then please feel free to contact me.

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
