public class INTERVENANTS {
    private int NUMEMPLOYE,NUMINTERVENTION;
    private Datep DATEDEBUT,DATEFIN;

    public INTERVENANTS(  int NUMINTERVENTION , int NUMEMPLOYE, Datep DATEDEBUT, Datep DATEFIN) {
        this.NUMEMPLOYE = NUMEMPLOYE;
        this.NUMINTERVENTION = NUMINTERVENTION;
        this.DATEDEBUT = DATEDEBUT;
        this.DATEFIN = DATEFIN;
    }
    public String toString() {
        return "INTERVENANTS{" +
                " NUMINTERVENTION=" + NUMINTERVENTION +
                ",NUMEMPLOYE=" + NUMEMPLOYE +
                ", DATEDEBUT=" + DATEDEBUT.affichedate2() +
                ", DATEFIN=" + DATEFIN.affichedate2() +
                '}';

    }
    public int getNUMEMPLOYE() {
        return NUMEMPLOYE;
    }
    public int getNUMINTERVENTION() {
        return NUMINTERVENTION;
    }
}

