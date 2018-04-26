package org.fuys.ownutil.juc;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.fuys.ownutil.util.DateUtils;

public class TimeUnitInstance {

	public static void main(String[] args) throws InterruptedException {
		// 使用Thread类实现休眠2秒
		Thread.sleep(2 * 1000);
		// 使用TimeUnit类实现休眠2秒
		TimeUnit.SECONDS.sleep(2);

		// 时间单位转换
		System.out.println(TimeUnit.SECONDS.convert(120000000, TimeUnit.MICROSECONDS));

		// 三天后处理操作
		long time = TimeUnit.MILLISECONDS.convert(3, TimeUnit.DAYS);
		time += System.currentTimeMillis();
		Date threeDays = new Date(time);
		System.out.println("Three days later by using TimeUnit -->" + threeDays);
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("Three days later by using Calendar -->" + calendar.getTime());
		
		System.out.println(DateUtils.addDays(new Date(), -3));
	}

}
