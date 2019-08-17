package capsulation;

public class game {
	private int code;
	private String name;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		game obj=new game();
		obj.setCode(1234);
		obj.setName("hockey");
		System.out.println(obj.getCode());
		System.out.println(obj.getName());

	}

}
