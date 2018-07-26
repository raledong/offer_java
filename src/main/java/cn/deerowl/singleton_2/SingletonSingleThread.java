package cn.deerowl.singleton_2;

public class SingletonSingleThread {
    private static SingletonSingleThread singletonSingleThread;

    //惰性加载 只能作用于单线程环境中 多线程会初始化多个实例
    public SingletonSingleThread getInstance(){
        if (singletonSingleThread == null){
            singletonSingleThread = new SingletonSingleThread();
        }
        return singletonSingleThread;
    }

    private SingletonSingleThread(){}
}