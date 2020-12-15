# For Loop | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we are going to understand for loop in shell scripting._

1. The syntax for loop. There are many ways to write the for loop.
    - First way
        ```shell
        for <variable_name> in 1 2 3 4 5 . . N
        do
            command1
            command2
            command3
        done
        ```
    - Second way
        ```shell
        for <variable_name> in file1 file2 file3
        do
            command1 on $<variable_name>
            command2
            commandN
        done
        ```
    - Third way
        ```shell
        for <variable_name> in $(Linux-Or-Unix_Command_Here)
        do
            command1 on $<variable_name>
            command2 on $<variable_name>
            commandN
        done
        ```
    - Forth way
        ```shell
        for (( EXP1; EXP2; EXP3 ))
        do
            command1
            command2
            command3
        done
        ```
2. We can give the range to iterate like this `{1..10}`. Here the range is from `1` to `10`
3. If we want to specify increment than we can do that in this way `{1..10..2}`. Here the range is from `1` to `10` and increment will be of `2`
4. You can use the above methods only if your bash version is above `4.0`. You can check you bash version by this command `echo ${BASH_VERSION}`

[Reference code file for this article]( https://github.com/rahulMishra05/shell-scripting/blob/main/video19.sh)

_So this was a brief introduction of for loop. Hope you liked it and learned something new form it._

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