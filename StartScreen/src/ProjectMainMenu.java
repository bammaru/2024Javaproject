import java.util.Scanner;

public class ProjectMainMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("메인메뉴");
		
		System.out.println("1. 단어게임");
        System.out.println("2. 가챠");
        System.out.println("3. 도감");
        System.out.println("4. 통계");

        System.out.print("선택하세요 (1, 2, 3, 4): ");

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("단어게임을 시작합니다!");
            System.out.println("========================================");
            	WordQuiz.main(null);
        } 
        else if (userChoice == 2) {
            System.out.println("가챠화면으로 넘어갑니다.");
            System.out.println("========================================");
            	Gacha.main(null);
        } 
        else if (userChoice == 3) {
            System.out.println("도감화면을 엽니다.");
            System.out.println("========================================");
        	Itembook.main(null);
        }
        else if (userChoice == 4) {
            System.out.println("통계를 확인합니다.");
            System.out.println("========================================");
            	Stats.main(null);
        }
        
        else {
            System.out.println("잘못된 선택입니다. 1 또는 2를 입력하세요.");
        }
	
	}
}
