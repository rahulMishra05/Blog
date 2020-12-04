# File Test Operator | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see, that how can we check different properties related to a file._

1. If we want to keep the cursor on the same line after printing the echo command, we can do this by `echo –e “Enter any thing : \c”`. Here `\c` is being used to keep the cursor on the same line and if we do not use `–e` flag after echo then `\c` will also get printed on the screen, and the cursor will go in the next line.
2. If we want to check the file exist or not then in `if condition` we can use `-e` flag for it.
3. Similarly `-f` flag is used in `if condition` to check, that if file exist and is it regular file or not.
4. In the same way if we want to check for the directory we can use `-d` flag in `if condition`.
5. There are two types of file `block special` and `character special`
    - Block special file is the file which consists of binary data, pictures, videos etc.
    - Character special file is the file which consists of characters, some data or code.
    - To check it the file is block special we can use `-b` flag in `If condition` and to check for character special file we use `-c` in if condition.
6. If we want to check that whether the file is empty or not then we use `-s` flag 
7. If you want to check that file has read permission then use `-r` flag. If you want to check that file has write permission then use `-w` flag, and if you want to check that whether the file has execute permission or not then use `-x` flag.

[Practical code file related to this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video6.sh)

_So, this was all about file test operator. Hope you liked it and learned something new form it._

If you have any doubt, question, quires related to this topic then or just want to share something with me, then please feel free to contact me. 

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
