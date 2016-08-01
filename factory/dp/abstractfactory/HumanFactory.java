/**   
 * @Description: 抽象工程
 * @author wby  
 * @date 2016年8月1日 下午5:46:31 
 * @version V1.0   
 */
package dp.abstractfactory;

public interface HumanFactory {
	// 制造一个黄种人种
	public Human createYellowHuman();

	// 制造一个白色人种
	public Human createWhiteHuman();

	// 制造一个黑色人种
	public Human createBlackHuman();

}
