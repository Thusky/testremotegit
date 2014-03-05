/**
 * 
 */
package test.exceptions;

/**
 * 
 * @author <a href="mailto:wangxuhui@ssreader.cn">wangxuhui</a>
 * @version 2014-3-5
 */
public class BeanNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BeanNotFoundException() {

	}

	public BeanNotFoundException(String message) {
		super(message);
	}

	public BeanNotFoundException(Throwable cause) {
		super(cause);
	}

	public BeanNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
