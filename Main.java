import src.pachet.Animal;
import src.pachet.Pisica;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Animal pisica = new Animal("pisica", 4);
        Animal caine = new Animal("caine", 5);
//        Animal papagal = new Animal("papagal", 3);
//        pisica.play(caine);
//        papagal.play(caine, pisica);

        Pisica pisica = new Pisica("pisica", 4, "rasa");
        Pisica pisica1 = new Pisica("pisica", 4, "rasa");
        System.out.println(pisica);
        pisica.play(caine);
        caine.makeSound();
        pisica.makeSound();
        System.out.println(pisica.equals(pisica1));
        System.out.println(pisica == pisica1); // cand se compara obiecte cu == atunci se compara adresele de referinta din memorie

        // Colectii
        //  arraylist-urile :
        //  aloca automat memorie cand se umplu
        ArrayList<Pisica> pisici = new ArrayList<>(); // by default are lungimea 10
        for(int i = 0; i < 20; i++){
            Pisica pisicaAuxiliara = new Pisica("Pisica numarul: " + (i+1), 5, "rasa");
            pisici.add(pisicaAuxiliara); // adaugarea in array list
        }

        for(int i = 0; i < pisici.size(); i++){
            Pisica pisicaAuxiliara = pisici.get(i); // get(index) -> returneaza obiectul de la indexul "index"
            System.out.println(pisicaAuxiliara);
        }

        System.out.println("-----FOREACH-----");
        //for-each
        for(Pisica pisicaAuxiliara : pisici){
            System.out.println(pisicaAuxiliara);
        }

        System.out.println("------SET------");
        //Set-uri (multimi)
        //este cam acelasi ca arraylist dar intrarile sunt unice
        HashSet<Integer> numereIntregi = new HashSet<>();
        numereIntregi.add(2);
        numereIntregi.add(3);
        numereIntregi.add(4);
        numereIntregi.add(2);
        System.out.println(numereIntregi);

        // Maps/dictionare
        // structuri de tipul (cheie, valoare)
        // complexitatea O(1) pentru accesarea datelor
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Andrei", 30);
        map.put("Alex", 15);
        map.put("Dana", 22);
        System.out.println(map.get("Dana"));
        System.out.println(map.get("Andrei"));

        // asociere de tipul nume -> lista de prieteni
        HashMap<String, ArrayList<String>> prieteni = new HashMap<>();
        ArrayList<String> prieteniiLuiAndrei = new ArrayList<>();
        prieteniiLuiAndrei.add("Dana");
        prieteniiLuiAndrei.add("Alex");

        prieteni.put("Andrei", prieteniiLuiAndrei);
        System.out.println(prieteni.get("Andrei"));

        // Stack / Stiva -> last in first out
        // operatiile pe stack-uri se fac cu push(introduci date) si pop (scoti date)
        // peek: vezi intrarea care ar iesi daca s-ar da pop
        Stack<String> nume = new Stack<>();
        nume.push("Andrei");
        nume.push("Alex");
        System.out.println(nume.peek());
        System.out.println(nume.pop());
        System.out.println(nume);

        // Queue / coada -> first in first out
        // operatii: add(adaugare) / remove(scoti date)
        // peek: vezi intrarea care ar iesi daca s-ar da pop
        Queue<String> coada = new LinkedList<>();
        coada.add("Gigel");
        coada.add("Andrei");
        coada.add("Alex");
        System.out.println(coada.peek());

        // keyword-ul final
        // se foloseste pentru valori care nu ar mai trebui schimbate, evita bug-uri
        // pentru tipuri de date primitive: nu se poate schimba valoarea
        // pentru obiecte: nu se poate schimba referinta dar poti schimbi atributele
        final int numar = 3;
//        numar = 4;

        final Pisica pisicaTest = new Pisica("nume", 4, "rasa");
//        pisicaTest = new Pisica("nume", 4, "rasa");
        // am voie sa schimb atributele, n-am voie sa schimb referinta la un obiect final
        pisicaTest.setRasa("alta rasa");
        System.out.println(pisicaTest);


        //exemplu de citit de la tastatura
        Scanner scanner = new Scanner(System.in); // system.in -> intrarea standard(tastatura)
        int b = Integer.parseInt(scanner.nextLine());
        int a = scanner.nextInt();
        System.out.println(a + " " +  b);
    }
}
