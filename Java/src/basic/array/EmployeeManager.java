package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;

		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("====================================");

			System.out.print("> ");
			int menu = sc.nextInt();
			int view = 0;
			
			if(menu == 1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
				while(true) {
					System.out.print("사번입력 > ");
					String userNum = sc.next();

					boolean flag = false;
					for(int j=0; j<userNums.length; j++) {
						if(userNum.equals(userNums[j])) {
							System.out.println("중복된 사번입니다.");
							flag = true;
							break;
						}
					} // 중복찾기 for end
					if(!flag) {
						int i;
						for(i=0; i<userNums.length; i++) {
							if(userNums[i] == null) {
								userNums[i] = userNum;
								break;
							}						
						} // 빈자리찾기 for end

						System.out.print("이름입력 > ");
						names[i] = sc.next();
						System.out.print("나이입력 > ");
						ages[i] = sc.nextInt();
						System.out.print("부서입력 > ");
						departments[i] = sc.next();
						count++;
						break;
					}
				}
			} else if(menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				if(count>0) {
					for(view =0; view < userNums.length ; view++) {
						if(userNums[view]==null) {//null이면 나감 빈공간 null출력 안하겠다!
							break;
						}
						else {
							System.out.printf("%s %s %d %s\n",userNums[view],names[view],ages[view],departments[view]);
							System.out.println("=====================================");
						}

					}
				}
				else {
					System.out.println("등록된 사원 정보가 없습니다.");
				}

			} else if(menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.print("조회할 사원의 사번입력 > ");
				String userNum = sc.next();
				
				boolean flag = false;
				for(int i=0; i<userNums.length; i++) {
					if(userNum.equals(userNums[i])) {
						System.out.println("사번: " + userNums[i]);
						System.out.println("이름: " + names[i]);
						System.out.println("나이: " + ages[i]);
						System.out.println("부서: " + departments[i]);
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
				}

			} else if(menu == 4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.	
				System.out.print("변경할 사원의 사번입력 > ");
                String userNum = sc.next();
                for(int i =0; i < userNums.length; i++) {
                    int c=0;
                    if(userNum.equals(userNums[i])) {
                        System.out.printf("사번: %s 이름: %s 나이: %d 부서: %s\n",userNums[i],names[i],ages[i],departments[i]);
                        c++;
                        System.out.println("1. 나이변경  2. 부서변경  3.취소");
                        int choose = sc.nextInt();
                        if(choose == 1) {
                            System.out.print("나이입력 > ");
                            int age = sc.nextInt();
                            ages[i]=age;
                            break;
                        } else if(choose == 2) {
                            System.out.print("부서입력 > ");
                            String department = sc.next();
                            departments[i]=department;
                            break;
                        } else if(choose == 3) {
                            System.out.println("메인으로 돌아갑니다.");
                            break;
                        } else {
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                    if(c == userNums.length)
                        System.out.println("등록되지않은 사번입니다.");
                }
				
			} else if(menu == 5) {
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.print("삭제할 사원의 사번입력 > ");
				String userNum = sc.next();
				
				boolean flag = false;
				int i;
				for(i=0; i<userNums.length; i++) {
					if(userNum.equals(userNums[i])) {
						System.out.println("정말 삭제하시겠습니까? [Y/N]");
						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("해당되는 사원의 정보가 없습니다.");
				} else {
					String yesOrNo = sc.next();
					switch(yesOrNo) {
					case "N": case "n":
						System.out.println("아니요를 선택하셨습니다.");
						break;
					case "Y": case "y":
						for(int j=i; j<userNums.length-1; j++) {
							userNums[j] = userNums[j + 1];
							names[j] = names[j + 1];
							ages[j] = ages[j + 1];
							departments[j] = departments[j + 1];
						}
						count--;
						break;
					default :
						System.out.println("잘못된 입력입니다.");
					} // switch end
				} // else end

			} else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");

			} // switch end


		} // end while true


	} // end main

}
