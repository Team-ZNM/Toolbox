# Linux
## rpm是什么?
    rpm命令是RPM软件包的管理工具。rpm原本是Red Hat Linux发行版专门用来管理Linux各项套件的程序，由于它遵循GPL规则且功能强大方便，因而广受欢迎。逐渐受到其他发行版的采用。RPM套件管理方式的出现，让Linux易于安装，升级，间接提升了Linux的适用度。
## rpm常见命令参数
```
用法: rpm [选项...]
-a：查询所有套件；
-b<完成阶段><套件档>+或-t <完成阶段><套件档>+：设置包装套件的完成阶段，并指定套件档的文件名称；
-c：只列出组态配置文件，本参数需配合"-l"参数使用；
-d：只列出文本文件，本参数需配合"-l"参数使用；
-e<套件档>或--erase<套件档>：删除指定的套件；
-f<文件>+：查询拥有指定文件的套件；
-h或--hash：套件安装时列出标记；
-i：显示套件的相关信息；
-i<套件档>或--install<套件档>：安装指定的套件档；
-l：显示套件的文件列表；
-p<套件档>+：查询指定的RPM套件档；
-q：使用询问模式，当遇到任何问题时，rpm指令会先询问用户；
-R：显示套件的关联性信息；
-s：显示文件状态，本参数需配合"-l"参数使用；
-U<套件档>或--upgrade<套件档>：升级指定的套件档；
-v：显示指令执行过程；
-vv：详细显示指令执行过程，便于排错。
```
## 如何安装rpm软件包
```
rpm -ivh your-package                # 直接安装
rpmrpm --force -ivh your-package.rpm # 忽略报错，强制安装
```
## 如何卸载rpm软件包
```
[lsl@localhost ~]# rpm -ql tree        # 查询
[lsl@localhost ~]# rpm -e tree          # 卸载
[lsl@localhost ~]# rpm -ql tree         # 查询
```
## 列出所有已安装的包
```
rpm -qa
```
## 如何获得某个软件包的全称
```
#rpm -q 包名
rpm -q tree
```
## rpm包中软件的安装位置
```
#rpm -ql 包名
rpm -ql tree
```
## 包含这个程序的软件包
```
rpm -qf `which 程序名`    #返回软件包的全名
rpm -qif `which 程序名`   #返回软件包的有关信息
rpm -qlf `which 程序名`   #返回软件包的文件列表
[lsl@localhost ~]# rpm -qf `which sshd`
```


