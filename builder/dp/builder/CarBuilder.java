/**   
 * @Description: 汽车构造
 * @author wby  
 * @date 2016年8月7日 下午5:19:23 
 * @version V1.0   
 */
package dp.builder;

import java.util.ArrayList;
import java.util.List;

import dp.builder.entity.CarModel;

public abstract class CarBuilder {

	protected abstract void setSequence(List<String> s);

	public abstract CarModel getCarModel();
}
