package com.kh.control.chap01;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9:
			System.out.println("종료 메뉴입니다.");
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		n = sc.nextInt();
		if(n>=0) {
		if(n%2 == 0) {
			System.out.println("짝수다.");
		}
		else {
			System.out.println("홀수다.");
		}
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		Scanner sc =new Scanner(System.in);
		int kor = 0;
		int math = 0;
		int eng = 0;
		int sum = 0;
		double avg = 0.0;
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		math = sc.nextInt();

		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		sum = kor + math + eng;
		avg = sum/3;
		
		if(avg >= 60 && (kor >= 40 && math >= 40 && eng >= 40)) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		
		System.out.print("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.printf("%d월은 봄입니다.", month);
			break;
		case 6:
		case 7:
		case 8:
			System.out.printf("%d월은 여름입니다.", month);
			break;
		case 9:
		case 10:
		case 11:
			System.out.printf("%d월은 가을입니다.", month);
			break;
		case 12:
		case 1:
		case 2:
			System.out.printf("%d월은 겨울입니다.", month);
			break;
		default:
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		String id = "";
		int pass = 0;
		
		String myId = "노경";
		int myPass = 1234;
		
		
		System.out.print("아이디 : ");
		id = sc.nextLine();
		System.out.print("비밀번호 : ");
		pass = sc.nextInt();
		
		if(myId.equals(id) && myPass == pass) {
			System.out.println("로그인 성공");
		}
		else if(!myId.equals(id) && myPass == pass) {
			System.out.println("아이디가 틀렸습니다.");
		}
		else if(myId.equals(id) && myPass != pass) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else {
			System.out.println("걍 다 틀림");
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String member = null;
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		member = sc.nextLine();
		
		switch(member) {
		case "관리자":
			System.out.print("회원관리, 게시글 관리" +"\n" +"게시글 작성, 댓글 작성" +"\n" + "게시글 조회");
			break;
		
		case "회원":
			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		
		case "비회원":
			System.out.print("게시글 조회");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}
	}
	public void practice7() {
		Scanner sc= new Scanner(System.in);
		double bmi = 0.0;
		double hei = 0.0;
		double kg = 0.0;
		
		System.out.print("키(m)를 입력해 주세요 : ");
		hei = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		kg = sc.nextDouble();
		
		bmi = kg/(hei*hei);

		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}
		else if(bmi>=23 && bmi <25) {
			System.out.println("과체중");
		}
		else if(bmi>=25 && bmi <30) {
			System.out.println("비만");
		}
		else {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		Scanner sc= new Scanner(System.in);
		int a = 0;
		int b = 0;
		char ch = 0;
		int sum = 0;
		
		System.out.print("피연산자1 입력 : ");
		a = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+, -, *, /, %) : ");
		ch = sc.nextLine().charAt(0);
		
		switch(ch) {
		case '+':
			sum=a+b;
			break;
		case '-':
			sum=a-b;
			break;
		case '*':
			sum=a*b;
			break;
		case '/':
			sum=a/b;
			break;
		case '%':
			sum=a%b;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.프로그램을 종료합니다.");
			return;
		}
		
		System.out.printf("%d %c %d = %d",a,ch,b,sum);
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		double mid = 0;
		double fin = 0;
		double hom = 0;
		int att = 0;
		double attSum = 0.0;
		double sum = 0;
		
		System.out.print("중간 고사 점수 : ");
		mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		hom = sc.nextInt();
		System.out.print("출석 회수 : ");
		att = sc.nextInt();
		
		mid = mid*0.2;
		fin = fin*0.3;
		hom = hom*0.3;
		attSum = (att*5)*0.2;
		
		sum = mid + fin + hom + att;
		
		System.out.println("===========결과===========");
		if(sum >= 70 && att >= 14) {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mid);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fin);
			System.out.printf("과제 점수(30) : %.1f\n", hom);
			System.out.printf("출석 고사 점수(20) : %.1f\n", attSum);
			System.out.printf("총점 : %.1f\n", sum);
			System.out.println("PASS");
		}
		else {
			if(sum < 70 && att>=14) {
				System.out.printf("FAIL [점수 미달] (총점 %.1f)\n", sum);
			}
			else if(att < 14 && sum>=70) {
				System.out.printf("FAIL [출석 횟수 부족] (%d/20)\n", att);
			}
			else {
				System.out.printf("FAIL [출석 횟수 부족] (%d/20)\n", att);
				System.out.printf("FAIL [점수 미달] (총점 %.1f)\n", sum);
			}
		}
		
		
	}
	public void practice10 () {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택 : ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
		
	}
}
