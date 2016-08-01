/**   
* @Title: WhiteHuman.java 
* @Description: 白种人 
* @author wby  
* @date 2016年7月26日 下午2:08:59 
* @version V1.0   
*/
package dp.factorymenthod.entity;

import dp.factorymenthod.Human;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("白种人皮肤白色");
	}

	@Override
	public void talk() {
		System.out.println("白种人说话巴拉拉巴勒巴拉巴拉");
	}

}
