package com.day11.Problem5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("发送数据：");
        Socket client = new Socket("127.0.0.1", 8888);
        OutputStream ops = client.getOutputStream();
        ops.write("hello,服务器，我是客户端".getBytes());
        ops.close();
        client.close();
    }
}
