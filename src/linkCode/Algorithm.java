package linkCode;



public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algorithm algorithm=new Algorithm();
		
//		System.out.println(algorithm.aplusb(3, 5));
		System.out.println(algorithm.trailingZeros(5555550000000l));

        System.out.println("修改测试");
	}

    /**
     * β������
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     * 
     * 1*2*3*...*n
     * n! ����������������м���2*5��β�����м���0
     * ��Ϊ��������2�ĸ���Ҫ��5�࣬
     * �������������м���5��β�����м���0
     * 
     * 5 10 15 ...�ܹ���һ��������5
     * 25 50 75...���ϲ�����ϣ����ٹ���һ��5
     * 125...���ϲ�����ϣ����ٹ���һ��5
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
	 * ��λ�����ͼӲ����ֿ�����λΪ0ʱ����
	 * ��λ������ͬΪ1ʱ��1-----�루&��������������һλ
	 * �Ӳ��������
	*/
	int aplusb(int a, int b) {
	    // a��λ��b��
        while(a!=0) {
            int temp=(a&b)<<1;
            b=a^b;
            a=temp;
        }
		return b;
	}

}
