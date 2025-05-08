package practice.ObjectArray;

public class Member {

    private int num;
    private String name;
    private String phone;

    public Member() {}

    public Member(int num, String name, String phone) {
        this.num = num;
        this.name = name;
        this.phone = phone;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public String getInformation() {
        return "Member{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
