package com.zengyikeji.arithmetic;

/**
 * @autor ProsperKing
 * @date 2018/10/14 - 11:53
 * 单例-懒汉式-双重校验锁
 */
public class Single {
    private volatile static Single single;
    private Single(){

    };
    private static Single getSingle(){
        if (single==null){
            synchronized (Single.class){
                if (single == null)
                single = new Single();
            }
        }
        return single;
    }
}
