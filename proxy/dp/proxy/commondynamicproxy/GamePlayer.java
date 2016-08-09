/**   
 * @Description: 真实游戏玩家
 * @author wby  
 * @date 2016年8月9日 下午2:27:19 
 * @version V1.0   
 */
package dp.proxy.commondynamicproxy;

public class GamePlayer implements IGamePlayer {
	private String user;

	public GamePlayer(String user) {
		this.user = user;
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
