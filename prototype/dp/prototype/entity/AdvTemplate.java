/**   
 * @Description: 广告模版类 
 * @author wby  
 * @date 2016年8月10日 上午11:18:31 
 * @version V1.0   
 */
package dp.prototype.entity;

public class AdvTemplate {

	private String advSubject;

	private String advContext;

	public String getAdvSubject() {
		return advSubject;
	}

	public void setAdvSubject(String advSubject) {
		this.advSubject = advSubject;
	}

	public String getAdvContext() {
		return advContext;
	}

	public void setAdvContext(String advContext) {
		this.advContext = advContext;
	}

	public AdvTemplate() {
		super();
	}

	public AdvTemplate(String advSubject, String advContext) {
		super();
		this.advSubject = advSubject;
		this.advContext = advContext;
	}

}
