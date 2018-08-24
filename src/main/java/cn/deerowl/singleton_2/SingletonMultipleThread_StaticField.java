package cn.deerowl.singleton_2;

public class SingletonMultipleThread_StaticField {
    //非惰性加载 使用final关键字确保实例只会初始化一次
    private static final SingletonMultipleThread_StaticField singletonMultipleThread_staticField = new SingletonMultipleThread_StaticField();

    public static SingletonMultipleThread_StaticField getInstance(){
        return singletonMultipleThread_staticField;
    }
    private SingletonMultipleThread_StaticField(){}

}