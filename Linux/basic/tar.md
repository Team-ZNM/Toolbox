# Linux -> basic
## tar命令
#### tar功能
* 将多个文文件打包为一个文件
* 将文件打包并压缩
* 将打包的文件解包
* 将打包压缩的文件解压

#### 用法 
```
tar [选项] [文件]
```

#### 命令选项 　
```
-A, --catenate   　　　　　　       追加 tar 文件至归档
-c, --create              　　　　 创建一个新归档
-r, --append              　　　　 追加文件至归档结尾
-u, --update             　　　　  仅追加比归档中副本更新的文件
-x, --extract, --get      　　  　 从归档中解出文件
-t, --list                 　　　  列出归档内容
-z, --gzip, --gunzip, --ungzip    通过 gzip 压缩归档
-j, --bzip2                  　　  通过 bzip2 压缩归档
-J, --xz                   　　　　 通过 xz 过滤归档
--lzip                 　　　　　　 通过 lzip 过滤归档
--lzma                 　　　　    通过 lzma 过滤归档
-Z, --compress, --uncompress      通过 compress 压缩归档
-v, --verbose               　　   详细地列出处理的文件过程
-k, --keep-old-files   　　　　     保留源文件不覆盖
-m, --touch            　　        不要解压文件的修改时间
-W, --verify               　　　　在写入以后尝试校验归档
f, --file=ARCHIVE         　　    使用归档文件或 ARCHIVE 设备，这个参数是最后一个，后面只接文件名
-b, --blocking-factor=BLOCKS     设置每个记录 BLOCKS x 512 字节
-C, --directory=DIR       　　    改变至目录 DIR
--help   　　 　　　　　　          显示帮助信息
--version 　 　　　　　　           显示版本信息
```
### 实战
* 将本目录下所有txt文件打包为test.tar
```
[root@tmp ~]# ls
1.txt  2.txt  3.txt  4.txt  anaconda-ks.cfg  test.tar
[root@tmp ~]# tar -zcvf test.tar.gz *.txt
1.txt
2.txt
3.txt
4.txt
[root@tmp ~]# ls
1.txt  2.txt  3.txt  4.txt  anaconda-ks.cfg  test.tar  test.tar.gz

```
* 将本目录下所有txt文件打包为test.tar.bz2
```
[root@tmp ~]# ls
1.txt  2.txt  3.txt  4.txt  anaconda-ks.cfg  test.tar  test.tar.gz
[root@tmp ~]# tar -jcvf test.tar.bz2 *.txt
1.txt
2.txt
3.txt
4.txt
[root@tmp ~]# ls
1.txt  2.txt  3.txt  4.txt  anaconda-ks.cfg  test.tar  test.tar.bz2  test.tar.gz
```
* 列出 test.tar 里的文件
```
[root@tmp ~]# tar -tf test.tar
1.txt
2.txt
3.txt
4.txt
```
* 将 test.tar 解包
```
[root@tmp ~]# ls
anaconda-ks.cfg  test.tar  test.tar.bz2  test.tar.gz
[root@tmp ~]# tar -xvf test.tar
1.txt
2.txt
3.txt
4.txt
[root@tmp ~]# ls
1.txt  2.txt  3.txt  4.txt  anaconda-ks.cfg  test.tar  test.tar.bz2  test.tar.gz
```
* 将 test.tar.gz 解压
```
[root@tmp ~]# ls
anaconda-ks.cfg  test.tar  test.tar.bz2  test.tar.gz
[root@tmp ~]# tar -zxvf test.tar.gz 
1.txt
2.txt
3.txt
4.txt
[root@tmp ~]# ls
1.txt  2.txt  3.txt  4.txt  anaconda-ks.cfg  test.tar  test.tar.bz2  test.tar.gz
```
* 将 test.tar.bz2 解压
```
[root@tmp ~]# ls
anaconda-ks.cfg  test.tar  test.tar.bz2  test.tar.gz
[root@tmp ~]# tar -jxvf test.tar.bz2 
1.txt
2.txt
3.txt
4.txt
[root@tmp ~]# ls
1.txt  2.txt  3.txt  4.txt  anaconda-ks.cfg  test.tar  test.tar.bz2  test.tar.gz
```

