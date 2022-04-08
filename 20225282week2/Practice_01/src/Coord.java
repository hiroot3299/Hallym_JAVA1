
public class Coord {
	private int pos_x;
	private int pos_y;
	
	public Coord(int pos_x, int pos_y)	{ //이 메소드이름 대문자인 이유
		super();							//생성자 메소드여서 그럼
		this.pos_x = pos_x;					//특정역할을하는 메소드
		this.pos_y = pos_y;					//클래스 이름과 동일해야함 나중에 배움
		
	}
	
	public int getPos_x() {
		return pos_x;
	}
	
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
}
