package exam06;

import java.util.ArrayList;
import java.util.List;

public class CarMaker implements Car {

	private String carName;
	private List<String> carList;

	public CarMaker(List<String> carList) {
		this.carList = carList;
	}


	@Override
	public void move() {
		System.out.println(carName + "가 움직입니다.");

	}

	@Override
	public void stop() {
		System.out.println(carName + "가 정지합니다.");

	}

	@Override
	public void printName() {
		System.out.println(carName);

	}

	@Override
	public void choiceCar(String carName) {
		try {
			int index = carList.indexOf(carName);
			if (index == -1) {
				System.out.println("선택하신 차가 없습니다");
			}
			this.carName = carList.get(index);
		} catch (Exception e) {
			System.out.println("오류남");
		}

	}

	@Override
	public boolean checkCarName() {
		if (carName == null) {
			return false;
		}
		return true;
	}

}
