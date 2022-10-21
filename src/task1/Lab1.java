package task1;

class Lab1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик", 100, 100);
        Tiger tiger = new Tiger("Тигра", 1000, 1000);
        System.out.println("Всего животных = " + Animals.count);
        Animal[] animals = {cat, dog, tiger};
        for (Animal anim : animals) {
            System.out.println(anim.run(200));
            System.out.println(anim.swim(200));
        }


    }
}
