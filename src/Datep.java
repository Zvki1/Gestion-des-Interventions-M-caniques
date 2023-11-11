import java.util.Scanner;
import java.time.LocalDate;

public class Datep {
     int année;
     int jour;
     int mois;

    public  Datep (){ //constructeur

    }
    public Datep(int jour,int mois,int année){
        this.jour=jour;
        this.mois=mois;
        this.année=année;
        
    }
    public Datep(String ch){
        String[] tab=ch.split("/");
        this.jour=Integer.parseInt(tab[0]);
        this.mois=Integer.parseInt(tab[1]);
        this.année=Integer.parseInt(tab[2]);
    }
   public int getMois() {
       return mois;
   }
   public int getJour() {
       return jour;
   }
    public void affichedate(){
        System.out.println(this.jour+"/"+this.mois+"/"+this.année);
    }
    public String affichedate2(){
        return Integer.toString(this.jour)+"/"+Integer.toString(this.mois)+"/"+Integer.toString(this.année);
    }
    public void liredate(){
       Scanner scan =new Scanner(System.in) ;
       System.out.println("entez l\'anne");
       this.année=scan.nextInt();
       System.out.println("entez le mois");
       this.mois=scan.nextInt();
       System.out.println("entez le jour");
       this.jour=scan.nextInt();


    }
    public boolean bisextile(Datep a){
        if(a.année % 4 ==0){
            if ((a.année % 100 ==0 ) && (a.année % 400 != 0)){
                return false;
            }
            return true;
        }
        return false;
    }
    public int difference(Datep d){
        return (this.année*365+this.mois*30+this.jour)-(d.année*365+d.mois*30+d.jour);
    }
}



