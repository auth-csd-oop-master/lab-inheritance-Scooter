/**
 * Αυτή η κλάση αναπαριστά ένα σκούτερ με μηχανή εσωτερικής κάυσης. This class represents a scooter with an internal
 * combustion engine.
 */
public class Scooter {



    /**
     * Κατασκευαστής / Constructor
     *
     * @param maxKM Ο μέγιστος αριθμός χιλιομέτρων που μπορεί να διανύσει με ένα γέμισμα. The maximum number of
     *              kilometers you can travel with a full tank.
     * @param year Το έτος κυκλοφορίας του οχήματος, the release year of the vehicle.
     */
    public Scooter(int maxKM, int year) {

    }

    /**
     * @return Το μέγιστο αριθμό χιλιομέτρων που μπορεί να διανύσει με ένα γέμισμα. The maximum number of
     *           kilometers you can travel with a full tank.
     */
    public int getMaxKM() {

    }

    /**
     * @return Το έτος κυκλοφορίας του οχήματος, the release year of the vehicle.
     */
    public int getYear(){

    }

    /**
     * Κάθε όχημα χαρακτηρίζεται από μια βαθμολογία ανάλογα με τους ρύπου που παράγει. Το σκορ αυτό είναι ίσο με τον
     * αριθμό των μέγιστων χιλιομέτρων επί τον μέσο αριθμό γεμισμάτων ανα έτος (250), διά το σύνολο των ημερών ενός
     * έτους (365)
     * Each vehicle has a score that represents the pollutants that produces. This score equals the maximum kilometers
     * of the vehicle multiplied by the average number of fillings during  a year (250), divided by the number of days
     * in a year (365)
     * @return Το σκορ μόλυνσης του περιβάλλοντος, the pollution score.
     */
    public double getPollutionScore() {

    }

    /**
     * Μέθοδος που υπολογίζει τα τέλη κυκλοφορίας του οχήματος. Τα τέλη κυκλοφορίας ισούται με τον έτη που κυκλοφορεί το
     * όχημα μέχρι σήμερα (2018) επι 12.5 που είναι ένας σταθερός αριθμός.
     * This method computes the annual taxes of the vehicle. The annual taxes equal the number of years from the release
     * day till today (2018) multiplied by 12.5 which is a constant value.
     * @return Τα τέλη κυκλοφορίας, the annual tax of the vehicle
     */
    public double getTaxes() {

    }
}
