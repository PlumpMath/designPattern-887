/**   
* @Title: NvWa.java 
* @Description: 场景类
* @author wby  
* @date 2016年7月26日 下午3:13:29 
* @version V1.0   
*/
package dp.lazysingletonfactory;

import dp.factorymenthod.Human;
import dp.factorymenthod.entity.BlackHuman;
import dp.factorymenthod.entity.WhiteHuman;
import dp.factorymenthod.entity.YellowHuman;

public class NvWa {

	public static void main(String[] args) {
		System.out.println("制造白人");
		Human whiteHuman = LazySingletonHumanFactory.createHuman(WhiteHuman.class.getName());
		whiteHuman.getColor();
		whiteHuman.talk();
		System.out.println("制造黑人");
		Human blackHuman = LazySingletonHumanFactory.createHuman(BlackHuman.class.getName());
		blackHuman.getColor();
		blackHuman.talk();
		System.out.println("制造黄人");
		Human yellowHuman = LazySingletonHumanFactory.createHuman(YellowHuman.class.getName());
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
