package org.fuys.ownutil.util;

/**
 * String utility
 * @author ys
 *
 */
public class StringUtils {
	
	/**
	 * If string is number , return true
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str){
		if(str==null ||str.length()==0){
			return false;
		}
		char[] numberChars = str.toCharArray();
		for(int x=0;x<numberChars.length;x++){
			if(numberChars[x]<'0' || numberChars[x]>'9'){
				return false;
			}
		}
		return true;
	}

}
