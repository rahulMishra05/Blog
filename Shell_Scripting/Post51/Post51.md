# Floating Point Operations | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_We cannot solve floating point numbers using simple arithmetic operations. So in this article we will see that how we solve floating point numbers._

We cannot perform arithmetic operations on decimal using previous methods, it will give an error. For that we use `bc` which stands for basic calculator.
- We can use bc command in this way `echo “20.5+5” | bc`
- But there is a problem with division that it will not show the values after decimal. So to remove that we have to define a variable scale like this `echo “scale=2;20.5+5” | bc`
- Here we can see the value till `2` decimal places.
- We can also solve/calculate square root of some number and can also solve trigonometric equations using the `bc` keyword.
- If you want to use variables then the syntax becomes `echo “$<variable_name1>+$<variable_name2>” | bc`. Here num1 and num2 are variables which have some value in it.
- We can calculate the square root of a number in this way `echo “scale=2;sqrt($<variable_name>)” | bc -l`
- To calculate we have to use a function called sqrt and pass the variable name to it, whose square root we want to calculate.
- But sqrt function is a math function and we need to call. To call math function we use `-l` command.
- We can also calculate power of any number like this `echo “scale=2;3^3” | bc -l`
- You can get more information about `bc` command by just typing `man bc` in terminal.

[Reference code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video11.sh)

_So this was all about performing arithmetic operations on floating point numbers. Hope you liked it and learned something new form it._

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