package org.fuys.ownutil.instance;

class MyException {

	public static int div(int x, int y) throws Exception {
		int result = 0;
		System.out.println("1,begin to div");
		try {
			result = x / y;
		} catch (Exception e) {
			throw e;
		}finally {
			System.out.println("2,end to div");
		}
		return result;
	}

}

public class ExceptionInstance {
	public static void main(String[] args) {
		int result = 0;
		try {
			result = MyException.div(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assert result == 10:"Result is not 10";
	}
}
