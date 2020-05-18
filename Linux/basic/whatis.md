# Linux -> basic
## whatis
### what‘s this？
#### whatis命令是用于查询一个命令执行什么功能，并将查询结果打印到终端上，相当于 man -f
### 使用语法
```
whatis 命令/系统调用/库函数/特殊文件名
```
### 实战
```
[root@localhost ~]# whatis ls
ls                   (1)  - list directory contents
ls                   (1p)  - list directory contents

[root@localhost ~]# whatis cp
cp                   (1)  - copy files and directories
cp                   (1p)  - copy files

[root@localhost ~]# whatis chown
chown                (1)  - change file owner and group
chown                (1p)  - change the file ownership
chown                (2)  - change ownership of a file
chown                (3p)  - change owner and group of a file

```


