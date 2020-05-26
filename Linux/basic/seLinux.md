# Linux -> basic
## seLinux
### seLinux是什么？
    SELinux全称为安全增强式 Security-Enhanced Linux（SELinux），是一个在内核中实践的强制存取控制（MAC）安全性机制。SELinux 首先在 CentOS 4 出现，并在其后的 CentOS 发行版本获得重大改善。这些改善代表用 SELinux 解决问题的方法亦随著时间而改变。

### SELinux的原理与架构
    SELinux的整体架构和原理都比较简单，使用也不复杂。其复杂的地方在于规则非常复杂，每个进程都要有规则策略。
    SELinux有2个核心组件及一些配套的工具。这两个核心组件分别是内核逻辑和策略数据库。当然，策略数据库本身并非软件逻辑，而是一个静态的数据库，为内核逻辑提供判断的依据。SELinux 更能遵从最小权限的理念。在开启SELinux的情况下（enforcing模式），所有访问默认是被拒绝的，而有一系列例外的策略来允许系统的元素（服务、进程、用户）具备访问资源的权限。
### SELinux的管理与模式
    可以通过/etc/selinux/config文件中的配置项实现对SELinux的管理，包括启动、停止和修改策略类型等。
    查看这个文件 里面就是SELINUX和SELINUXTYPE。其中SELINUX表示SELinux的启用状态，可以有3种模式。
    Enforcing： 此选项会在系统上启用并实施 SELinux 的安全性政策，拒绝存取及记录审计日志
    Permissive： 在 Permissive 模式下，SELinux 会被启用但不会实施安全性政策，而只会发出警告及记录审计日志
    Disabled： 该选项表示SELinux 处于非工作状态
### SELinux的类型
    从上述配置文件还可以看出SELinux有2中类型，分别是targeted和mls。
### 我们需要在什么地方应用？
#### 这里有一点要明确，就是seLinux虽然原理简单，但是操作复杂，对于运维要求很高，一般的中小企业是不建议开启seLinux的，Linux的多用户控制一下就可以了，所以我们要讲的是，该如何禁用seLinux。
    一般情况下，阿里云和百度云这两个我用过的centos7.x制作的镜像系统里，seLinux是默认被禁用的；但是我下载的官方的centos7.x的镜像是默认开启的
### 查看seLinux的状态

* /usr/sbin/sestatus -v      ##如果SELinux status参数为enabled即为开启状态
```
[root@localhost nasa]# /usr/sbin/sestatus -v
SELinux status:                 enabled
SELinuxfs mount:                /sys/fs/selinux
SELinux root directory:         /etc/selinux
Loaded policy name:             targeted
Current mode:                   enforcing
Mode from config file:          enforcing
Policy MLS status:              enabled
Policy deny_unknown status:     allowed
Max kernel policy version:      31

Process contexts:
Current context:                unconfined_u:unconfined_r:unconfined_t:s0-s0:c0.c1023
Init context:                   system_u:system_r:init_t:s0
/usr/sbin/sshd                  system_u:system_r:sshd_t:s0-s0:c0.c1023

File contexts:
Controlling terminal:           unconfined_u:object_r:user_devpts_t:s0
/etc/passwd                     system_u:object_r:passwd_file_t:s0
/etc/shadow                     system_u:object_r:shadow_t:s0
/bin/bash                       system_u:object_r:shell_exec_t:s0
/bin/login                      system_u:object_r:login_exec_t:s0
/bin/sh                         system_u:object_r:bin_t:s0 -> system_u:object_r:shell_exec_t:s0
/sbin/agetty                    system_u:object_r:getty_exec_t:s0
/sbin/init                      system_u:object_r:bin_t:s0 -> system_u:object_r:init_exec_t:s0
/usr/sbin/sshd                  system_u:object_r:sshd_exec_t:s0
#以上是执行了查看命令之后的反馈信息 但是有无启用主要看下面的代码 enable就说明已经启用了
SELinux status:                 enabled
```

* getenforce                 ##也可以用这个命令检查
```
[root@localhost nasa]# getenforce
Enforcing
#这里就很明确了 直接告诉你seLinux已经开启了
```
### 关闭SELinux：

* 临时关闭（不用重启机器）：
```
setenforce 0                  ##设置SELinux 成为permissive模式

                              ##setenforce 1 设置SELinux 成为enforcing模式
```
* 修改配置文件需要重启机器：

        修改/etc/selinux/config 文件
        将SELINUX=enforcing改为SELINUX=disabled
        重启机器即可


