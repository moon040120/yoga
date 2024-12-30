package com.qianting.yoga.studio.utils;

public class ThreadLocalUtil {

    private static final ThreadLocal THERAD_LOCAL = new ThreadLocal();


    public  static <T> T get(){
        return (T) THERAD_LOCAL.get();
    }

    public static  void set(Object value){
        THERAD_LOCAL.set(value);
    }

    public static  void remove(){
        THERAD_LOCAL.remove();
    }

}
