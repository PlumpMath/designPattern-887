/**   
 * @Description: 玩家代理
 * @author wby  
 * @date 2016年8月9日 下午2:32:45 
 * @version V1.0   
 */
package dp.proxy.attrplus;

public class GamePlayerProxy implements IGamePlayer,IProxy {

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
		this.count();
	}

	@Override
	public void count() {
		System.out.println("。计费150元。");
		
	}

}
