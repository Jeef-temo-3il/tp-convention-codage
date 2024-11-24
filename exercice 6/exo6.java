public class Facture {
    
    public double verifier(boolean clientVIP, boolean fraisLivraison){
         if (clientVIP){
            calculerTotal(double montant);
         }
         if (montant < 500){
           calculerTotal(double montant); 
         }
    }
    public double calculerTotal(double montant){
        double total = montant;
         if (montant > 1000) {
                total -= montant * 0.1; // Réduction de 10%
                return total;
            }
         if (montant < 500) {
                total += 20; // Frais de livraison
                return total;
            }
    }
}
