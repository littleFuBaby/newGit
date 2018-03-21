package org.fuys.ownutil.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileUtil {

	public static final int BYTE = 0;

	public static final int KILOBYTE = 3;

	public static final int MEGEBYTE = 5;

	public static final int GIGABYTE = 7;

	/**
	 * file length
	 * @param filePath
	 * @param scale
	 * @param module
	 * @return
	 */
	public static BigDecimal length(String filePath, int scale, int module) {
		File file = new File(filePath);
		BigDecimal bg = null;
		if (file.exists() && file.isFile()) {
			bg = new BigDecimal(file.length());
			BigDecimal divisor = new BigDecimal(1024);
			switch (module) {
			case GIGABYTE:
				bg = bg.divide(divisor).divide(divisor).divide(divisor);
				break;
			case MEGEBYTE:
				bg = bg.divide(divisor).divide(divisor);
				break;
			case KILOBYTE:
				bg = bg.divide(divisor);
				break;
			case BYTE:
				break;
			default:
				break;
			}
			bg = bg.divide(new BigDecimal(1), scale, BigDecimal.ROUND_HALF_UP);
		}
		return bg;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(FileUtil.length("C:\\Users\\ys\\Desktop\\要结果,不要理由.pdf", 
				10, FileUtil.GIGABYTE));
		File file = new File("C:\\Users\\ys\\Desktop\\要结果,不要理由.pdf");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(file.lastModified()));
		
		
		// inputstream
		if(file.exists()){
			InputStream is = new FileInputStream(file);
			byte[] bytes = new byte[1024];
			int root = 0;
			int temp = 0;
			while((temp = is.read())!=-1 && root<1024){
				bytes[root++] = (byte) temp;
			}
			is.close();
			System.out.println(new String(bytes));
		}
		
		if(file.exists()){
			Reader r = new FileReader(file);
			char []chars = new char[100];
			int root =0;
			int temp =0;
			while((temp=r.read())!=-1 && root<100){
				chars[root++] = (char) temp;
			}
			r.close();
			System.out.println(new String(chars));
		}
		
		
		System.getProperties().list(System.out);
		
	}

}
