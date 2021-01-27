package com.mycompany.springbasic1113.sta.proxyDemo;

public class SubjectImpl implements Subject{

    @Override
    public void doRequest() {
        System.out.println("業務程式..."); // 業務程式
    }
}
