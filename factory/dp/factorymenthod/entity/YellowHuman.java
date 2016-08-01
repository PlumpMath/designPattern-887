/**   
* @Title: YellowHuman.java 
* @Description: 黄种人
* @author wby  
* @date 2016年7月26日 下午2:08:08 
* @version V1.0   
*/
package dp.factorymenthod.entity;

import dp.factorymenthod.Human;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄种人皮肤黄色");
	}

	@Override
	public void talk() {
		System.out.println("黄种人说话巴拉拉巴勒巴拉巴拉");
	}

}
