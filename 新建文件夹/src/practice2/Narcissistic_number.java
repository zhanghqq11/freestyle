package practice2;
public class Narcissistic_number {
	public static void main(String[] args) {
			int Hundred_num;
			int Ten_num;
			int Unit_num;
			for(int number1231=100;number1231<1000;number1231++) {
				Hundred_num=number1231/100;
				Ten_num=(number1231/10)%10;
				Unit_num=number1231%10;
				if (number1231==Hundred_num*Hundred_num*Hundred_num+Ten_num*Ten_num*Ten_num+Unit_num*Unit_num*Unit_num) {
					System.out.println(number1231);
				}
		}
	}
}
