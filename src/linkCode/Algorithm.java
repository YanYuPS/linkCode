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
