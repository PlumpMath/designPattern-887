/**   
 * @Title: LazySingleton.java 
 * @Description: 延迟单例模式
 * @author wby  
 * @date 2016年7月25日 下午5:33:16 
 * @version V1.0   
 */
package dp.singleton;

public class LazySingleton {
	private static LazySingleton singleton = null;

	private LazySingleton() {
		super();
	}
	
	public static synchronized LazySingleton getSingleton() {
		if(null == singleton) {
			singleton = new LazySingleton();
		}
		return singleton;
	}
}
