package org.fuys.ownutil.util;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MathUtils
 * @author ys
 *
 */
public class MathUtils {
	
	private static Logger logger = LoggerFactory.getLogger(MathUtils.class);
	
	/**
	 * If number is even , return true.
	 * @param num
	 * @return
	 */
	public static boolean isEven(int num){
		return num%2==0;
	}
	
	/**
	 * If number is odd , return true.
	 * @param num
	 * @return
	 */
	public static boolean isOdd(int num){
		return !isEven(num);
	}
	
	/**
	 * If number is prime , return true
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num){
		if(num <= 1){
			return false;
		}
		double maxFactor = Math.sqrt(num);
		for(int x=2;x<=maxFactor;x++){
			if(maxFactor%x==0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * If number is composite , return true
	 * @param num
	 * @return
	 */
	public static boolean isComposite(int num){
		if(num<=1){
			return false;
		}
		return !isPrime(num);
	}
	
	/**
	 * If number is Narcissistic , return true
	 * @param num
	 * @return
	 */
	public static boolean isNarcissisticNumber(BigInteger num){
		try {
			if(num.compareTo(new BigInteger("2"))<=0){
				return false;
			}
			int length = String.valueOf(num).length();
			BigInteger sum = new BigInteger("0");
			BigInteger ten = new BigInteger("10");
			BigInteger temp = num;
			for(int x=length;x>=1;x--){
				BigInteger position = temp.divide(ten.pow(x-1));
				temp = temp.mod(ten.pow(x-1));
				sum = sum.add(position.pow(length));
			}
			if(num.compareTo(sum)==0){
				return true;
			}
		} catch (Exception e) {
			logger.error("Calculate narcissistic number Exception-->", e);
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isNarcissisticNumber(new BigInteger("188451485447897896036875")));
	}
	
}
