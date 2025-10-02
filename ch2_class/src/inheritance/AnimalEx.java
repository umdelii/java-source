package inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        /*
         * 다형성(polymorphism)
         * 여러가지 형태를 가질 수 있는 능력
         * 부모 = new 자식();
         * 코딩을 조금 더 간단하게 하기 위해 쓴다는데...
         */

        Animal animal = new Animal();

        Carnivore carnivore = new Carnivore();
        carnivore.eat();
        carnivore.print();

        Herbivore herbivore = new Herbivore();
        herbivore.eat();
        herbivore = (Herbivore) animal; // ------------- 좌 자식 = 우 부모 x

        // Animal animal = new Carnivore(); // ----------- 좌 부모 = 우 자식 ok,
        // animal.eat();
        // animal = new Herbivore();
        // animal.eat();
        // animal.print(); -------> 이거 안됨
        // ((Carnivore) animal).print(); --------------> 강제 형변환(무조건 되는건 아님)

        // Carnivore carnivore2 = new Carnivore();
        // herbivore = (Herbivore) carnivore2;
    }
}
