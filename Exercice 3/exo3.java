class Animal {
    private String nom;
    private int age;

    // Constructeur
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode parler 
    public String parler() {
        return "Cet animal ne parle pas.";
    }

    // Méthode décrire
    public String decrire() {
        return "Nom: " + nom + ", Âge: " + age + " ans, Type: " + this.getClass().getSimpleName();
    }
}

// Sous-classe Chien
class Chien extends Animal {
    public Chien(String nom, int age) {
        super(nom, age);
    }

    @Override
    public String parler() {
        return "Woof woof";
    }

    @Override
    public String decrire() {
        return super.decrire() + ", Son: " + parler();
    }
}

// Sous-classe Chat
class Chat extends Animal {
    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public String parler() {
        return "Miaou";
    }

    @Override
    public String decrire() {
        return super.decrire() + ", Son: " + parler();
    }
}