package linkCode;

public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithm algorithm=new Algorithm();
		System.out.println(algorithm.aplusb(3, 5));
	}

	/*
	 * @param a: An integer
	 * @param b: An integer
	 * @return: The sum of a and b
	 * 进位操作和加操作分开，进位为0时结束
	 * 进位操作：同为1时进1-----与（&）操作，再左移一位
	 * 加操作：异或
	*/
	int aplusb(int a, int b) {
	    // a进位，b加
        while(a!=0) {
            int temp=(a&b)<<1;
            b=a^b;
            a=temp;
        }
		return b;
	}

}
