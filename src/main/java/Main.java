package main;

import java.util.Scanner;

/**
 * 範例主程式
 */
public class Main {

    public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
        int e1, e2, e3;
		
		System.out.println("請輸入三角形邊長1:");
		e1 = keyboard.nextInt();
		System.out.println("請輸入三角形邊長2:");
		e2 = keyboard.nextInt();
		System.out.println("請輸入三角形邊長3:");
		e3 = keyboard.nextInt();
		
		Main tester = new Main();
		Triangle t = new Triangle(e1, e2, e3);
		int isVaild = tester.checkTriangle(t);
		if(isVaild == 1) System.out.println("True");
		else if(isVaild == 0) System.out.println("False");
    }

    /**
     * 接收一個三角形物件
     * 如果三角形合法回傳 1, 不合法則回傳 0
     */
    public int checkTriangle(Triangle t){
		int e1 = t.getEdge1();
		int e2 = t.getEdge2();
		int e3 = t.getEdge3();
		
		if((e1 + e2 > e3) && (e1 + e3 > e2) && (e2 + e3 > e1)) return 1;
		else return 0;
	}
}
