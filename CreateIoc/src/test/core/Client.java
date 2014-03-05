/**
 * 
 */
package test.core;

import test.beans.IUserInfo;

/**
 * 
 * @author <a href="mailto:wangxuhui@ssreader.cn">wangxuhui</a>
 * @version 2014-3-5
 */
public class Client {

	public static void main(String[] args) {
		IUserInfo u = (IUserInfo) BeanFactory.getBean("test.beans.UserInfo");
		System.out.println(u.getId());
	}
}
