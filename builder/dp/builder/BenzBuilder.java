/**   
* @Description: TODO(用一句话描述该文件做什么) 
* @author wby  
* @date 2016年8月8日 上午10:40:30 
* @version V1.0   
*/
package dp.builder;

import java.util.List;

import dp.builder.entity.BenzModel;
import dp.builder.entity.CarModel;

public class BenzBuilder extends CarBuilder {
	
	private CarModel car = new BenzModel();

	@Override
	public CarModel getCarModel() {
		return this.car;
	}

	@Override
	protected void setSequence(List<String> s) {
		this.car.setSequence(s);
	}

}
