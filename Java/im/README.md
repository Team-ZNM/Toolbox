# e 打算写个聊天的项目

### 大概架构都想好了

* Spring boot 2.x
* mybatis plus 3.x
* netty-socketio 4.1x
* shiro
* PC 端 vue Element 
* 移动端H5 vue cube-ui 
* Android
#
### IM功能
* 一对一聊天
* 群组聊天
* 聊天室聊天
* 搜索用户
* 加\删好友
#
### 数据结构
######准备从ofbiz的主干上面删减一些
* person 用户表
* chatgroup 聊天组表
* chatroom 聊天室表
* chatmessage 聊天信息表
* personAssoc 用户关系表
* groupAssoc 用户与群组关系表
* roomAssoc 用户与聊天室关系表
