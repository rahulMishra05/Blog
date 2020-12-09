# Arithmetic Operations | Shell Scripting 

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article I will explain you that how can you perform arithmetic operations using shell scripting._

1. If you write this command `echo 1+1` then it will print `1+1` in the output, because by default echo consider everything written after it as string.
2. We can get desired result in this way `echo ((num1 + num2))`. Here num1 and num2 are variables and both the variables contain some value. This command will print the desired result.
3. In the similar way we can also perform other arithmetic operations.
4. Another way to perform arithmetic operations is by using `expr` keyword. Like this 
    - `Echo (expr $num1 + $num2)`
    - In this way we do not use two parentheses and also use the variable with `$` sign before them.
    - One more thing that we cannot use `*` for multiplication it will give error, so we use `\*` sign for multiplication.

[Reference code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video10.sh)

_So this was all about simple arithmetic operation in shell scripting. Hope you liked it and learned something new from it._

If you have any doubt, question, quires related to this topic or just want to share something with, than please feel free to contact me. 

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