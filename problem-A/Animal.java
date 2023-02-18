class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal = " + name;
    }
}
class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[Animal = " + super.name;
    }
}
class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString() {
        return "Cat[Mammal[Animal = " + super.name ;
    }

}
class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println();
    }
    public void greets(Dog another){
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog[Mammal[Animal = " + super.name;
    }
}

