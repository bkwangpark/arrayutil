package ArrayUtils;

public class ArrayUtils {
	// int 배열을 double 배열로 변환
	public static double [] intToDouble( int[] source ) {
		int length=source.length;
		double[] doubleArray=new double[length];
		for(int i=0; i<length; i++){
			doubleArray[i]=source[i];
		}
		return doubleArray;
	}
	
	// double 배열을 int 배열로 변환
	public static int [] doubleToInt( double[] source ) {
		int length=source.length;
		int[] intArray=new int[length];
		for(int i=0; i<length; i++){
			intArray[i]=(int) source[i];
		}
		return intArray;
	}
	
	// int 배열 두 개를 연결한 새로운 배열 리턴
	public static int [] concat( int[] s1, int[] s2 ) {
		int length=s1.length+s2.length;
		int[] SumArray=new int[length];
		for(int i=0; i<s1.length; i++){
			SumArray[i]=s1[i];
		}
		for(int j=length-s1.length; j<length; j++){
			SumArray[j]=s2[j-s1.length];
		}
		return SumArray;
	}

}
