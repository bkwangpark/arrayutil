package ArrayUtils;
public class ArrayUtilsTestApp {
	public static void main(String[] args) {
		//1번
		int[] intArray={10,20,30,40,50};
		
		double[] doubleArray=ArrayUtils.intToDouble(intArray);
		
		int length=doubleArray.length;
		for(int i=0; i<length; i++){
			System.out.println(doubleArray[i]);
		}
		//2번
		double[] doubleArray1={10.1, 20.2, 30.3, 40.4, 50.5};
		
		int[] intArray1=ArrayUtils.doubleToInt(doubleArray1);
		
		int length1=intArray1.length;
		for(int i=0; i<length1; i++){
			System.out.println(intArray1[i]);
		}
		//3번
		int[] s1={1,2,3,4,5};
		int[] s2={6,7,8,9,10};
		
		int[] s3=ArrayUtils.concat(s1, s2);
		int length2=s3.length;
		for(int i=0; i<length2; i++){
			System.out.print(s3[i]+" ");
		}
	}
}
