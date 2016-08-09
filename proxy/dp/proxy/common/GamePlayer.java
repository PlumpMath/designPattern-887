/**   
* @Description: 普通代理模式
* @author wby  
* @date 2016年8月9日 下午3:32:09 
* @version V1.0   
*/
package dp.proxy.common;

import dp.proxy.IGamePlayer;

public class GamePlayer implements IGamePlayer {
	
	private String user;
	
	public GamePlayer(IGamePlayer gp,String name) {
		if(gp==null) {
			throw new IllegalArgumentException("gp 传入异常");
		}
		this.user = name;
	}

	@Override
	public void login(String user, String pwd) {
		System.out.println("玩家" + this.user + "登录游戏，密码是" + pwd);

	}

	@Override
	public void killBoss() {
		System.out.println("玩家" + this.user + "杀死boss");

	}

	@Override
	public void upgrade() {
		System.out.println("玩家" + this.user + "升级");

	}

}
