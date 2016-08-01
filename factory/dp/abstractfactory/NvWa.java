/**   
* @Title: NvWa.java 
* @Description: 场景类
* @author wby  
* @date 2016年7月26日 下午3:13:29 
* @version V1.0   
*/
package dp.abstractfactory;

import dp.factorymenthod.entity.BlackHuman;
import dp.factorymenthod.entity.WhiteHuman;
import dp.factorymenthod.entity.YellowHuman;

public class NvWa {

	public static void main(String[] args) {
		HumanFactory femaleFactory = new FemaleHumanFactory();
		HumanFactory maleFactory = new MaleHumanFactory();
		System.out.println("制造白人");
		Human whiteHuman = femaleFactory.createWhiteHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		whiteHuman.getSex();
		whiteHuman = maleFactory.createWhiteHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		whiteHuman.getSex();
		System.out.println("制造黑人");
		Human blackHuman = femaleFactory.createBlackHuman();
		blackHuman.getColor();
		blackHuman.talk();
		blackHuman.getSex();
		blackHuman = maleFactory.createBlackHuman();
		blackHuman.getColor();
		blackHuman.talk();
		blackHuman.getSex();
		System.out.println("制造黄人");
		Human yellowHuman = femaleFactory.createYellowHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
		yellowHuman.getSex();
		yellowHuman = maleFactory.createYellowHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
		yellowHuman.getSex();
	}

}
