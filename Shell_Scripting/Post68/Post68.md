# For Loop to Execute Commands | Shell Scripting 

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we are going to see that how we can use bash commands in shell script with the help of for loop._

- We can use _for loop_ to execute commands, like this.
```shell
for <variable_name> in ls pwd date
do
    echo "----------$<variable_name>----------"
    $<variable_name>
done
```
- In this example first `ls` command will get executed then `pwd` command and in last `date` command.
- Let’s solve another problem we have to print the name of all directories present in any folder using for loop.
```shell
for <variable_name> in *
do
    if [ -d $<variable_name> ]
    then 
        echo $<variable_name>
    fi
done
```
- Here `*` will go through each file and every file present in that directory.
- If condition will check that whether that file is a directory or not, if it is a directory than its name get printed.

[Reference code file for this article]( https://github.com/rahulMishra05/shell-scripting/blob/main/video20.sh)

_So this was all about how can we execute some commands using for loop in shell script. Hope you liked it and learned something new form it._

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



