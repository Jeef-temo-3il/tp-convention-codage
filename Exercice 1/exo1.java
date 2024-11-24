public class Animal {
  public String nom;
  public int age;
  
  public void parler(){
    
    System.out.println("Je suis un animal."); //afficher Je suis un animal lors de l'appel de la fontion

  }
  public void afficherInfo(){

    System.out.println("Nom: "+nom+", Âge: "+age+" ans"); // affichage du nom et de l'age de l'animal lors de l'appel de la fonction

  }
}