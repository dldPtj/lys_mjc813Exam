package com.mjc813.studyjava.readthread;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientJavaPgm implements Runnable {
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

    @Override
    public void run() {
        try {
            while (true) {
                this.read();
            }
        } catch (Exception ex) {
            System.out.println("exit run Thread");
        }
    }

    public void read() throws IOException {
        String s = this.br.readLine();
        System.out.printf("From Server : %s\n", s);
        if ("exit".equals(s)) {
            System.exit(0);
        }
    }

    public void close() throws IOException {
        this.br.close();
        this.bw.close();
        this.socket.close();
    }

    public static void main(String[] args) {
        System.out.println("ClientJavaPgm start");
        ClientJavaPgm cjp = new ClientJavaPgm();
        Scanner scan = new Scanner(System.in);
        try {
            cjp.connect("172.111.114.116"/*옆사람의 ip주소*/, 59999);
            Thread th = new Thread(cjp);
            th.start();
            cjp.write(String.format("Client[%s] %s"
                    , InetAddress.getLocalHost()
                    , "잘 접속했다."));
            while ( true ) {
                String str = scan.nextLine();
                cjp.write(str);
                if( "exit".equals(str) ) {
                    break;
                }
            }
            cjp.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
