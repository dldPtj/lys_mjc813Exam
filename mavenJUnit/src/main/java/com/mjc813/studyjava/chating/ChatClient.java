package com.mjc813.studyjava.chating;

import com.mjc813.studyjava.wakitoki.ClientJavaPgm;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ChatClient {
    private Socket socket;
    private BufferedReader br;
    private BufferedWriter bw;

    public void connect( String ip, int port ) throws IOException {
        socket = new Socket();
        socket.connect(new InetSocketAddress(ip, port));
        this.bw = new BufferedWriter(
                new OutputStreamWriter(this.socket.getOutputStream())
        );
        this.br = new BufferedReader(
                new InputStreamReader(this.socket.getInputStream())
        );
    }

    public void write(String str) throws IOException {
        this.bw.write(str);
        this.bw.newLine();
        this.bw.flush();
    }

    public void read() throws IOException {
        String s = this.br.readLine();
        System.out.println();
    }

    public void close() throws IOException {
        this.br.close();
        this.bw.close();
        this.socket.close();
    }

    public static void main(String[] args) {
        System.out.println("클라이언트 실행");
        ChatClient client = new ChatClient();
        try {
            client.connect("172.111.114.116"/*옆사람의 ip주소*/, 50001);
            client.write(String.format("Client[%s] %s"
                    , InetAddress.getLocalHost()
                    , "잘 접속했다."));
            client.read();
            client.write(String.format("첫번째 잘 받았다."));
            client.read();
            client.write(String.format("두번째 잘 받았다."));
            client.read();
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
