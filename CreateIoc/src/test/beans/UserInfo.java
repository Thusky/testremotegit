/**
 * 
 */
package test.beans;

/**
 * 
 * @author <a href="mailto:wangxuhui@ssreader.cn">wangxuhui</a>
 * @version 2014-3-5
 */
public class UserInfo implements IUserInfo {

	int id;

	String name;

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
