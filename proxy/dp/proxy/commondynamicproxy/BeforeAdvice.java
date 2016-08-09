/**   
* @Description: 切面方法
* @author wby  
* @date 2016年8月9日 下午7:55:43 
* @version V1.0   
*/
package dp.proxy.commondynamicproxy;

public class BeforeAdvice implements Iadvice {

	@Override
	public void exec() {
		System.out.print("代理");

	}

}
