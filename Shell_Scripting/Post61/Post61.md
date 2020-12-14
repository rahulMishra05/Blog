# Sleep and Open Terminal using While Loop | Shell Scripting

**This is a multipart blog article series where I am going to explain the concepts of shell scripting and how to write a shell script in Linux, UNIX or Mac based systems. You can also follow this tutorial blog using windows but for that you have to install a bash from.**

_In this article we will see that how can we use sleep system call using while loop, and how can we open terminal using while loop in shell script._

1. **Sleep command:**
    - If you want to pause the execution of the loop for a while then you can use `sleep` command.
    - Sleep `1` will pauses the execution of the loop for `1` second.
    - ```shell
        n=1
        while [ $n -le 3 ]
        do
            echo "$n"
            (( n++ ))
            sleep(1)
        done
      ```
2. **Open terminal:**
    - We can open the terminal using the while loop in the shell script.
    - In the loop if we write `gnome-terminal &` then the terminal which is present in GNOME desktop will get open.
    - ```shell
      n=1
      while [ $n -le 3 ]
      do
        echo "$n"
        (( ++n ))
        gnome-terminal &
      done
      ```

[Reference code file for this article](https://github.com/rahulMishra05/shell-scripting/blob/main/video16.sh)

_So this was all about how to use sleep command and how to open terminal using while loop in shell script. Hope you liked it and learned something new form it._

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
 
