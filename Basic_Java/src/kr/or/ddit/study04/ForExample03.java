package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample03 obj = new ForExample03();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
	}
	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		
		for(int row =0; row<4; row++) {
			for(int space =0; space<4-row-1; space++) {
				System.out.print(" ");
			}
			for(int star=0; star<row+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		for(int row =0; row<4; row++) {
            for(int space1=0; space1<row; space1++) {
               System.out.print(" ");
            }
            for (int star1=0; star1<4-row; star1++) {
               System.out.print("*");
            }
            System.out.println();
        }
	}
        
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 }
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
	}
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
	}
	
}
