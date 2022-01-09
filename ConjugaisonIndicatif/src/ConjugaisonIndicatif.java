public class ConjugaisonIndicatif {
    private String verbe;
    private final String suffixe = "er";
    private final String[] pronoms = {"je", "tu", "il/elle", "nous", "vous", "ils/elles"};
    private final String[] terminaisonPresent = {"e", "es", "e", "ons", "ez", "ent"};
    private final String[] terminaisonPasse = {"é", "é", "é", "é", "é", "é"};
    private final String[] terminaisonFutur = {"ai", "as", "a", "rons", "rez", "ront"};
    private final String[] terminaisonImparfait = {"ais", "ais", "ait", "ions", "iez", "aient"};

    public ConjugaisonIndicatif(String $verbe) {
        int size = $verbe.length();
        if (size >= 4 && $verbe.substring(size - 2).equals(this.suffixe)) {
            this.verbe = $verbe;
        } else {
            System.out.println("Veuillez saisir un verbe du premier groupe");
            System.exit(0);
        }
    }

    public void present() {
        String verbe = this.verbe.substring(0, this.verbe.length() - 2);
        for (int i=0; i<this.pronoms.length; i++)
            System.out.println("-\t" + this.pronoms[i] + " " + verbe + this.terminaisonPresent[i]);
    }

    public void passe() {
        String verbe = this.verbe.substring(0, this.verbe.length() - 2);
        String[] auxiliaire = {"ai", "as", "a", "avons", "avez", "ont"};
        System.out.println("-\t" + "j'ai " + verbe + this.terminaisonPasse[0]);
        for (int i=1; i<this.pronoms.length; i++)
            System.out.println("-\t" + this.pronoms[i] + " " + auxiliaire[i] + " " + verbe + this.terminaisonPasse[i]);
    }

    public void futur() {
        for (int i=0; i<this.pronoms.length; i++)
            System.out.println("-\t" + this.pronoms[i] + " " + this.verbe + this.terminaisonFutur[i]);
    }

    public void imparfait() {
        String verbe = this.verbe.substring(0, this.verbe.length() - 2);
        for (int i=0; i<this.pronoms.length; i++)
            System.out.println("-\t" + this.pronoms[i] + " " + verbe + this.terminaisonImparfait[i]);
    }

    public String getVerbe() {
        return verbe;
    }

    public void setVerbe(String verbe) {
        int size = verbe.length() - 1;
        if (size >= 4 && verbe.charAt(size - 1) == 'e' && verbe.charAt(size) == 'r') {
            this.verbe = verbe;
        }
    }

    public String[] getPronoms() {
        return pronoms;
    }

    public String[] getTerminaisonPresent() {
        return terminaisonPresent;
    }

    public String[] getTerminaisonPasse() {
        return terminaisonPasse;
    }

    public String[] getTerminaisonFutur() {
        return terminaisonFutur;
    }

    public String[] getTerminaisonImparfait() {
        return terminaisonImparfait;
    }
}
