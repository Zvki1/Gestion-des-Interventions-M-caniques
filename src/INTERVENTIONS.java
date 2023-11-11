public class INTERVENTIONS {
    private int NUMINTERVENTION,NUMVEHICULE;
    private Datep DATEDEBINTERV,DATEFININTERV;
    private String TYPEINTERVENTION;
    private float COUTINTERV;

    // constructeur
INTERVENTIONS( int NUMINTERVENTION, int NUMVEHICULE,String TYPEINTERVENTION, Datep DATEDEBINTERV, Datep DATEFININTERV,  float COUTINTERV){
    int diff=DATEFININTERV.difference(DATEDEBINTERV);
    if(diff<0){
        System.out.println("la date de fin doit etre superieur a la date de debut");
    }else{
    this.NUMINTERVENTION = NUMINTERVENTION;
    this.NUMVEHICULE = NUMVEHICULE;
    this.DATEDEBINTERV = DATEDEBINTERV;
    this.DATEFININTERV = DATEFININTERV;
    this.TYPEINTERVENTION = TYPEINTERVENTION;
    this.COUTINTERV = COUTINTERV;
    
}
}
//getters
public int getNUMINTERVENTION(){
    return NUMINTERVENTION;
}
public int getNUMVEHICULE(){
    return NUMVEHICULE;
}
public Datep getDATEDEBINTERV(){
    return DATEDEBINTERV;
}
public Datep getDATEFININTERV(){
    return DATEFININTERV;}
public String getTYPEINTERVENTION(){
    return TYPEINTERVENTION;
}
public float getCOUTINTERV(){
    return COUTINTERV;
}
public void setDATEFININTERV(Datep dATEFININTERV) {
    this.DATEFININTERV = dATEFININTERV;
}
public String toString(){
    return "[INTERVENTION:"+"NUMINTERVENTION="+NUMINTERVENTION+",NUMVEHICULE="+NUMVEHICULE+",TYPEINTERVENTION="+TYPEINTERVENTION+",DATEDEBINTERV="+DATEDEBINTERV.affichedate2()+",DATEFININTERV="+DATEFININTERV.affichedate2()+",COUTINTERV="+COUTINTERV+"]";
}



}