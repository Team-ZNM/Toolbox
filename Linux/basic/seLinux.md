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



