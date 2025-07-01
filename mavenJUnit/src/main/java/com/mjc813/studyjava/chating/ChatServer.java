package com.mjc813.studyjava.chating;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    private ServerSocket serverSocket;
    private BufferedWriter bw;
    private BufferedReader br;

    public Socket accept(int port) throws IOException {
        this.serverSocket = new ServerSocket();
        this.serverSocket.bind(new InetSocketAddress(port));
        Socket socket = this.serverSocket.accept();
        this.br = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        this.bw = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())
        );
        return socket;
    }

    public void read(Socket socket) throws IOException {
        String str = this.br.readLine();
        System.out.println();
    }

    public void close(Socket socket) throws IOException {
        this.br.close();
        this.bw.close();
        socket.close();
        this.serverSocket.close();
    }

    public void write(Socket socket, String str) throws IOException {
        this.bw.write(str);
        this.bw.newLine();
        this.bw.flush();
    }

    public static void main(String[] args) {
        System.out.println("서버 실행");

        ChatServer server = new ChatServer();
        try {
            Socket socket = server.accept(50001);
            server.read(socket);
            server.write(socket, "서버 보내기");
            server.close(socket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
