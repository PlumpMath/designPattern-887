/**   
 * @Description: 虚拟代理模式
 * @author wby  
 * @date 2016年8月9日 下午3:35:21 
 * @version V1.0   
 */
package dp.proxy.virualproxy;

import dp.proxy.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer;

	private String name;

	private void createReal() {
		if (null == this.gamePlayer) {
			try {
				System.out.println("创建实体");
				this.gamePlayer = new GamePlayer(this, this.name);
			} catch (Exception e) {
				// 创建失败时的处理
				e.printStackTrace();
			}
		}
	}

	public GamePlayerProxy(String name) {
		System.out.println("创建代理");
		this.name = name;
	}

	@Override
	public void login(String user, String pwd) {
		createReal();
		System.out.print("代理");
		this.gamePlayer.login(user, pwd);

	}

	@Override
	public void killBoss() {
		createReal();
		System.out.print("代理");
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		createReal();
		System.out.print("代理");
		this.gamePlayer.upgrade();

	}

}
