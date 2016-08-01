/**   
* @Description: 男性工厂
* @author wby  
* @date 2016年8月1日 下午5:48:10 
* @version V1.0   
*/
package dp.abstractfactory;

import dp.abstractfactory.entity.MaleBlackHuman;
import dp.abstractfactory.entity.MaleWhiteHuman;
import dp.abstractfactory.entity.MaleYellowHuman;


public class MaleHumanFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}


}
