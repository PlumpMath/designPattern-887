/**   
 * @Description: benz model
 * @author wby  
 * @date 2016年8月7日 下午5:16:49 
 * @version V1.0   
 */
package dp.builder.entity;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("benz 启动。");

	}

	@Override
	protected void stop() {
		System.out.println("benz 停止。");

	}

	@Override
	protected void alarm() {
		System.out.println("benz 鸣笛。");

	}

	@Override
	protected void engineBoom() {
		System.out.println("benz 发动引擎。");

	}

}
