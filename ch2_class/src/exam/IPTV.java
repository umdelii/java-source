package exam;

public class IPTV extends ColorTv {

    private String ip;

    public IPTV(int size, int color, String ip) {
        super(size, color);
        this.ip = ip;
    }

    // void printProperty() {
    // System.out.println("나의 IPTV는 " + ip + " 주소의 " + super.getSize() + "인치 " +
    // color + "컬러");
    // }

    @Override
    public void printProperty() {
        System.out.print("나의 IPTV는 " + ip + " 주소의 ");
        super.printProperty();
    }
}
