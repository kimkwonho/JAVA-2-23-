package sec02.exam03;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation)
	{
		super(location,maxRotation);
	}
	
	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation)
		{
			System.out.println(location + "KumhoTire ����: "+(maxRotation-accumlatedRotation)+"ȸ");
			return true;
		}
		else
		{
			System.out.println("*** "+location+" KumhoTire ��ũ ***");
			return false;
		}
	

}
}
