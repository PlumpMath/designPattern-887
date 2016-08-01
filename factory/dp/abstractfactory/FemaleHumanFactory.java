/**   
* @Description: 女性工厂
* @author wby  
* @date 2016年8月1日 下午5:48:10 
* @version V1.0   
*/
package dp.abstractfactory;

import dp.abstractfactory.entity.FemaleBlackHuman;
import dp.abstractfactory.entity.FemaleWhiteHuman;
import dp.abstractfactory.entity.FemaleYellowHuman;


public class FemaleHumanFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}


}
