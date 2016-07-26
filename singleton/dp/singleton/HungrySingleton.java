/**   
* @Title: HungrySingleton.java 
* @Description: 饥饿单例模式
* @author wby  
* @date 2016年7月25日 下午5:29:45 
* @version V1.0   
*/
package dp.singleton;

public class HungrySingleton {
	
	private static final HungrySingleton singleton = new HungrySingleton();
	
	private HungrySingleton() {
		super();
	}
	
	public static HungrySingleton getSingleton() {
		return singleton;
	}

}
