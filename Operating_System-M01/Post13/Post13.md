# Imporatnt Linux Commands | Operating System - M01 P06

**This is a multipart blog article series, and in this series I am going to explain you the concepts of operating system. This article series is divided into multiple modules and this is the first module which consists of 12 articles.**

_In this article we will see some question on Linux commands, and try to understand important Linux commands. Mainly we are going to discuss about system call commands, in this article._

***Question 1:*** **Which command is used to assign only read permission to all three categories of file named `note`**
1. `chmod a -rw`
2. `chmod go + r note`
3. `chmod ugo = r note`
4. `u+r, g+r, o-x note`

***Answer:*** _(iii.) `chmod ugo = r note`_

***Explanation:***
- If we want to give any permission to any directory or file then we use `chmod` command, it means `change mode`

There are in total three categories in every file _user_, _group_ and _other_. On the other hand there are three types of permissions, which can be given to a file, and they are _read_, _write_ and _execute_.

Read means that a user can read the data of the file, write means that a user can write/update that file and execute means that user can execute that file _(e.g. User can execute a code file.)_

`chmod ugo = r note` is the correct answer, because here we are giving read permissions to user, group and other for the file note.

***Question 2:*** **`chmod ugo+rw note` command can be replaced in octal notation as.**
1. `chmod 555 note`
2. `chmod 666 note`
3. `chmod 333 note`
4. `chmod 444 note`

***Answer:*** _(ii.) `chmod 666 note`_

***Explanation:***
- Every command can be denoted by a specific number in octal notation. Read is denoted by 4, write is denoted by 2 and execute is denoted by 1.
- So, if you want to give read and write permission to any user, you have to write 6 because `4 (read) + 2 (write) = 6`. Similarly, write and execute will be written as 3 and read and execute will be written as 5 and if you want to give read write and execute permission it will be written as 7.
- `chmod 666 note` is correct answer because, this command means that we are giving 6 to user, 6 to group and 6 to other, where 6 means read and write permissions, and on the other hand question is asking for the octal notation of the command `ugo+rw note` which means giving permissions of read and write to user group and other on the file named _note._

***Question 3:*** **Suppose you have a file whose content are _1234567890abcdefghij_** 

**Here `lseek` is used two times sequentially**

**`lseek (n, 10,SEEK_CUR)`**

**`lseek (n,5,SEEK_SET)`**

**After applying `lseek` command two times what will be the position of R/W (read/write) head? _(Index starts from 0)_**
1. 0
2. 5
3. 10
4. 15

***Answer:*** _5_

***Explanation:***
- First of all remember one thing that `lseek` is a system call. There are many more important system calls such as _fork_, _read_ and _write_ etc.
- `lseek` command is used to move the read/write head, by default the read/write head is on first position (index 0).
- _n_ means `file descriptor`, first command means that the read/write head will be moved to 10<sup>th</sup> position by default. If you want to set the read/write head to a particular position then we use `SEEK_SET`, so after we execute second command then the read/write head will be sent to 5<sup>th</sup> position. 
- So, now after executing the above commands the position of read/write head will be on 5. Hence answer of this question is 5.

Hope you learn something from this article, and if you have any doubt, question or want to share something then, please feel free to contact me.

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