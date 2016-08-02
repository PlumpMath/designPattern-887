/**   
 * @Description: 悍马模版类
 * @author wby  
 * @date 2016年8月2日 上午11:46:34 
 * @version V1.0   
 */
package dp.template;

public abstract class HummerModel {

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	public void run() {
		this.start();

		this.alarm();
		this.engineBoom();

		this.stop();
	}

}
