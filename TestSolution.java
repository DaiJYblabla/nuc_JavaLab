package task1;

import java.util.Scanner;

public class TestSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		while(true){
		System.out.println("������һ����������");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.print("��"+n+"��쳲�������Ϊ:");
		System.out.println(s.fibonacci(n));
        
        
		
		}
	}

}
