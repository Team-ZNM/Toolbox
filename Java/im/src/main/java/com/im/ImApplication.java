package com.im;

import com.im.core.socketio.WebSocketServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(value = "com.im.business")
public class ImApplication {

	public static void main(String[] args) {
        SpringApplication.run(ImApplication.class, args);
        /**
         * 启动netty服务端服务
         */
        new WebSocketServer().bind(10086);
    }

}
