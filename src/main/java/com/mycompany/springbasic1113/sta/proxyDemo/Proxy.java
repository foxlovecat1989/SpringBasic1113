package com.mycompany.springbasic1113.sta.proxyDemo;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void doRequest() {
        System.out.println("Log before..."); // 公用程式
        subject.doRequest();                // 調用指定的業務程式
        System.out.println("Log after..."); // 公用程式
    }
    
}
