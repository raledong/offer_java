package cn.deerowl.singleton_2;

public class SingletonMultipleThread_StaticField {
    //�Ƕ��Լ��� ʹ��final�ؼ���ȷ��ʵ��ֻ���ʼ��һ��
    private static final SingletonMultipleThread_StaticField singletonMultipleThread_staticField = new SingletonMultipleThread_StaticField();

    public static SingletonMultipleThread_StaticField getInstance(){
        return singletonMultipleThread_staticField;
    }
    private SingletonMultipleThread_StaticField(){}

}