/**
 * 
 */
package test.core;

import test.exceptions.BeanNotFoundException;

/**
 * 
 * @author <a href="mailto:wangxuhui@ssreader.cn">wangxuhui</a>
 * @version 2014-3-5
 */
public class BeanFactory {

	public static Object getBean(String beanName) {
		Class<?> clazz = null;
		Object o = null;
		try {
			clazz = Class.forName(beanName);
			o = clazz.newInstance();
		}
		catch (ClassNotFoundException e1) {
			BeanNotFoundException e = new BeanNotFoundException(beanName + " not found", e1);
			throw e;
		}
		catch (InstantiationException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return o;
	}
}
