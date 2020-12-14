# Read File's Content using While Loop | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see various ways by which we can read the content of a file using while loop and shell script._

1. The first method is like this.
    - Here we use `<` input redirection.
    - This means that the content of the file will be sent to the while loop and then we will store the value of while loop inside a variable and then print the content of that variable line by line.
    - ```shell
      while read <variable_name>
      do
        echo $<variable_name>
      done < <file_name>
      ```
2. Second way is like this.
    - Here the output of the cat command is the input of the while command.
    - ```shell
      cat <file_name> | while read <variable_name>
      do
        echo $<variable_name>
      done
      ```
3. The third way to do the same thing is like this.
    - We cannot use the above methods in some cases, than we use the **IFS** methods.
    - Here we are assigning space to IFS.
    - We use `-r` because with the help of this it will do not interpret backslash.
    - ```shell
      while IFS='' read -r <variable_name>
      do
        echo $<variable_name>
      done < <file_name>
      ```
4. At the place of file we can also give the file present at different location, along with their address just like this `/etc/someFile.txt`

[Refernece code for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video17.sh)

_So this was all about the different ways by which we can read the content of the file using while loop in a shell script. Hope you liked it and learned something new form it._

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



