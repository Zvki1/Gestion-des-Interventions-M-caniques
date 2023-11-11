
public class EMPLOYE {
    private int NUMEMPLOYE ;
    private String NOMEMP,PRENOMEMP;
    private int nbv=0;
    private Categorie CATEGORIE;
    private float SALAIRE;
    private Datep DATEEMBAUCHE;//l'ajout de la date d'installation


    //enumeratrion de la categorie
    public enum Categorie {Mecanicien,Assistant};
    //constructeur
    EMPLOYE(int NUMEMPLOYE,String NOMEMP,String PRENOMEMP,Categorie CATEGORIE,float SALAIRE,Datep dateEmbauche2){
       if(CATEGORIE==null || SALAIRE==0){
            System.out.println("veuillez remplir  les champs categorie et salaire");
       }else{    
        this.NUMEMPLOYE=NUMEMPLOYE;
        this.NOMEMP=NOMEMP;
        this.PRENOMEMP=PRENOMEMP;
        this.CATEGORIE=CATEGORIE;
        this.SALAIRE=SALAIRE;
        this.DATEEMBAUCHE=dateEmbauche2;
    }
}
    //getters
    public int getNUMEMPLOYE(){
        return NUMEMPLOYE;
    }
    public String getNOMEMP(){
        return NOMEMP;
    }
    public String getPRENOMEMP(){
        return PRENOMEMP;
    }
    public Categorie getCATEGORIE(){
        return CATEGORIE;
    }
    public float getSALAIRE(){
        return SALAIRE;
    }
    public Datep getDATEEMBAUCHE(){
        return DATEEMBAUCHE;
    }
    public int getnbv(){
        return nbv;
    }
    //setters
    public void setSALAIRE(float SALAIRE){
        this.SALAIRE=SALAIRE;
    }
    public void incnbv(){
        nbv++;
    }
    public void getnbv(int nbv){
        this.nbv=nbv;
    }


    public String toString(){
    return "employe[ numero employe: "+NUMEMPLOYE+" nom: "+NOMEMP+" prenom: "+PRENOMEMP+" categorie: "+CATEGORIE+" salaire: "+SALAIRE+" date d'embauche: "+DATEEMBAUCHE.affichedate2()+"nombres interventions: "+nbv+"]";
}
   
}