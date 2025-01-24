package day12.class_review;

class Member {
    private String name;
    private String id;
    private String password;
    private int age;

/*
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
*/

    public Member(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}

class MemberService {

    public static boolean login(Member member) {
        if (member.getId() == "hong" && member.getPassword() == "12345") {
            return true;
        } else {
            return false;
        }
    }

    public static void logout(Member member) {
        System.out.println(member.getId() + " 님 로그아웃 되었습니다.");
    }
}

public class MemberMain {
    public static void main(String[] args) {
        Member user1 = new Member("hong", "12345");
        MemberService ms = new MemberService();
        boolean result = ms.login(user1);

        if (result) {
            System.out.println("로그인 되었습니다.");
            ms.logout(user1);
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
