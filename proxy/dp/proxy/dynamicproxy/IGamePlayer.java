/**   
 * @Description: 游戏玩家接口
 * @author wby  
 * @date 2016年8月9日 下午2:25:44 
 * @version V1.0   
 */
package dp.proxy.dynamicproxy;

public interface IGamePlayer {

	public void login(String user, String pwd);

	public void killBoss();

	public void upgrade();

}
