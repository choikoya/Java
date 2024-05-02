package javacode;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in); 
		
			
		String nation = "kor"; //소문자면 출력안됨 값이 정확하지않아서. 소문자도 되게하려면 nation.equals ignore 써줘야함
		
		switch(nation) { //안에 들어갈수있는 데이터타입:byte, short, int, char, string
		case "KOR": //break가 없으면 계속 흐름
		case "JPN":
		case "CHN":
			System.out.println("아시아");
			break; //걸리면 밖으로 튀어나감
			
		case "GBR":
		case "FRA":
		case "EUA":
			System.out.println("유럽");
			break;
			
		case "USA":
		case "CAN":
		case "MEX":
			System.out.println("아메리카");
			break;
			
			
		}

	}

}
