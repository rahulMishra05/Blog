# Case Statement Example | Shell Scripting 

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see an example to get a better understanding on the case statement concepts in shell scripting._

We are going to find that entered character is capital or small
1. First we will ask for the input from the user, with the command `echo –e “Enter any character: \c”`
2. Then we will store that value in a variable, named as **value**
3. Now we will apply case statement, with different cases.
    - **[a-z]:** This means that we are expecting a small alphabet between `a-z`.
    - **[A-Z]:** This means that we are expecting a capital alphabet between `A-Z`.
    - **[0-9]:** This means that we are expecting an integer between `0-9`.
    - **? :** This means that we are expecting any special character. _(Only one special character)_
4. If your program doesn’t take or recognize the capital alphabets, then just type this command in terminal `LANG=C`

**Final code**
```shell
echo -e "Please enter any character : \c"
read value

case $value in
    [a-z] )
        echo "User enter $value is in between a to z" ;;
    [A-z] )
        echo "User enter $value is in between A to Z" ;;
    [0-9] )
        echo "User enter $value is in between 0 to 9" ;;
    ? )
        echo "User enter $value is a special character" ;;
    * )
        echo "Invalid input, this is maybe because you have entered more than one value." ;;
```

[Reference code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video13.sh)

_So this was an example in which we had solved a problem using case statement in shell scripting. Hope you liked it and learned something new from it._

If you have any doubt, question, quires related to this topic or just want to share something with me, than please feel free to contact me.
 
### 📱 Contact Me

[Twitter](https://twitter.com/r_mishra10)
[LinkedIn](https://www.linkedin.com/in/rahul-mishra-66210b185)
[Telegram](https://t.me/rahul_mishra10)
[Instagram](https://www.instagram.com/rahul_mishra10/?hl=en)

### 📧 Write a mail
<rahulmishra102000@gmail.com>

#### 🚀 Other links

[GitHub](https://github.com/rahulMishra05)
[HackerRank](https://www.hackerrank.com/rahulmishra10201)