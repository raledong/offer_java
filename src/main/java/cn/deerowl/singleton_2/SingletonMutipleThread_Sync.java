package cn.deerowl.singleton_2;

public class SingletonMutipleThread_Sync {
    private static volatile SingletonMutipleThread_Sync singletonMutipleThread_sync;

    //˫���жϣ�����������Ƶ�ʡ�һ��Ҫͨ��volatile�ؼ��ֱ�֤������
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