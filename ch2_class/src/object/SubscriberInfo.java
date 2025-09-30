package object;

public class SubscriberInfo {

    // 가입자 정보(이름, 아이디, 비번, 전화번호)
    // 기능 : 비밀번호 변경, 전화번호 변경)

    private String name;
    private String id;
    private String password;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public void changePhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SubscriberInfo [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
    }

    public String getId() {
        return id;
    }
}
