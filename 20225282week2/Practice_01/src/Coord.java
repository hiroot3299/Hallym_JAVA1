
public class Coord {
	private int pos_x;
	private int pos_y;
	
	public Coord(int pos_x, int pos_y)	{ //�� �޼ҵ��̸� �빮���� ����
		super();							//������ �޼ҵ忩�� �׷�
		this.pos_x = pos_x;					//Ư���������ϴ� �޼ҵ�
		this.pos_y = pos_y;					//Ŭ���� �̸��� �����ؾ��� ���߿� ���
		
	}
	
	public int getPos_x() {
		return pos_x;
	}
	
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
}
