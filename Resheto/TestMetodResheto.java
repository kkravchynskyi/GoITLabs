package module;

import java.util.Scanner;

public class TestMetodResheto {
	
	private static Scanner scan = new Scanner(System.in);
	static int arr[]; 
	private static final int MAX_VALUE = Integer.MAX_VALUE;
	
	static int inputCount(){
                // ���� �������� �� �������� ���� ������� �����
		System.out.println("Input count number integer type. Max value = " + MAX_VALUE);
		long i = scan.nextLong();
		if (i > MAX_VALUE )
		   inputCount();
		return (int) i;
	}
      
	// ����� ������� ����� � ������ �� � ������ 
	static void resheto(int count){
		arr = new int[count+1];		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
	        // ���������� �������. 0 - �� ������� �����, 1 - ����� ���� ��������. ����� - ������ �������. �������� ������ �� ������ �����,
                // �.�. ��� ������ - �� �������
		for(int i=3; i < count +1; i+=2){
			arr[i] = 1;
			arr[i+1] = 0;
		}	
		int c =0;  // ������� ��������
		// � ����� ���� � ����� 2  - �� ��������, � �������� �� �������� i		
		for(long i=3; i*i < count+1; i+=2 ){
			
			if (arr[(int)i] != 0){

				for (long j=i*i; j < count; j= j +(i)*2){ 
					
					 arr[(int)j] = 0;
					 c++;						 
				}	
				c++;        
			}
		}
		System.out.println();
		System.out.println("  iteration is =  " + c );
	}
	
        //  ����� ����� �� �������
	static void printPrimeNumber(){
		System.out.println("Prime number : ");
		for(int i=2; i < arr.length; i++){
			if (arr[i] != 0)
			    System.out.print(i + ", ");
		}
			
	}

	public static void main(String[] args) {
		resheto(inputCount());
		printPrimeNumber();
	}

}
