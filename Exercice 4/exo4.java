abstract class Animal {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;
    }
    public abstract void nourrir();
}

class Chien extends Animal {

    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void nourrir() {
        System.out.println("Donner de la nourriture pour chien à " + nom);
        System.out.println(nom + " aboie après avoir mangé.");
    }
}
class Chat extends Animal {

    public Chat(String nom) {
        super(nom);
    }

    @Override
    public void nourrir() {
        System.out.println("Donner de la nourriture pour chat à " + nom);
        System.out.println(nom + " ronronne après avoir mangé.");
    }
}
class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void nourrir() {
        System.out.println("Donner des graines à " + nom);
        System.out.println(nom + " chante après avoir mangé.");
    }
}
public class Zoo {
    public void nourrirAnimal(Animal animal) {
        animal.nourrir();
    }
 }