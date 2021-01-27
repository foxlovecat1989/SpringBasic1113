package com.mycompany.springbasic1113.sta.proxyDemo;

public class ProxyDemo {
    public static void main(String[] args) {
//      Subject subject = new RealSubject();
//      subject.request();
        Proxy proxy = new Proxy(new SubjectImpl());
        proxy.doRequest();
    }
}
