package org.fuys.ownutil.instance;

class CompareObject{
	private String info;
	private int count;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public CompareObject(String info,int count){
		this.info = info;
		this.count = count;
	}
	public boolean equals(Object obj){
		//1,null
		if(obj == null){
			return false;
		}
		// 2,address
		if(this == obj){
			return true;
		}
		// 3,class
		if((obj instanceof CompareObject)==false){
			return false;
		}
		// 4,obj
		CompareObject comObj = (CompareObject)obj;
		if(this.info.equals(comObj.getInfo())
				&&this.count == comObj.getCount()){
			return true;
		}
		return false;
	}
}


public class CompareObjectInstance {
	public static void main(String[] args) {
		
	}
}
