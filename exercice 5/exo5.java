public class CommandeManager {
     private String status;
     private boolean estUrgente,
     private double montant;

     public CommandeManager(String status, boolean estUrgente, double montant){
        this.status = status,
        this.estUrgente = estUrgente;
        this.montant = montant;
     }
     public void etatCommande(){
        if(status.equals("NOUVELLE")){
           System.out.println("Traiter la commande immédiatement."); 
        }else if(status.equals("ANNULE")){
           System.out.println("Commande annulée. Envoyer une notification au client.");  
        }else{
          System.out.println("Statut de commande inconnu.");  
        }
     } 
     public void traiterCommande(){
        if(estUrgente){
           System.out.println("Traiter la commande immédiatement."); 
        }else{
            System.out.println("Traiter la commande normalement.");
        }
     }
     public void remiseSpecial(){
        if(montant > 1000){
            System.out.println("Appliquer une remise spéciale.");
        }
     }  
}