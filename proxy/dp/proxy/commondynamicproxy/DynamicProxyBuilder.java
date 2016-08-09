/**   
* @Description: 动态代理builder 
* @author wby  
* @date 2016年8月9日 下午6:16:54 
* @version V1.0   
*/
package dp.proxy.commondynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyBuilder<T> {
	
	public static <T> T getProxy(ClassLoader cl, Class[] cls,
			InvocationHandler ih){
		return (T)Proxy.newProxyInstance(
				cl,
				cls, ih);
	}

}
