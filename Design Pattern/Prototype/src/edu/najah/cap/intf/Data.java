package edu.najah.cap.intf;

public class Data implements Cloneable	{
	private String firtName;
	private String secondName;
	
	public Data(String firtName, String secondName){
		this.setFirtName(firtName);
		this.setSecondName(secondName);
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
		
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	

}
