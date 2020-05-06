# e 打算写个聊天的项目

### 大概架构都想好了

* Spring boot 2.x
* mybatis plus 3.x
* netty-socketio 4.1x
* shiro
* PC 端 vue Element (暂时先用HTML+JQuery)
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
##### person 用户表
* id     令牌
* code   编码
* name   昵称
* number 序号
* avatar 头像地址
##### chatgroup 聊天组表
* id            群组编号
* name          群组名称
* des           群组说明
* createDate    创建日期
* createByUser  创建者
* number        序号
* avatar        头像地址
##### chatmessage 聊天信息表
* id            信息编号
* des            内容
* time           发送时间
* state          发送状态
* seedUser      发送者
* seedToUser    接收者
##### personAssoc 用户关系表
* id             关系编号
* personId       用户编号1
* personIdAss    用户编号2
* type           关系类型  ff 好友 bk 拉黑
##### groupAssoc 用户与群组关系表
* id             关系编号
* personId       用户编号
* groupId        群组编号
* type           关系类型  ff 好友 bk 拉黑
##### roomAssoc 令牌表
* id             令牌编号
* state          状态 是否被使用
##### roomAssoc 用户与聊天室关系表*
##### chatroom 聊天室表*
### 进度
netty核心已经添加 后续在此基础演化
