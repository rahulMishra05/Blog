# Read User Input | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see that how can we take user input in shell, and then print them on the screen._

### User input
- `read` command is used to take the input from the user. Like this `read name`
- We store the input in the variable and then we can use that variable wherever we want.
- If we want to take multiple inputs, then we can simply do that by passing multiple variables after read command. Like this `read name1 name2 name3`
- If we want to take the input in the same line in which message is shown, we can do this by this command `read –p ‘<message>’ <variable_name>`. We use –p flag with read to this.
- If you do not want to show the input user writing on the screen _(silent input)_, just like when you type password, you can use `-sp` flag after `read` to this.
- We can also take the input in the array from the user by using `-a` after read command.
- When we do not write any variable name after the read command, then the input will go inside the built-in variable `REPLY` and we can call it to see or access the data of the input.

[Practical code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video3.sh)

_So this was all about **reading user input**. Hope you liked it and learned something new from it._

If you have any doubt, question, queries related to this topic or just want to share something with me, then please feel free to contact me.

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