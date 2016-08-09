/**   
 * @Description: 强制代理模式
 * @author wby  
 * @date 2016年8月9日 下午3:35:21 
 * @version V1.0   
 */
package dp.proxy.force;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer;

	public GamePlayerProxy(IGamePlayer gp) {
		this.gamePlayer = gp;
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

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

}
