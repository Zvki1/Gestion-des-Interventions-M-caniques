public class MODELE {
 private int NUMMODELE,NUMMARQUE;
    private String MODELE; 

MODELE(int NUMMODELE,int NUMMARQUE,String MODELE){
    this.NUMMODELE=NUMMODELE;
    this.NUMMARQUE=NUMMARQUE;
    this.MODELE=MODELE;
}
public String toString(){
    return "NUMMODELE: "+NUMMODELE+" NUMMARQUE: "+NUMMARQUE+" MODELE: "+MODELE;
}
public int getNUMMODELE(){
    return NUMMODELE;
}
public String getMODELE(){
    return MODELE;
}
public int  getNUMMARQUE(){
    return NUMMARQUE;

}
}
