# Linux -> basic
## WC
#### wc命令用来统计字节数，字符数，字数，列数

#### 用法 
```
wc [选项] [文件]
```
#### 命令选项 　
```
-c,--bytes 　　　只显示Bytes数
-l,--lines       只显示列数
-m,--chars 　　  统计字符数
-w,--words     只显示字数
--help 　　　　  显示帮助信息
--version              显示版本信息
```
### 实战
* 统计 a.txt 的字节数
```
[root@tmp ~]# wc -c a.txt 
36 a.txt
```
* 统计 a.txt 的行数
```
[root@tmp ~]# wc -l a.txt 
12 a.txt
```