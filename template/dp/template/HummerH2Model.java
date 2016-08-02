/**   
* @Description: h2型hammer
* @author wby  
* @date 2016年8月2日 上午11:49:27 
* @version V1.0   
*/
package dp.template;

public class HummerH2Model extends HummerModel{

	@Override
	protected void start() {
		System.out.println("h2型悍马 启动");
		
	}

	@Override
	protected void stop() {
		System.out.println("h2型悍马 停止");
		
	}

	@Override
	protected void alarm() {
		System.out.println("h2型悍马 鸣笛");
		
	}

	@Override
	protected void engineBoom() {
		System.out.println("h2型悍马 引擎轰鸣");
		
	}

}
