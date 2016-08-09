/**   
 * @Description: 普通代理模式
 * @author wby  
 * @date 2016年8月9日 下午3:35:21 
 * @version V1.0   
 */
package dp.proxy.common;

import dp.proxy.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer;

	public GamePlayerProxy(String name) {
		try {
			this.gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			//创建失败时的处理
			e.printStackTrace();
		}
	}

	@Override
	public void login(String user, String pwd) {
		System.out.print("代理");
		this.gamePlayer.login(user, pwd);

	}

	@Override
	public void killBoss() {
		System.out.print("代理");
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		System.out.print("代理");
		this.gamePlayer.upgrade();

	}

}
