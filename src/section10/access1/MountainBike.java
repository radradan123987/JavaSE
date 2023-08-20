package section10.access1;

public class MountainBike extends Bicycle {
	
	public boolean isSuspension;
	
	@Override
	public void getInfo() {
		super.getInfo();  //부모 getINfo() 호출
		System.out.println("isSuspension: " + isSuspension);
	}

}
