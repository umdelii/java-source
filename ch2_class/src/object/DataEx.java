package object;

public class DataEx {
    public static void main(String[] args) {
        Data data = new Data();
        data.x = 10;
        change(data.x);
        System.out.println("호출 후 : " + data.x);
        change(data);
        System.out.println("호출 후 : " + data.x);
        Data data2 = copy(data);
        System.out.println("data2.x = " + data2.x);
    }

    public static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }

    public static void change(Data d) { // ----------------------- 값이 아니라 데이터가 넘어왔으므로 원본 데이터 바뀜
        d.x = 15;
        System.out.println("변경 후 : " + d.x);
    }

    public static void change(int x) { // ------------------------- int타입의 값 자체가 넘어왔기에 원본 데이터(직접 변경)은 안바뀜
        x = 15;
        System.out.println("변경 후 : " + x);
    }

}
