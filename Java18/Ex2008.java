package day20;

interface Worker {
	int getSalary();   // 인터페이스니까 -> 추상메서드 "무조건 public abstract"
}

class Regular implements Worker {
	int salary;
	
	Regular(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int getSalary() {
		return salary;
	}
}

class Irregular implements Worker {
	int hours;   // 시간
	int wage; 	 // 시급
	
	Irregular(int hours, int wage) {
		this.hours = hours;
		this.wage = wage;
	}

	@Override
	public int getSalary() {
		return hours * wage;
	}
}
// 인터페이스도 다형성(부-자의 상황)에서 부의 역할을 할 수 있다.
public class Ex2008 {
	public static void main(String[] args) {
		Worker a = new Regular(3_000_000);
		Worker b = new Irregular(160, 11000);   // 160시간, 11,000원
		System.out.println(a.getSalary());
		System.out.println(b.getSalary());
		
	}
}














