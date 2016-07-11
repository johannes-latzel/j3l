package j3l.util;


/**
 * <p></p>
 * 
 * @since JDK 1.8
 * @version 2016.07.11_0
 * @author Johannes B. Latzel
 */
public interface IClose<T extends Exception> extends AutoCloseable, IStateClosure {
	
	
	/**
	 * <p></p>
	 *
	 * @param
	 * @return
	 * @throws T
	 */
	void open() throws T;
	
	
	/**
	 * <p></p>
	 *
	 * @param
	 * @return
	 */
	@Override void close() throws T;
	
}
