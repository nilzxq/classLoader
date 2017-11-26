package com.edu.classloader;

/**
 * @Author:zhangxueqing
 * @Description:BaseManager的子类，此类需要实现java类的热加载功能
 * @Date:Created in 15:24 2017/11/26
 * @Modified By:
 */
public class MyManager implements BaseManager {
    @Override
    public void logic() {
        System.out.println("如何实现一个Java类的热加载案例");
        System.out.println("学习资源丰富，师资强大");
    }
}
