/**   
 * @Description: 车模版类
 * @author wby  
 * @date 2016年8月2日 上午11:46:34 
 * @version V1.0   
 */
package dp.builder.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CarModel {
	
	private List<String> sequence = new ArrayList<String>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	public void run() {
		
		if(this.sequence != null && !this.sequence.isEmpty()){
			String order;
			for (Iterator<String> it = sequence.iterator();it.hasNext();){
				order = it.next();
				if(order.equals("start")) {
					this.start();
				} else if(order.equals("alarm")) {
					this.alarm();
				} else if(order.equals("engineBoom")) {
					this.engineBoom();
				} else if(order.equals("stop")) {
					this.stop();
				} else {
					System.out.println("error order!!car down...");
				}
			}
		}
	}
	
	public void setSequence(List<String> sequence) { 
		this.sequence = sequence;
	}

}
