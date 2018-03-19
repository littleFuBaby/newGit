package org.fuys.ownutil.util;

import org.junit.Test;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

public class TestDateUtil {
	
	@Test
	public void testGetNow() {
		LoggerFactory.getLogger(TestDateUtil.class).info("Test org.fuys.ownutil.util.DateUtils.getNow()");
		TestCase.assertTrue(DateUtils.getNowFormat()!=null);
	}

}
