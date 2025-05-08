package practice.ObjectArray;

public class MemberRegister {

    public void registMember(Member[] members) {
        System.out.println("===== 회원 등록 시작 =====");

        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i]);
        }

        if(MemberRepository.store(members)) {
            System.out.println("총 " + members.length + "명의 회원 등록에 성공했습니다.");
        }

    }

}