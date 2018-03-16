package org.fuys.ownutil.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * common date utility
 * @author ys
 *
 */
public class DateUtils {
	
	private static Logger logger = LoggerFactory.getLogger(DateUtils.class);
	
	/**
	 * Current time format of yyyy-MM-dd HH:mm:ss:SSS
	 * @return
	 */
	public static String getNowFormat(){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").
				format(Calendar.getInstance().getTime());
	}
	
	/**
	 * Current time format which is given
	 * @param format
	 * @return
	 */
	public static String getNowFormat(String format){
		String nowFormat = null;
		try {
			nowFormat = new SimpleDateFormat(format).
					format(Calendar.getInstance().getTime());
		} catch (Exception e) {
			logger.error("Date Format Exception --> ", e);
		}
		return nowFormat;
	}
	
	public static void main(String[] args) {
		System.out.println(DateUtils.getNowFormat());
		System.out.println(DateUtils.getNowFormat(null));
	}

}
