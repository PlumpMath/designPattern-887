/**   
* @Description: 调用处理类 
* @author wby  
* @date 2016年8月9日 下午5:16:24 
* @version V1.0   
*/
package dp.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
	
	private Object obj;
	
	public GamePlayIH(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.print("代理");
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
