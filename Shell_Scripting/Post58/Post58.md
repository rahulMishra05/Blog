# Array variable | Shell Scripting 

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will learn about array in shell scripting. And see how to perform different operations on array._

1. We can declare array in this way `<name_of_array_variable>=(“Ubuntu” “Windows” “Kali”)`. By this way we can declare an array and store some value in it.
2. To print all the values of array just write this command `echo ${<name_of_array_variable>[<index_location>]}`. _For example:_ `echo ${os[@]}`
3. If you want to print a specific value of the array than you can use this command `echo ${<name_of_array_variable>[<index_location>]}`. _For example:_ `echo ${os[1]}`
4. If you want to print the index of the array than you can do it like this `echo ${!<name_of_array_variable>[@]}`. _For example:_ `echo ${!os[@]}`
5. If you want to pint the length of an array than you can do it like this `echo ${#<name_of_array_variable>[@]}`. _For example:_ `echo ${#os[@]}`
6. We can add elements to array in this way `<name_of_array_variable>[index_location]=”<value>”`. _For example:_ `os[3]=’mac’`
7. We can update the data of an array in the same way `<name_of_array_variable>[index_locaiton]=”<value>”`. _For example:_ `os[0]=’mac’`
8. If you want to remove an element from an array then you can do it by using `unset` command like this `unset <name_of_array_variable>[index_location]`. _For example:_ `unset os[2]`

_So this was all about array in shell scripting. Hope you liked it and learned something new from it._

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