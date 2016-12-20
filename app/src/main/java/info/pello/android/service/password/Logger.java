package info.pello.android.service.password;

import android.util.Log;

/**
 * Singleton class to log messages.
 * @author Pello Xabier Altadill Izura
 * @greetz my greetz as the constructor, are private
 */
public class Logger {
	private static Logger logger = null;
	private static long counter = 0; 
	
	/**
	 * Logger private constructor
	 */
	private Logger () {}
	
	/**
	 * getInstance
	 * @return unique instance of Logger 
	 */
	public static Logger getInstance () {
		if (null == logger) {
			logger = new Logger();
		} 	
		return logger;
	}
	
	/**
	 * Logs messages using android's log facilities
	 * @param msg
	 */
	public void log(String msg) {
		Log.d("PELLODEBUG","PassService ["+(counter++)+"]> " + msg);
	}
}
