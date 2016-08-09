/**   
 * @Description: 强制代理模式
 * @author wby  
 * @date 2016年8月9日 下午3:32:09 
 * @version V1.0   
 */
package dp.proxy.force;

public class GamePlayer implements IGamePlayer {

	private String user;

	private IGamePlayer gp;

	public GamePlayer(String name) {
		this.user = name;
	}

	@Override
	public void login(String user, String pwd) {
		if (hasProxy()) {
			System.out.println("玩家" + this.user + "登录游戏，密码是" + pwd);
		} else {
			System.out.println("请找代理");
		}
	}

	@Override
	public void killBoss() {
		if (hasProxy()) {
			System.out.println("玩家" + this.user + "杀死boss");
		} else {
			System.out.println("请找代理");
		}
	}

	@Override
	public void upgrade() {
		if (hasProxy()) {
			System.out.println("玩家" + this.user + "升级");
		} else {
			System.out.println("请找代理");
		}

	}

	@Override
	public IGamePlayer getProxy() {
		gp = new GamePlayerProxy(this);
		return gp;
	}

	private boolean hasProxy() {
		return null != gp;
	}
}
