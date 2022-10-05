package git_1;
import java.util.*;

//������ѧ�ӿ�
interface ISignUp {
	// ��ӡ������
	public void print();

	// ����Ƿ��� stuType��Ӧ�İ༶����
	// ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
	public boolean addStudent(int stuType);

	// ��������������Ĳ�������ʽ�������ĵ�����
	public static IParams parse() throws Exception {
		return null;
	};
}

interface IParams {
	// ��ȡ�������
	public int getBig();

	// ��ȡ�а�����
	public int getMedium();

	// ��ȡС������
	public int getSmall();

	// ��ȡ��ѧ���У����� [1 2 2 3] ��ʾ���α�����ѧһ����ࡢ�аࡢ�аࡢС��ѧ��
	public ArrayList<Integer> getPlanSignUp();
}

public class SchoolSystem implements ISignUp, IParams {
	static Integer big;
	static Integer medium;
	static Integer small;

	// ��ʼ�����꼶����
	SchoolSystem(Integer big, Integer medium, Integer small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}

	// ����Ƿ��� stuType��Ӧ�İ༶����
	// ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
	public boolean addStudent(int stuType) {
		if (stuType != 0) {
			return true;
		}
		// ����Ƿ��� stuType��Ӧ�İ༶����
		// ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
		else
			return false;
	}

	// ��ӡ������
	public void print() {
		// System.out.print(addStudent(stuType));
	}

	// ��������������Ĳ�������ʽ�������ĵ�����
	public static IParams parse() throws Exception {

		try {
			IParams params = ISignUp.parse();
			SchoolSystem sc = new SchoolSystem(params.getBig(), params.getMedium(), params.getSmall());
		} catch (InputMismatchException e) {
			System.out.println("error!���������ʽ����!");
		}
		return null;
	}

	public int getBig() {
		return big;
	}

	public int getMedium() {
		return medium;
	}

	public int getSmall() {
		return small;
	}

	// ��ȡ��ѧ���У����� [1 2 2 3] ��ʾ���α�����ѧһ����ࡢ�аࡢ�аࡢС��ѧ��
	public ArrayList<Integer> getPlanSignUp() {
		
		return null;
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.print("��ֱ�������꼶����������");
		IParams params = ISignUp.parse();// SchoolSystem.parse();
		SchoolSystem sc = new SchoolSystem(params.getBig(), params.getMedium(), params.getSmall());
		// ��ʼ�����꼶����
		ArrayList<Integer> plan = params.getPlanSignUp();
		for (int i = 0; i < plan.size(); i++) {
			sc.addStudent(plan.get(i));
		}
		sc.print();
		in.close();
	}

}