public class VEHICULE {
    private int NUMVEHICULE,NUMCLIENT,NUMMODELE,ANNEE;
    private int nbintervention=0;
    private String NUMIMMAT;

VEHICULE(int NUMVEHICULE,int NUMCLIENT,int NUMMODELE,String NUMIMMAT,int ANNEE){
    this.NUMVEHICULE=NUMVEHICULE;
    this.NUMMODELE=NUMMODELE;
    this.NUMCLIENT=NUMCLIENT;
    this.NUMIMMAT=NUMIMMAT;
    this.ANNEE=ANNEE;
}
public int getNUMMODELE(){
    return NUMMODELE;
}
@Override
public String toString(){
    return "NUMVEHICULE: "+NUMVEHICULE+" NUMCLIENT: "+NUMCLIENT+" NUMMODELE: "+NUMMODELE+" NUMIMMAT: "+NUMIMMAT+" ANNEE: "+ANNEE+"";
}
public int getNUMVEHICULE(){
    return NUMVEHICULE;
}
public int  getnbintervention(){
    return nbintervention;
}
public void incnbintervention(){
    nbintervention++;
}

}