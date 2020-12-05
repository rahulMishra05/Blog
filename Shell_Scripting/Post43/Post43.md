# Append Data in File | Shell Scripting 

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see that how can we append some data at the end of a file using shell script._

1. If we want to add some data at the end of the file, then we can do that in this way.
    - First we will check that file exist or not by this statement `if [ -f $fileName ]`
	- If file exist then we will check that whether that file has write permission or not, and we can do by this command ` if [ -w $fileName ]`
    - If the file has write permission then, we can add some data/text at the end of the file using this command `cat >> $fileName`
    - Remember that if we use `>>` this means that we want to add some data at the end of the file, but if we use `>` after the cat command than it means that we want to overwrite the file.
    - If the file does not have write permission, then we will print that file does not have write permission and program will exit.
    - Similarly, if the file does not exist, then we will print that file does not exist and program will exit.

***Note:*** _To remove the write permission from the file we can write this command `chmod –w <file_name>`, and if we want to give write permission to the file then we will write this command `chmod +w <file_name>`_

[Practical code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video7.sh)

So this was all about that how can we add some data/ text at the end of a file using shell script. Hope you liked it and learned something new from it.
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