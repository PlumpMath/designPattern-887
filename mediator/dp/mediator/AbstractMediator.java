/**   
 * @Description: 中介者抽象类
 * @author wby  
 * @date 2016年8月12日 上午11:41:55 
 * @version V1.0   
 */
package dp.mediator;

import dp.mediator.bo.Purchase;
import dp.mediator.bo.Sale;
import dp.mediator.bo.Stock;

public abstract class AbstractMediator {

	protected Purchase purchase;

	protected Sale sale;

	protected Stock stock;

	public AbstractMediator() {
		this.purchase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}

	/**
	 * @Title: execute
	 * @Description: 事件方法，处理多个时间间的业务
	 * @param str
	 * @param objects
	 * @return void
	 * @throws
	 */
	public abstract void execute(String str, Object... objects);

}
