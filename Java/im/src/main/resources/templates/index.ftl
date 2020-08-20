<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
    </script>
</head>
<body>
<div >${token!}发送消息：</div><br>
<input type="text" name="messageContent" id="messageContent"/>
<input type="button" name="" id="seed" value="发送" onclick="chat()"/>

<hr>

<div id="1">接收消息：</div><br>
<div id="receiveNsg" style="background-color: gainsboro;"></div>


<script type="text/javascript">
    var uurl = window.location.host;
    uurl = uurl.split(":")[0];
    window.CHAT = {
        socket: null,
        //初始化
        init: function(){
            //首先判断浏览器是否支持WebSocket
            if (window.WebSocket){
                //CHAT.socket = new WebSocket("ws://127.0.0.1:10086/ws");
                CHAT.socket = new WebSocket("ws://"+uurl+":10086/ws");
                CHAT.socket.onopen = function(){
                    console.log("客户端与服务端建立连接成功");
                },
                    CHAT.socket.onmessage = function(e){
                        console.log("接收到消息："+e.data);
                        var receiveNsg = window.document.getElementById("receiveNsg");
                        var html = receiveNsg.innerHTML;
                        receiveNsg.innerHTML = html + "<br>" + e.data;
                    },
                    CHAT.socket.onerror = function(){
                        console.log("发生错误");
                    },
                    CHAT.socket.onclose = function(){
                        console.log("客户端与服务端关闭连接成功");
                    }
            }else{
                alert("9102年都过了，升级下浏览器吧");
            }
        },

    }

    function chat(){
        console.log("来过")
        var msg = window.document.getElementById("messageContent");
        CHAT.socket.send(msg.value);
        msg.value = "";
    }
    $('#messageContent').bind('keyup', function(event) {
        if (event.keyCode == "13") {
            //回车执行查询
            chat()
        }
    });
    $(function () {
        CHAT.init();
    })


</script>

</body>
</html>
