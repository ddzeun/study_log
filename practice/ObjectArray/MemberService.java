package practice.ObjectArray;

import java.util.Scanner;

public class MemberService {

    Scanner sc = new Scanner(System.in);


    public void joinMember() {

        Member[] members = new Member[5];
        for (int i = 0; i < members.length; i++) {
            members[i] = new Member();
            members[i].setNum(i);
            System.out.println("===== 가입 정보 입력 =====");

            System.out.print("이름: ");
            members[i].setName(sc.next());

            System.out.print("번호: ");
            members[i].setPhone(sc.next());
        }

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.registMember(members);
    }

    public void searchAllMembers() {
        MemberFinder memberFinder = new MemberFinder();
        System.out.println("===== 가입된 회원 목록 =====");
        for(Member member: memberFinder.showAllMembers()) {
            if(member != null) {
                System.out.println(member.getInformation());
            }
        }
    }

}
