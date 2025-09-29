package object;

public class TVEx {
    public static void main(String[] args) {

        // TV class의 인스턴스 생성
        TV tv = new TV();

        System.out.println(tv); // object.TV@24d46ca6
        // toString 실행 후 재출력 : TV [size=0, channel=0, power=false, color=null]

        // tv.power = true;
        tv.setPower(true);
        // tv.size = 52;
        tv.setSize(52);
        // tv.channel = 4;
        tv.setChannel(27);
        // tv.color = "white";
        tv.setColor("white");

        System.out.println(tv);

        TV tv2 = new TV();

        tv2.setPower(false);
        tv2.setSize(30);
        tv2.setChannel(22);
        tv2.setColor("gray");

        // ++channel
        tv2.channelUp();

        System.out.println(tv2);
    }
}
