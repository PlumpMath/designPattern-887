/**   
* @Title: HumanFactory.java 
* @Description: 工厂实现类
* @author wby  
* @date 2016年7月26日 下午3:09:43 
* @version V1.0   
*/
package dp.factorymenthod;

public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = c.newInstance();
		} catch (Exception e) {
			System.out.println("找不到"+c.getName()+"对应的人种。");
		}
		return (T) human;//此处不会有转换错误，方法入口做了两个限制，必须存在class，其次，必须是human的子类
	}

}
