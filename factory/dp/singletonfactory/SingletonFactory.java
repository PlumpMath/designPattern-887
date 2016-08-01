/**   
 * @Title: SingletonFactory.java 
 * @Description: 单例工厂
 * @author wby  
 * @date 2016年7月26日 下午5:59:46 
 * @version V1.0   
 */
package dp.singletonfactory;

import java.lang.reflect.Constructor;

public class SingletonFactory {

	private static Singleton singleton;

	static {
		try {
			@SuppressWarnings("rawtypes")
			Class c = Class.forName(Singleton.class.getName());
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Constructor constructor = c.getDeclaredConstructor();
			//把构造方法设置为可以访问
			constructor.setAccessible(true);
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getSingleton() {
		return singleton;
	}

}
