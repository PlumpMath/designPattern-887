/**   
 * @Title: BlackHuman.java 
 * @Description: 黑人
 * @author wby  
 * @date 2016年7月26日 下午2:06:27 
 * @version V1.0   
 */
package dp.factorymenthod.entity;

import dp.factorymenthod.Human;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑人皮肤黑色");
	}

	@Override
	public void talk() {
		System.out.println("黑人说话巴拉拉巴勒巴拉巴拉");
	}

}
