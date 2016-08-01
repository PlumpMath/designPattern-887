/**   
* @Title: AbstractHumanFactory.java 
* @Description: 抽象的工厂
* @author wby  
* @date 2016年7月26日 下午3:07:11 
* @version V1.0   
*/
package dp.factorymenthod;

public abstract class AbstractHumanFactory {
	
	public abstract <T extends Human> T createHuman(Class<T> c);

}
