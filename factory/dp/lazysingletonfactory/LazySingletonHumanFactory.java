/**   
* @Description: 懒汉式单例工厂实现类
* @author wby  
* @date 2016年7月26日 下午3:09:43 
* @version V1.0   
*/
package dp.lazysingletonfactory;

import java.util.HashMap;
import java.util.Map;

import dp.factorymenthod.Human;

public class LazySingletonHumanFactory {
	
	private static final Map<String,Human> cache = new HashMap<String,Human>();

	@SuppressWarnings("unchecked")
	public synchronized static <T extends Human> T createHuman(String type) {
		Human human = null;
		if(null == cache.get(type)) {
			try {
				human = (Human) Class.forName(type).newInstance();
				cache.put(type, human);
			} catch (Exception e) {
				System.out.println("找不到"+type+"对应的人种。");
			}
		}
		
		return (T) human;//此处不会有转换错误，方法入口做了两个限制，必须存在class，其次，必须是human的子类
	}

}
