# Linux文件操作
```
#nano 文本编辑器
    #保存退出
    nano ctrl+x 
    #有则打开原来的 无则新创建
    nano xxx.txt
#文件复制
    #复制文件也会将文件的权限、所有者、用户组也一并复制过去
    #cp 源文件 目标文件
    cp /var/temp.sh /var/code/temp.sh
#改变文件所属用户组 staff
    chgrp staff install.log
    chown .staff install.log
#改变文件所有者 lsl
    chown lsl install.log
#一起改变
    chown lsl:staff install.log
#改变文件权限 很重要
    r=4
    w=2
    x=1
    文件权限一共10个字符
    第一位是代表
    -rw-r--r--
    第一个短杠代表
    chmod 777 a.log

cat -n
查看文件时显示行号
tail 11.txt
查看最后几行
cat -A 11.txt
查看全部内容 包括隐藏的符号

#移动
mv www/a.txt /var/
移动文件
mv www/a.txt www/rr.txt
重命名
mv www/qq/ www/ww /www/er
将前两个文件夹所有内容移动到 最后一个文件夹内
#删除
#删除文件
rm -i aaa.txt
#删除模糊查询出来的前缀aa的文件
rm -i aa*
#递归删除一个目录
rm -r ddd
#清空某个文件的内容
echo "" >error.log
#统计文件大小大于100MB的文件
ls -lh  $(find / -type f -size +100M)
#显示前10个占用空间最大的文件或目录：
du -s * | sort -nr | head
```