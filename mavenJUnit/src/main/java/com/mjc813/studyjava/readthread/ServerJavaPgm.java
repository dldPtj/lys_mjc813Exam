package com.mjc813.studyjava.readthread;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerJavaPgm extends Thread {
    private ServerSocket serverSocket;
    private Socket cSck; // 클라이언트와 통신할 소켓
    private BufferedWriter bw; // 클라이언트에 데이터를 전송할 BufferStream
    private BufferedReader br; // 클라이언트에 데이터를 받을 BufferStreamr

    public void init(int port) throws IOException {
        this.serverSocket = new ServerSocket();
        this.serverSocket.bind(new InetSocketAddress(port));
    }

    public void accept() throws IOException {
        this.cSck = this.serverSocket.accept();
        System.out.printf("accept Client : %s\n", this.cSck);
        this.br = new BufferedReader(
                new InputStreamReader(this.cSck.getInputStream())
        );
        this.bw = new BufferedWriter(
                new OutputStreamWriter(this.cSck.getOutputStream())
        );
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.read();
            }
        } catch (Exception ex) {
            System.out.println("exit run thread");
        } finally {
            try {
                this.close();
                System.exit(0);
            } catch (Exception e) {
            }
        }
    }

    public void read() throws IOException {
        String str = this.br.readLine();
        System.out.printf("From Client : %s\n", str);
        if("exit".equals(str)) {
            this.close();
        }
    }

    public void close() throws IOException {
        this.bw.close();
        this.br.close();
        this.cSck.close();
        this.serverSocket.close();
    }

    public void write(String str) throws IOException {
        this.bw.write(str);
        this.bw.newLine();
        this.bw.flush();
    }

    public static void main(String[] args) {
        System.out.println("ServerJavaPgm start");

        ServerJavaPgm sjp = new ServerJavaPgm();
        try {
            sjp.init(59999);
            sjp.accept();
            sjp.read();
            sjp.start();

            Scanner scan = new Scanner(System.in);
            while( true ) {
                String str = scan.nextLine();
                sjp.write(str);
                if( "exit".equals(str) ) {
                    break;
                }
            }
            //sjp.read();
            //sjp.write("서버도 보내본다.");
            //sjp.read();
            //sjp.write("서버에서 2차로 보내본다.");
            //sjp.read();
            //sjp.write("서버에서 3차로 보내본다.");
            //sjp.write("서버에서 4차로 보내본다.");
            //sjp.write("서버에서 5차로 보내본다.");
            //sjp.write("서버에서 6차로 보내본다.");
            //sjp.write("서버에서 7차로 보내본다.");
            //sjp.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
