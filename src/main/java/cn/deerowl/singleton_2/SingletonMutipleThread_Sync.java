package cn.deerowl.singleton_2;

public class SingletonMutipleThread_Sync {
    private static volatile SingletonMutipleThread_Sync singletonMutipleThread_sync;

    //双重判断，减少上锁的频率。一定要通过volatile关键字保证看见性
    public static SingletonMutipleThread_Sync getInstance(){
        if (singletonMutipleThread_sync == null){
            synchronized (singletonMutipleThread_sync){
                if (singletonMutipleThread_sync == null){
                    singletonMutipleThread_sync = new SingletonMutipleThread_Sync();
                }
            }
        }
        return singletonMutipleThread_sync;
    }
}