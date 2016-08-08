/**   
 * @Description: 客户端调用
 * @author wby  
 * @date 2016年8月8日 上午10:57:13 
 * @version V1.0   
 */
package dp.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		// 1万辆A类型的奔驰车
		for (int i = 0; i < 10000; i++) {
			director.getABenzModel().run();
		}
		// 100万辆B类型的奔驰车
		for (int i = 0; i < 1000000; i++) {
			director.getBBenzModel().run();
		}
		// 1000万辆C类型的宝马车
		for (int i = 0; i < 10000000; i++) {
			director.getCBmwModel().run();
		}
	}
}
