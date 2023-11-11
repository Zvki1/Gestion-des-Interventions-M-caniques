public class MARQUE {
    private int NUMMARQUE;
    private String MARQUE,PAYS;
    
    MARQUE(int NUMMARQUE,String MARQUE,String PAYS){
        this.NUMMARQUE=NUMMARQUE;
        this.MARQUE=MARQUE;
        this.PAYS=PAYS;
    }
    @Override
    public String toString(){
        return "NUMMARQUE: "+NUMMARQUE+" MARQUE: "+MARQUE+" PAYS: "+PAYS;
    }
    public int getNUMMARQUE(){
        return NUMMARQUE;
    }
    public String getMARQUE(){
        return MARQUE;
    }
}
