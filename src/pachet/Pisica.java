package src.pachet;

import src.pachet.Animal;

// extends ofera clasei pisica ofera acces la atributele si metodele public/protected
// toate clasele extinds clasa Object
public class Pisica extends Animal {
    //atributele protected sunt vizibile in acelasi pachet si pentru subclase
    // subclasa inseamna o clasa care mosteneste alta
    protected String rasa;

    public Pisica(String nume, int varsta, String rasa){
        super(nume, varsta); // apeleaza constructorul din superclasa
        this.rasa = rasa;
    }
    // suprascriu toString din Animal
    public String toString(){
        String aux = super.toString();
        aux += ", rasa: " + this.rasa;//aux = aux +
        return aux;
    }
    // overriding/suprascriere -> suprascriu metoda ierarhic mai sus declarata
    public void play(Animal animal1){
        System.out.println("Pisica cu numele: " + this.getNume() +
                " se joaca cu " + animal1.getNume());
    }

    public void makeSound() {
        System.out.println("Miau");
    }

    public String getRasa() {
        return rasa;
    }

    public boolean equals(Object o){
        if(!(o instanceof Pisica)){
            return false;
        }
        if(o == null){
            return false;
        }
        // nu comparati stringuri cu ==
        // == se uita la referinta
        Pisica pisicaAux = (Pisica) o;
        // o pisica este egala cu alta daca au acelasi nume, varsta si rasa
        return this.getNume().equals(pisicaAux.getNume())
                && this.getVarsta() == ((Pisica) o).getVarsta()
                && this.getRasa().equals(pisicaAux.getRasa());
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
