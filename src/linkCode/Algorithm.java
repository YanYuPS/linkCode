package linkCode;



public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithm algorithm=new Algorithm();
		
//		System.out.println(algorithm.aplusb(3, 5));
		System.out.println(algorithm.trailingZeros(5555550000000l));
		
		
	}

    /**
     * 尾部的零
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     * 
     * 1*2*3*...*n
     * n! 这个数的质因子中有几对2*5，尾部就有几个0
     * 因为质因子中2的个数要比5多，
     * 所以质因子中有几个5，尾部就有几个0
     * 
     * 5 10 15 ...能贡献一个质因子5
     * 25 50 75...在上层基础上，能再贡献一个5
     * 125...在上层基础上，能再贡献一个5
     */
    public long trailingZeros(long n) {
        long result=0;
        long five=5;
        while(n>=five) {
            result+=n/five;
            five*=5;
        }
        return result;
    }
    long trailingZerosl(long n) {
    	long count=0;
        while(n/5>0){
        	count+=n/5;
        	n=n/5;
        }
        return count;
    }
	/**
	 * A+B
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
