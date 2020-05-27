package p315;

import p314.Tire;

public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public Boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire ����"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire ��ũ***");
			return false;
		}
	}

}
