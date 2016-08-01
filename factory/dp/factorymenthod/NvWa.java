/**   
* @Title: NvWa.java 
* @Description: 场景类
* @author wby  
* @date 2016年7月26日 下午3:13:29 
* @version V1.0   
*/
package dp.factorymenthod;

import dp.factorymenthod.entity.BlackHuman;
import dp.factorymenthod.entity.WhiteHuman;
import dp.factorymenthod.entity.YellowHuman;

public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		System.out.println("制造白人");
		Human whiteHuman = factory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		System.out.println("制造黑人");
		Human blackHuman = factory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		System.out.println("制造黄人");
		Human yellowHuman = factory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
