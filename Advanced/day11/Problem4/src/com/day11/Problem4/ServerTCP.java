package com.day11.Problem4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("等待客户端连接……");
        ServerSocket ss=new ServerSocket(8888);
        Socket server=ss.accept();
        InputStream is=server.getInputStream();
        byte[] b=new byte[1024];
        int len=is.read(b);
        String msg=new String(b,0,len);
        System.out.println(msg);
        is.close();
        server.close();
    }
}
