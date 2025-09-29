package object;

public class Car {

    // 속성 : 제조사명, 모델명, 색상, 최대속도

    String makerMei;
    String modelMei;
    String color;
    int maxHayasa; // ---------------------------------------------------------- 멤버변수 정의

    void forward() {
        System.out.println("전진한다");
    }

    void backward() {
        System.out.println("후진한다");
    }

    void turn() {
        System.out.println("회전한다");
    }

    public String getMakerMei() {
        return makerMei;
    }

    public void setMakerMei(String makerMei) {
        this.makerMei = makerMei;
    }

    public String getModelMei() {
        return modelMei;
    }

    public void setModelMei(String modelMei) {
        this.modelMei = modelMei;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxHayasa() {
        return maxHayasa;
    }

    public void setMaxHayasa(int maxHayasa) {
        this.maxHayasa = maxHayasa;
    }

    public Car() {
    }

    public Car(String makerMei) {
        this.makerMei = makerMei;
    }

    public Car(String makerMei, String modelMei) {
        this.makerMei = makerMei;
        this.modelMei = modelMei;
    }

    public Car(String makerMei, String modelMei, String color) {
        this.makerMei = makerMei;
        this.modelMei = modelMei;
        this.color = color;
    }

    public Car(String makerMei, String modelMei, String color, int maxHayasa) {
        this.makerMei = makerMei;
        this.modelMei = modelMei;
        this.color = color;
        this.maxHayasa = maxHayasa;
    }

    @Override
    public String toString() {
        return "Car [makerMei=" + makerMei + ", modelMei=" + modelMei + ", color=" + color + ", maxHayasa=" + maxHayasa
                + "]";
    }

}
