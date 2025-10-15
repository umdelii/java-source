package lang;

public class StringEx4 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Kim", "Park", "Hong" };
        StringEx4 obj = new StringEx4();
        String result = obj.findKim(names);
        System.out.println(result);
    }

    public String findKim(String[] names) {
        int x = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        return "Kim은 " + (x + 1) + "번째에 있다.";
    }
}
