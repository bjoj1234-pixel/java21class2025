package hashMapEx;

public class Location {
	private String city;
	private int latitude;
	private int longitude;
	

	public Location() {};
	
	public Location(String city,int latitude,int longitude) {
		this.city=city;
		this.latitude=latitude;
		this.longitude=longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	};
	
	// 자바 최상위 클래스 Object이다.
	// Object -> toString()메소드 디폴트 => String 데이터 타입으로 출력할때 사용
	// 현재 메소드의 최상클래스 확인하는 방법 : ctrl + T
	// Object껄 쓰려면 반드시 override를 써야한다.(재정의 해야함)
	
	@Override
	public String toString() {
		return city + " " + latitude + " " + longitude;		
	} 
	
}
