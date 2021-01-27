package com.mycompany.springbasic1113.dyn;

import java.util.Arrays;

public class MyLogger {
    public static void before(Class cls, String methodName, Object[] args) {
        System.out.printf("before log: %s %s %s\n", cls, methodName, Arrays.toString(args));
    }
    public static void end(Class cls, String methodName, Object result) {
        System.out.printf("end log: %s %s %s\n", cls, methodName, result);
    }
}
