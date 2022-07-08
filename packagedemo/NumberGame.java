package numbers.game;

public class NumberGame{
	
	//2,3,
	public boolean checkPrime(int num){
		for(int i=2; i< num/2; i++){
			if(num % i ==0){
				return false;
			}
		}
		return true;
	}
	
	public boolean isEven(int num){
		if(num %2 ==0){
			return true;
		}
		return false;
	}
	
	public int maxNumber(int ... num){
		int max = -1;
		for(int temp : num){
			if(max < temp){
				max = temp;
			}
		}
		return max;
	}
	
		public int minNumber(int ... num){
		int min = 999999;
		for(int temp : num){
			if(min > temp){
				min = temp;
			}
		}
		return min;
	}
	
}