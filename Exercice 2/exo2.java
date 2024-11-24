public class Veterinaire {
    private String type;
    private String nom;
    
    public Veterinaire(String type, String nom){
        this.type = type;
        this.nom = nom;
    }
    public static void choisirAnimal(){  //methode qui prend en parametre le type d'animal et l'affiche lors de l'appel de la fonction choisirAnim
        System.out.println(" Vous avez choisir le : " +type);
    }
    public static void soignerAnimal(){ //methode qui en parametre le nom de l'animal a soigner et l'affiche a son appel   
        Sytem.out.println("Vous demandez les soins pour" +nom);
    }
    public static void ExamInjec(){ //methode qui prend aucun parametre et affiche l'examen de ses pattes et l'injection prise
        System.out.println("Examen des pattes");
        System.out.println("Injection de vaccin");
    }
} 