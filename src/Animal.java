public class Animal {
    /**Atributes*/
    protected String name;
    protected String noise;


    /**Constructor*/
    public Animal(){}// this is the defualt constructer

    public Animal(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public void speak(){
        //super speak();
        System.out.println("The animal "+ name +" says "+ noise);
    }
}
