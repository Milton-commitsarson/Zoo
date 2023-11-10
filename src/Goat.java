public class Goat extends Animal{ //needs a defualt cunstructer to work (gå till Animal.java)

    public Goat(String name, String noise){
        super(name, noise);
    }

    @Override
    public void speak(){
        System.out.println("The Goat "+ name +" says "+ noise);
    }
}
