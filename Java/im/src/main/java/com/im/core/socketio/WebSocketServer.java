package com.im.core.socketio;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * 用于和客户端进行连接
 */
public class WebSocketServer {

    public void bind(int port){
        //定义线程组
        EventLoopGroup mainGroup =  new NioEventLoopGroup();
        EventLoopGroup subGroup =  new NioEventLoopGroup();
        try {
            ServerBootstrap server = new ServerBootstrap();
            server.group(mainGroup, subGroup)
                    //channel类型
                    .channel(NioServerSocketChannel.class)
                    //针对subGroup做的子处理器，childHandler针对WebSokect的初始化器
                    .childHandler(new WebSocketinitializer());

            //绑定端口并以同步方式进行使用
            ChannelFuture channelFuture = server.bind(port).sync();

            //针对channelFuture，进行相应的监听
            channelFuture.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //针对两个group进行优雅地关闭
            mainGroup.shutdownGracefully();
            subGroup.shutdownGracefully();
        }
    }
}
