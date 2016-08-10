/**   
 * @Description: 邮件实体
 * @author wby  
 * @date 2016年8月10日 上午11:26:41 
 * @version V1.0   
 */
package dp.prototype.entity;


public class Mail implements Cloneable{

	private String receiver;

	private String subject;

	private String appellation;

	private String context;

	private String tail;

	//clone时，构造函数不会被执行
	public Mail(AdvTemplate advTemplate) {
		System.out.println("执行构造函数");
		this.context = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}

	@Override
	public Mail clone() throws CloneNotSupportedException {
		return (Mail) super.clone();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

}
