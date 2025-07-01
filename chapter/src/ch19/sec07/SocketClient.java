package ch19.sec07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketClient {
    //필드
    ChatServer chatServer;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String clientIp;
    String chatName;
}
