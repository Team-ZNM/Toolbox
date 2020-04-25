# Linux -> basic
# linux cron 定时任务
### cron
#
位置 crond位于/etc/rc.d/init.d/crond 或 /etc/init.d 或 /etc/rc.d /rc5.d/S90crond,最总引用/var/lock/subsys/crond。

cron是一个linux下的定时执行工具（相当于windows下的scheduled task），可以在无需人工干预的情况下定时地运行任务task。由于cron 是Linux的service（deamon），可以用以下的方法启动、关闭这个服务： 
/sbin/service crond start //启动服务 
/sbin/service crond stop //关闭服务 
/sbin/service crond restart //重启服务 
/sbin/service crond reload //重新载入配置 

你也可以将这个服务在系统启动的时候自动启动： 
在/etc/rc.d/rc.local这个脚本的末尾加上： 
/sbin/service crond start 

现在cron这个服务已经在进程里面了，我们就可以用这个服务了。

#
### crontab
#
位置 crontab位于/usr/bin/crontab。

cron服务提供crontab命令来设定cron服务的，以下是这个命令的一些参数与说明： 
crontab -u //设定某个用户的cron服务，一般root用户在执行这个命令的时候需要此参数 
crontab -l //列出某个用户cron服务的详细内容 
crontab -r //删除某个用户的cron服务 
crontab -e //编辑某个用户的cron服务  


