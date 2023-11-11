import java.io.BufferedReader;
import java.io.FileReader;
import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;


public class App {
    static   ArrayList<INTERVENTIONS> interventions = new ArrayList<INTERVENTIONS>();
    static   ArrayList <MARQUE> marques = new ArrayList<MARQUE>();
    static        ArrayList<MODELE> modeles = new ArrayList<MODELE>();
    static    ArrayList<CLIENT> clients = new ArrayList<CLIENT>();
    static    ArrayList<EMPLOYE> employes = new ArrayList<EMPLOYE>();
    static    ArrayList<VEHICULE> vehicules = new ArrayList<VEHICULE>();
    static    ArrayList<INTERVENANTS> intervenantsList = new ArrayList<>();
    public static void main(String[] args) {
       
        //instanciation des objets 
        //instantiation de la classe client
        //declaration d'une arraylist de client
       
        String fileName = "CLIENT.txt"; // Nom de notre fichier client
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while( (line = br.readLine())!=null){ //readline permet de lire ligne par ligne et de s'arrêter à la fin du fichier
                String[] values = line.split(","); // On sépare les valeurs de la ligne en utilisant la virgule comme séparateur en obtenant un tableau de String

                int numClient = Integer.parseInt(values[0]); // On récupère le numéro de client par la conversion de la chaîne de caractères en entier
                CLIENT.Civilite civilite = CLIENT.Civilite.valueOf(values[1]);// On récupère la civilité par la conversion de la chaîne de caractères en enum
                String prenomClient = values[2];// On récupère le prénom du client
                String nomClient = values[3];// On récupère le nom du client
                Datep dateNaissance = new Datep(values[4]); // On récupère la date de naissance du client
                String adresse = values[5];// On récupère l'adresse du client
                String telProf = values[6];// On récupère le téléphone professionnel du client
                String telPriv = values[7];// On récupère le téléphone privé du client
                String fax = values[8];// On récupère le fax du client

                CLIENT client = new CLIENT(numClient, civilite, prenomClient, nomClient, dateNaissance, adresse, telProf, telPriv, fax);// On crée un objet client avec les valeurs récupérées depuis la ligne du fichier
               //l'ajout du client dans le array list via la methode add
                clients.add(client);
        
            }   
        }catch (Exception e) {
            e.printStackTrace();
            
        }
        //le parcours de la liste des clients et laffichage des clients
        // for (CLIENT c : clients) {   
        //     System.out.println(c);  
        // }
        
        //--------------------------------------//
        // instanciation de la classe employe
        //declaration d'une arraylist de employe
        
        try (BufferedReader br = new BufferedReader(new FileReader("EMPLOYE.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(" ");

                int numEmploye = Integer.parseInt(values[0]);
                String nomEmp = values[1];
                String prenomEmp = values[2];
                EMPLOYE.Categorie categorie = EMPLOYE.Categorie.valueOf(values[3]);
                float salaire = Float.parseFloat(values[4]);

                //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Datep dateEmbauche =new Datep(values[5]);

                EMPLOYE employe = new EMPLOYE(numEmploye, nomEmp, prenomEmp, categorie, salaire, dateEmbauche);
                employes.add(employe);
            }
        } catch (Exception e) {
           // e.printStackTrace();
        }
       // Afficher les employés créés
        // for (EMPLOYE employe : employes) {
        //     System.out.println(employe);
        // }
        //--------------------------------------//
        // instanciation de la classe intervention
        //declaration d'une arraylist de intervention
      
        try (BufferedReader br = new BufferedReader(new FileReader("INTERVENTIONS.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                int NUMINTERVENTION = Integer.parseInt(values[0]);
                int NUMVEHICULE = Integer.parseInt(values[1]);
                String TYPEINTERVENTION = values[2];
               Datep DATEDEBINTERVs= new Datep(values[3]) ;
               Datep DATEFININTERV= new Datep(values[4]) ;
               Float COUTINTERV=Float.parseFloat(values[5]);
                //l'instantiation de la classe intervention
                 INTERVENTIONS intervention = new INTERVENTIONS(NUMINTERVENTION, NUMVEHICULE, TYPEINTERVENTION, DATEDEBINTERVs, DATEFININTERV, COUTINTERV);
                interventions.add(intervention);//l'ajout de l'intervention dans le array list via la methode add
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       // affichage des interventions
        // for (INTERVENTIONS intervention : interventions) {
        //     System.out.println(intervention);
        // }

        
        //--------------------------------------//
        // instanciation de la classe vehicule
        //declaration d'une arraylist de vehicule
        
        try (BufferedReader reader = new BufferedReader(new FileReader("VEHICULES.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                
                int numVehicule = Integer.parseInt(values[0]);
                int numClient = Integer.parseInt(values[1]);
                int numModele = Integer.parseInt(values[2]);
                String numImmat =values[3];
                int annee = Integer.parseInt(values[4]);
                
                VEHICULE vehicule = new VEHICULE(numVehicule, numClient, numModele, numImmat, annee);
                vehicules.add(vehicule);
                // Utiliser l'objet VEHICULE ici (par exemple, l'ajouter à une liste)
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
  //afficher les vehicules
//    for(VEHICULE vehicule:vehicules){
//     System.out.println(vehicule);
//    }

    //---------------------------------------------
    // instanciation de la classe modele
   

    
        
        try (BufferedReader reader = new BufferedReader(new FileReader("MODELE.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                
                int numModele = Integer.parseInt(values[0]);
                int numMarque = Integer.parseInt(values[1]);
                String modele = values[2];
                
                MODELE modeleObj = new MODELE(numModele, numMarque, modele);
                modeles.add(modeleObj);
                
                // Utiliser l'objet MODELE ici (par exemple, l'ajouter à une liste)
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // afficher les modeles
        // for(MODELE modele:modeles){
        //     System.out.println(modele);
        // }

        //---------------------------------------------
        // instanciation de la classe marque
        
        try (BufferedReader reader = new BufferedReader(new FileReader("MARQUE.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                
                int numMarque = Integer.parseInt(values[0]);
                String marque = values[1];
                
                String pays = values[2];
               
                MARQUE marqueobj = new MARQUE(numMarque, marque, pays);
                marques.add(marqueobj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //afficher les marques
        // for(MARQUE marque:marques){
        //     System.out.println(marque);
        // }

        //---------------------------------------------
        // instanciation de la classe intervenants
        String filename = "Intervenants1.txt";
      

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                int NUMINTERVENTION = Integer.parseInt(values[0]);
                int NUMEMPLOYE = Integer.parseInt(values[1]);
                Datep DATEDEBUT = new Datep(values[2]);
                Datep DATEFIN = new Datep(values[3]);

                INTERVENANTS intervenant = new INTERVENANTS(NUMINTERVENTION,NUMEMPLOYE, DATEDEBUT, DATEFIN);
                intervenantsList.add(intervenant);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 

        // Afficher les objets INTERVENANTS instanciés
        // for (INTERVENANTS intervenant : intervenantsList) {
        //     System.out.println(intervenant);
        // }







        MenuFrame menuFrame = new MenuFrame(employes,marques,modeles,interventions,clients,intervenantsList,vehicules);
        menuFrame.setVisible(true);
//affichage du menu 
int menu=1;
while(menu==1){
Scanner sc = new Scanner(System.in);
System.out.println("veuillez choisir une action");
System.out.println("1-augmenter le salaire de badi hatem a 5000 da");
System.out.println("2-Rajouter cinq jours pour les interventions du mois de Février");
System.out.println("3-Supprimer tous les véhicules du modèle « Série 5 »");
System.out.println("4-Lister les modèles et leur marque");
System.out.println("5-Lister les véhicules sur lesquels, il y a au moins une intervention");
System.out.println("6-Lister les employés dont le nom commence par un T");
System.out.println("7-Déterminer la liste des interventions faites par l'employé nommé LACHEMI");
System.out.println("8-Déterminer la liste des interventions faites en mois de Mars");
System.out.println("9-lister les 3 employés ayant fait le plus d'interventions");
System.out.println("10-Lister les client les plus fidele ");

int choix = sc.nextInt();
switch (choix) {
    case 1:
        //augmenter le salaire de badi hatem a 5000 da
        for (EMPLOYE employe : employes) {
            if (employe.getNOMEMP().equals("BADI") && employe.getPRENOMEMP().equals("Hatem")) {
                System.out.println("salaire de badi hatem avant1 "+employe.getSALAIRE());
                employe.setSALAIRE(employe.getSALAIRE()+ 5000);
                System.out.println("salaire de badi hatem apres "+employe.getSALAIRE());
                
            }
        }
        System.out.println("1-afficher le menu   0-quiter");
        menu = sc.nextInt();
        
         break;
       
    case 2:
    App.rajouterCinqJoursInterventionsFevrier();
        //Rajouter cinq jours pour les interventions du mois de Février
       
        System.out.println("1-afficher le menu   0-quiter");
        menu = sc.nextInt();
    break;

    case 3:
        //Supprimer tous les véhicules du modèle « Série 5 »
       //parcourir les vehicules avant la suppression
        //  for(VEHICULE vehicule:vehicules){
        //       System.out.println(vehicule);
        //  }
            Boolean b=false;
        Iterator<VEHICULE> iterator = vehicules.iterator();
       for(MODELE modele:modeles){
      
           if (modele.getMODELE().equalsIgnoreCase("Serie 5")) {
           
            while(iterator.hasNext()){
                VEHICULE vehicule = iterator.next();
                if (vehicule.getNUMMODELE()==modele.getNUMMODELE()) {
                    System.out.println("Ce vehicule et de modele serie 5 "+vehicule);
                    iterator.remove();
                    System.out.println("vehicule supprimer");
                    b=true;
                }
            }

           }
       }
       if (b==false) {
           System.out.println("aucun vehicule de modele serie 5");
       }
       //parcourir les vehicules apres la suppression
        //  for(VEHICULE vehicule:vehicules){
        //   System.out.println(vehicule);
        //  }
       System.out.println("1-afficher le menu   0-quiter");
       menu = sc.nextInt();
    break;

    case 4:
    //lister les modeles et leur marque 
    for(MODELE modele:modeles){
        for(MARQUE marque:marques){
            if (modele.getNUMMARQUE()==marque.getNUMMARQUE()) {
                System.out.println("modele : "+modele.getMODELE()+" marque : "+marque.getMARQUE());
            }
            
        }
    }

    System.out.println("1-afficher le menu   0-quiter");
       menu = sc.nextInt();
    break;

    case 5:
    //lister les vehicules sur lesquels, il y a au moins une intervention
    System.out.println("les vehicules sur lesquels, il y a au moins une intervention:");
    for(VEHICULE vehicule:vehicules){
        for(INTERVENTIONS intervention:interventions){
            if (vehicule.getNUMVEHICULE()==intervention.getNUMVEHICULE()) {
                //affciher le numero de vehicule et son modele
                 for(MODELE modele:modeles){
                    if (vehicule.getNUMMODELE()==modele.getNUMMODELE()) {
                        System.out.println("numvehicule : "+vehicule.getNUMVEHICULE()+" modele : "+modele.getMODELE());
                    }
                }
               
            }
            
        }
    }
    System.out.println("1-afficher le menu   0-quiter");
       menu = sc.nextInt();
    break;


    
    case 6:
    // lister les employés dont le nom commence par un T
    for(EMPLOYE employe:employes){
        if (Character.toUpperCase(employe.getNOMEMP().charAt(0))=='T') {
            System.out.println(employe);
        }
    }

    System.out.println("1-afficher le menu   0-quiter");
    menu = sc.nextInt();
    break;
   
    case 7:
    int numemploye=0;
    //  Déterminer la liste des interventions faites par l'employé nommé LACHEMI
    //receperation le numero de l'employe nommé LACHEMI
    System.out.println("les interventions faites par l'employé nommé LACHEMI");
    for(EMPLOYE employe :employes ){
        if(employe.getNOMEMP().equalsIgnoreCase("LACHEMI")){
                 numemploye=employe.getNUMEMPLOYE();
            }
           } 
           //afficher les interventions faites par l'employe nommé LACHEMI 
            for(INTERVENANTS intervenant:intervenantsList){ //parcourir la liste des intervenants
               
                if (intervenant.getNUMEMPLOYE()==numemploye) { //si le numero de l'employe est egale au numero de l'employe nommé LACHEMI (53)
                    for(INTERVENTIONS intervention:interventions){//parcourir la liste des interventions
                        if (intervention.getNUMINTERVENTION()==intervenant.getNUMINTERVENTION()) { //si le numero de l'intervention est egale au numero de l'intervention de l'employe nommé LACHEMI
                         
                            System.out.println(intervention); //afficher l'intervention  LACHEMI
                        }
                    }
                }
            }
        
    

    System.out.println("1-afficher le menu   0-quiter");
    menu = sc.nextInt();
    break;

    case 8:
            Boolean bb=false;
            // Déterminer la liste des interventions faites en mois de Mars
            System.out.println("les interventions faites en mois de Mars");
            for(INTERVENTIONS intervention:interventions){
                
                if (intervention.getDATEDEBINTERV().getMois()==3) {
                    System.out.println(intervention);
                    bb=true;
                }
            }
            if (bb==false) {
                System.out.println("aucune intervention en mois de Mars");
            }
    System.out.println("1-afficher le menu   0-quiter");
    menu = sc.nextInt();
    break;

    case 9:
            // lister les 3 employés ayant fait le plus d'interventions
            //faire un array list qui contient les numemploye des employes qui ont fait des interventions
            ArrayList<Integer> numemployes=new ArrayList<Integer>();
            for(INTERVENANTS intervenant:intervenantsList){
                numemployes.add(intervenant.getNUMEMPLOYE());
            }//array list qui contient les numemploye est cree 
            for(int num:numemployes){ // on boucle sur les numemploye
               for(EMPLOYE employe:employes){   
                   if (num==employe.getNUMEMPLOYE()) { //si le numemploye est egale au numemploye de l'employe alors on inc le nbv de l'employe
                       employe.incnbv();
                   }
               }// boucle sur les employes
            }//fin de la  boucle sur les numemploye
            // creer un copie de la liste des employes pour la trier selon le nbv
            ArrayList<EMPLOYE> employes2=new ArrayList<EMPLOYE>();
            for(EMPLOYE employe:employes){
                employes2.add(employe);
            }
            //trier la liste des employes selon le nbv
            Collections.sort(employes2, new Comparator<EMPLOYE>() {
                @Override
                public int compare(EMPLOYE o1, EMPLOYE o2) {
                    return o2.getnbv()-o1.getnbv();
                }
            });//fin du tri
            //afficher les 3 premier employe selon le nbv
            System.out.println("les 3 employés ayant fait le plus d'interventions");
            for(int i=0;i<3;i++){
                System.out.println(employes2.get(i));
            }
 
    System.out.println("1-afficher le menu   0-quiter");
    menu = sc.nextInt();
    break;

    case 10:
    // lister les trois clients les plus fidèles ayant sollicités le maximum d’interventions.
    //faire un array list qui contient les numclient des clients qui ont fait des interventions
  // Calculer le nombre total d'interventions pour chaque client
for (CLIENT client : clients) {
    int totalInterventions = 0;

    // Parcourir les interventions pour trouver celles liées aux voitures du client
    for (INTERVENTIONS intervention : interventions) {
        if (intervention.getNUMVEHICULE() == client.getNUMVEHICULE()) {
            totalInterventions++;
            System.out.println(totalInterventions);
        }
    }

    // Stocker le nombre total d'interventions dans le client
    client.setNbInterventions(totalInterventions);
    System.out.println(client.getNbInterventions());
}

// Trier la liste des clients en fonction du nombre d'interventions dans l'ordre décroissant
Collections.sort(clients, new Comparator<CLIENT>() {
    @Override
    public int compare(CLIENT c1, CLIENT c2) {
        return c2.getNbInterventions() - c1.getNbInterventions();
    }
});

// Afficher les informations des 3 premiers clients (les plus fidèles)
for (int i = 0; i < 3 && i < clients.size(); i++) {
    CLIENT client = clients.get(i);
    System.out.println("Client " + (i + 1) + ": " + client.getNOMCLIENT() + " " + client.getPRENOMCLIENT());
    System.out.println("Nombre d'interventions: " + client.getNbInterventions());
    System.out.println("-------------------------");
}
System.out.println("1-afficher le menu   0-quiter");
menu = sc.nextInt();
    break;

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
  
    }
}
System.out.println("fin du programme");





// la fin de la methode main
}
      public static void rajouterCinqJoursInterventionsFevrier(){
         for (INTERVENTIONS intervention : interventions) {
           
            if (intervention.getDATEDEBINTERV().getMois()==2) {
                System.out.println("La date avant l'ajout:"+intervention.getDATEFININTERV().affichedate2());
                Datep datemp=new Datep(intervention.getDATEFININTERV().jour+5, intervention.getDATEFININTERV().getMois(),intervention.getDATEFININTERV().année);    
                intervention.setDATEFININTERV(datemp); 
                System.out.println("La date apres l'ajout:"+intervention.getDATEFININTERV().affichedate2());
                
            }
        }
      }

    private static ArrayList<EMPLOYE> getNbv() {
        return null;
    }
// la fin de la classe app
}