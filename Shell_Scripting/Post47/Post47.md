# Logical 'OR' Operator | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see that how can we use ‘OR operator with the help of if condition. We will also see that different ways to use ‘OR’ operator._

We are going to use OR operator with if condition to solve a problem.
- If the age is greater than `18` **OR** less than ``30`, then it will be true/ successful and we will print “valid age”
- Otherwise it will give false.
- The syntax of if condition for this problem will be `if [ “$<variable_name>” –gt ] || [ “$<variable_name>” –lt 30 ]`
- If `OR` operator is used then if only one condition is true, then also it will return true.
- Another way to use `OR` operator is like this `if [ “$<variable_name>” –gt –o “$<variable_name>” –lt 30 ]`
- In this way we use `-o` flag and it work same as `||` but the syntax to write the if condition is changed little bit.
- If you want to use `||` operator then there is one more way to do and that is by using double square brackets like this `if [[ “$<variable_name>” –gt 18 || “$<variable_name>” –lt 30 ]]`

[Practical code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video9.sh)

_So this was all about **logical OR operator** with if condition. Hope you liked it and learned something new from it._

If you have any doubt, questions, quires related to this topic or just want to share something with me, than please feel free to contact me. 

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