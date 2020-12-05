# Logical 'AND' Operator | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see that how can we use ‘AND’ operator with the help of if condition. We will also see that different ways to use ‘AND’ operator._

We are going to use AND operator with if condition to solve a problem.
The problem is, we have to print valid age if the age is between 18 to 30 years, and if not then print invalid age.
1. If the age is greater than 18 then **AND** smaller than 30 then its successful/ true
2. Otherwise it’s false/ unsuccessful.
3. The syntax of if condition for this problem will be `if [ “$<variable_name>” –gt 18 ] && [ “$<variable_name>” –lt 30 ]`
4. There are two ways to use AND operator, we are using `&&` in this example.
5. If AND operator is used then both conditions should be true, in order to get true otherwise it will return false.
6. Another way to use **AND** operator is `if [ “$<variable_name>” –gt 18 –a “$<variable_name>” –lt 30 ]`
7. In this way we use `-a` flag and it will work same as `&&` but the syntax to write the; if condition gets change little bit.
8. If you want to use `&&` operator then there is one more way to do this, and that is by using double square brackets like this `if [[ “$<variable_name>” –gt 18 && “$<variable_name>” –lt 30 ]]`

[Practical code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video8.sh)

_So this was all about using AND operator with if condition. Hope you liked it and learned something new from it._

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