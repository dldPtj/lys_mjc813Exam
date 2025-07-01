package com.mjc813.studyjava.multiclient;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServerJavaPgm extends Thread implements IWrite {
    public static final String exitCommand = "ei@939()#*~@)(>.x93)";
    public static final String exitWord = "@quit@";
    
    private ServerSocket serverSocket;  // 클라이언트 접속 대기
    
//    private Socket[] cSck;    // 클라이언트와 통신할 소켓
//    private BufferedWriter[] bw;    // 클라이언트에 데이터를 전송할 BufferStream
//    private BufferedReader[] br;    // 클라이언트에 데이터를 받을 BufferStream
    private List<ClientSocketBuffer> clients = new LinkedList<>();

    public void init(int port) throws IOException {
        this.serverSocket = new ServerSocket();
        this.serverSocket.bind(new InetSocketAddress(port));
    }

    public void accept() throws IOException {
        Socket socket = this.serverSocket.accept();         // 여러 클라이언트와 통신하려면 accept와 socket, bw, br이 클라이언트 개수만큼 늘어나야함
        System.out.printf("accept Client : %s\n", socket);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())
        );
        ClientSocketBuffer csb = new ClientSocketBuffer(socket
                , br, bw, this);
        csb.start();
        this.clients.add(csb);
    }

    public void close() throws IOException {
        this.serverSocket.close();
    }

    public void write(String str) throws IOException {
        if(exitWord.equals(str)) {
            str = exitCommand;
        }
        this.sendAllTargets(str);
    }

    public void sendAllTargets(String str) {
        for ( ClientSocketBuffer csb : clients) {
            try {
                csb.write(str);
            } catch (IOException ex) {
                System.out.printf("해당 클라이언트[%s] 접속 끊겼음", csb.getSocket().getRemoteSocketAddress());
            }
        }
    }

    @Override
    public void deleteTarget(ClientSocketBuffer deletObject) {
        this.clients.remove(deletObject);
    }

    public static void main(String[] args) {
        System.out.println("ServerJavaPgm start");

        ServerJavaPgm sjp = new ServerJavaPgm();
        try {
            sjp.init(59999);;
            sjp.start();

            Scanner scan = new Scanner(System.in);
            while( true ) {
                String str = scan.nextLine();   // 키보드 입력 대기, 블로킹상태
                sjp.write(str);
                if( exitWord.equals(str) ) {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    @Override
    public void run() {
        try {
            while(true) {
                this.accept();
            }
        } catch (Exception ex) {
            System.out.println("서버 종료");
        } finally {
            try {
                this.close();
            } catch (IOException e) {
            }
        }
    }
}
