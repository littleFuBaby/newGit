package org.fuys.ownutil.instance;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleInstance {
	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("Message");
		String str = rb.getString("Own.Welcome");
		System.out.println(MessageFormat.format(str, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").
				format(new Date()), "Andy"));
		rb = ResourceBundle.getBundle("Message",Locale.US);
		str = rb.getString("Own.Welcome");
		System.out.println(MessageFormat.format(str, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").
				format(new Date()), "Andy"));
	}

}
