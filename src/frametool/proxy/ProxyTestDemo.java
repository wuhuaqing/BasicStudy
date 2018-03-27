package frametool.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by admin on 2018/3/27.
 */
public class ProxyTestDemo  implements InvocationHandler{

    public  Object realObject ;

    public Object  bind(Object realObject){
        this.realObject =  realObject;
        Object proxyObj =   Proxy.newProxyInstance(realObject.getClass().getClassLoader(), realObject.getClass().getInterfaces(),
                this);
        return  proxyObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

         Object result =  method.invoke(realObject,args);
         System.out.println("的看法绝对是卡积分");
        return result;
    }
}
