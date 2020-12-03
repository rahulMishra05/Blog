# Passing Arguments | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see that how can you pass the arguments at the time of executing the any file._

### Passing arguments
- We can pass arguments to a script when we are executing it.
- To do so we have to write this command `echo $1 $2 $3`.
- When we run the script at that time we can give three input and they we will be printed on the screen.
- If we want to print the name of the file _(shell file)_, then we can do in this way `echo $0 $1 $2 $3`, again we can pass three variables, but in this case name of the file will also be shown because the name of the file get stored in the 0<sup>th</sup> variable.
- Another way do to the same thing is by using the default variable `$@`, in this way `<array_name>=(“$@”)`
- We have to declare a array which will store the argument, and then we can print it in the same way we print an array on the screen just like this `echo ${<array_name>[0]} ${<array-name>[1]}`
- If we want to print all the arguments then we can do it by writing this command `echo $@`
- If we want to find the number of arguments passed then we can simply use this command `echo $#` this will print the total number of arguments passed.

[Practical code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video4.sh)

_This was all about passing arguments, you can discover more about it. Hope you liked it and learned something new form it._

If you have any doubt, question, quires related to this topic or just want to share something with me, then please feel free to contact me. 

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