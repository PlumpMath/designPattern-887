/**   
* @Description: 抽象同事类
* @author wby  
* @date 2016年8月12日 上午11:52:07 
* @version V1.0   
*/
package dp.mediator;

public abstract class AbstractColleague {
	
	protected AbstractMediator mediator;
	//通过protectd 让子类重载，子类可以改为public
	protected AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}

}
