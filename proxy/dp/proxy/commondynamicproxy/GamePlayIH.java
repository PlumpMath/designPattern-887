/**   
* @Description: TODO(用一句话描述该文件做什么) 
* @author wby  
* @date 2016年8月9日 下午5:16:24 
* @version V1.0   
*/
package dp.proxy.commondynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {
	
	private Object obj;
	
	private Iadvice adv;
	
	public GamePlayIH(Object obj,Iadvice adv) {
		this.obj = obj;
		this.adv = adv;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		adv.exec();
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
