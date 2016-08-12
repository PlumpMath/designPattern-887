/**   
 * @Description: 采购业务对象
 * @author wby  
 * @date 2016年8月12日 上午11:43:36 
 * @version V1.0   
 */
package dp.mediator.bo;

import dp.mediator.AbstractColleague;
import dp.mediator.AbstractMediator;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	// 采购IBM电脑
	public void buyIBMcomputer(int number){
		super.mediator.execute("purchase.buy",number);
	}

	// 不再采购IBM电脑
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}

}
