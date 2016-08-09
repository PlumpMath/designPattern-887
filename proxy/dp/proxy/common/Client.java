/**   
 * @Description: 场景类
 * @author wby  
 * @date 2016年8月9日 下午2:35:13 
 * @version V1.0   
 */
package dp.proxy.common;

import dp.proxy.IGamePlayer;

public class Client {
	public static void main(String[] args) {

		// 代理
		// 定义一个痴迷的玩家
		IGamePlayer playerPorxy = new GamePlayerProxy("zhangsan");
		// 开始打游戏，记下时间戳
		System.out.println("开始时间是：2009-8-28 10:45");
		playerPorxy.login("zhangSan", "password");
		// 开始杀怪
		playerPorxy.killBoss();
		// 升级
		playerPorxy.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是：2009-8-29 03:40");
	}

}
