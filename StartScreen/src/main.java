import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("프로젝트 명: My Awesome Project");
        System.out.println("1. 시작");
        System.out.println("2. 설명");

        System.out.print("선택하세요 (1 또는 2): ");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("프로젝트를 시작합니다!");
            // 여기에 시작하는 로직을 추가하세요.
        } else if (userChoice == 2) {
            System.out.println("프로젝트 설명을 확인합니다.");
            // 여기에 설명을 보여주는 로직을 추가하세요.
        } else {
            System.out.println("잘못된 선택입니다. 1 또는 2를 입력하세요.");
        }
    }
}