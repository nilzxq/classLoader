package com.edu.classloader;

/**
 * @Author:zhangxueqing
 * @Description:后台启动一条线程不断重新加载实现了热加载的类
 * @Date:Created in 17:58 2017/11/26
 * @Modified By:
 */
public class MsgHandler implements Runnable {

    @Override
    public void run() {
        BaseManager manager=Managerfactory.getManager(Managerfactory.MY_MANAGER);
        manager.logic();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
