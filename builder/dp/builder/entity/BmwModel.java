/**   
 * @Description: bmw model
 * @author wby  
 * @date 2016年8月7日 下午5:16:49 
 * @version V1.0   
 */
package dp.builder.entity;

public class BmwModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("bmw 启动。");

	}

	@Override
	protected void stop() {
		System.out.println("bmw 停止。");

	}

	@Override
	protected void alarm() {
		System.out.println("bmw 鸣笛。");

	}

	@Override
	protected void engineBoom() {
		System.out.println("bmw 发动引擎。");

	}

}
