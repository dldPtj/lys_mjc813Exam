package com.mjc813.studyjava.multiclient;

public interface IWrite {
    public void sendAllTargets(String str);
    public void deleteTarget(ClientSocketBuffer deletObject);
}
// 양쪽에서 참조하지 않도록 인터페이스로 구현했다.