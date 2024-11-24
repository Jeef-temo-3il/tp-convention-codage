public class Calculateur {

    // Méthode commune pour appliquer la TVA
    private double appliquerTVA(double montant) {
        return montant * 1.2; // TVA 20%
    }

    // Méthode pour un client normal
    public double calculerPourClientNormal(double montant) {
        return appliquerTVA(montant);
    }

    // Méthode pour un client VIP
    public double calculerPourClientVIP(double montant) {
        double total = appliquerTVA(montant);
        total -= montant * 0.1; // Réduction 10% pour les VIP
        return total;
    }
}