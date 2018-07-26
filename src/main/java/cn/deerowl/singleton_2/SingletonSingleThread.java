package cn.deerowl.singleton_2;

public class SingletonSingleThread {
    private static SingletonSingleThread singletonSingleThread;

    //���Լ��� ֻ�������ڵ��̻߳����� ���̻߳��ʼ�����ʵ��
    public SingletonSingleThread getInstance(){
        if (singletonSingleThread == null){
            singletonSingleThread = new SingletonSingleThread();
        }
        return singletonSingleThread;
    }

    private SingletonSingleThread(){}
}