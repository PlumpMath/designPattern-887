/**   
* @Title: NvWa.java 
* @Description: 场景类
* @author wby  
* @date 2016年7月26日 下午3:13:29 
* @version V1.0   
*/
package dp.simplefactory;

import dp.factorymenthod.Human;
import dp.factorymenthod.entity.BlackHuman;
import dp.factorymenthod.entity.WhiteHuman;
import dp.factorymenthod.entity.YellowHuman;

public class NvWa {

	public static void main(String[] args) {
		System.out.println("制造白人");
		Human whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		System.out.println("制造黑人");
		Human blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		System.out.println("制造黄人");
		Human yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
