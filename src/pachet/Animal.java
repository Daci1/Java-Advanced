package src.pachet;

public class Animal {
    private String nume;
    private int varsta;


    // overloading/supraincarcare -> 2 metode cu aceeasi semnatura dar cu numar diferit de argumente
    public Animal(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    // keyword-ul 'this' = inseamna obiectul pe care apelam metoda
    public void play(Animal animal1){
        System.out.println(this.nume + "se joaca cu " + animal1.nume);
    }

    public void play(Animal animal1, Animal animal2){
        System.out.println(this.nume + "se joaca cu " + animal1.nume + " si cu "
                + animal2.nume);
    }

    // suprascriu toString din Object
    public String toString(){
        return "Nume: " + this.nume + ", varsta: " + this.varsta;
    }

    public String getNume() {
        return nume;
    }

    public void makeSound(){
        System.out.println("Sunet general de animal");
    }

    public int getVarsta() {
        return varsta;
    }

}
