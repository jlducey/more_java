package tutorial7;

public class App {

	public static void main(String[] args) {
		int a = 3;
		int[] vals;
		vals = new int[3];
		vals[0] = 4;
		vals[1] = 7;
		vals[2] = 10;
		
		System.out.println(vals[0]);
		System.out.println(vals[1]);
		System.out.println(vals[2]);
		
		for(int i=0;i<vals.length;i++){
			System.out.println(vals[i]);
		}
		int[] nums = {1,2,4};
		
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}

}
