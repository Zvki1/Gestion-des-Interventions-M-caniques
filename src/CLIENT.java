public class CLIENT {
  
private int NUMCLIENT;
    private Civilite CIV;
    private String NOMCLIENT,PRENOMCLIENT,ADRESSE,TELPROF,TELPRIV,FAX;
    private Datep DATENAISSANCE;
    public enum Civilite {M,Mle,Mme};

    public CLIENT(int numClient2, Civilite civilite,String prenomClient2, String nomClient2, Datep dateNaissance2,  String adresse2, String telProf2, String telPriv2, String fax2) {
        this.NUMCLIENT = numClient2;
        this.CIV = civilite;
        this.NOMCLIENT = nomClient2;
        this.PRENOMCLIENT = prenomClient2;
        this.ADRESSE = adresse2;
        this.TELPROF = telProf2;
        this.TELPRIV = telPriv2;
        this.FAX = fax2;
        this.DATENAISSANCE = dateNaissance2;
    }
    public String toString() {
        return "CLIENT [NUMCLIENT=" + NUMCLIENT + ", CIV=" + CIV + ", NOMCLIENT=" + NOMCLIENT + ", PRENOMCLIENT="
                + PRENOMCLIENT + ", DATENAISSANCE=" + DATENAISSANCE.affichedate2()+", ADRESSE=" + ADRESSE + ", TELPROF=" + TELPROF + ", TELPRIV=" + TELPRIV + ", FAX="
                + FAX + "]";
    }



        public int getNUMCLIENT() {
        return NUMCLIENT;
        }
        public int getNbInterventions() {
            return 0;
        }
        public String getNOMCLIENT() {
            return null;
        }
        public String getPRENOMCLIENT() {
            return null;
        }
        public void setNbInterventions(int totalInterventions) {
        }
        public int getNUMVEHICULE() {
            return 0;
        }


}

