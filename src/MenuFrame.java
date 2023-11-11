import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MenuFrame extends JFrame { 
    private ArrayList<EMPLOYE> employes;
    private ArrayList<MARQUE> marques;
    private ArrayList<MODELE> modeles;
    private ArrayList<INTERVENTIONS> interventions;
    private ArrayList<CLIENT> clients;
    private ArrayList<VEHICULE> vehicules;
    private ArrayList<INTERVENANTS> intervenantsList;
   // private ArrayList<INTERVENTIONS> interventions;
    public MenuFrame( ArrayList<EMPLOYE> employes,ArrayList<MARQUE> marques,ArrayList<MODELE> modeles,ArrayList<INTERVENTIONS> interventions,ArrayList<CLIENT> clients,ArrayList<INTERVENANTS> intervenantsList,ArrayList<VEHICULE> vehicules) {
        super("DBA INTERVENTION SOFTWARE");
        this.interventions = interventions;
        this.modeles = modeles;
        this.marques = marques;
        this.employes = employes;
        this.clients = clients;
        this.vehicules = vehicules;
        this.intervenantsList = intervenantsList;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(new GridLayout(11, 1));

        JLabel titleLabel = new JLabel(("Veuillez sélectionner une option:").toUpperCase());
        add(titleLabel);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton option1Button = new JButton("1- Augmenter le salaire de Badi Hatem à 5000 DA");
        JButton option2Button = new JButton("2- Rajouter cinq jours pour les interventions du mois de Février");
        JButton option3Button = new JButton("3- Supprimer tous les véhicules du modèle 'Série 5'");
        JButton option4Button = new JButton("4- Lister les modèles et leur marque");
        JButton option5Button = new JButton("5- Lister les véhicules sur lesquels, il y a au moins une intervention");
        JButton option6Button = new JButton("6- Lister les employés dont le nom commence par un T");
        JButton option7Button = new JButton("7- Déterminer la liste des interventions faites par l'employé nommé LACHEMI");
        JButton option8Button = new JButton("8- Déterminer la liste des interventions faites en mois de Mars");
        JButton option9Button = new JButton("9- Lister les 3 employés ayant fait le plus d'interventions");
        JButton option10Button = new JButton("10- Lister les clients les plus fidèles");

        option1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                augmenterSalaireBadiHatem();
            }
        });

        option2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rajouterCinqJoursInterventionsFevrier();
            }
        });

        option3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                supprimerVehiculesModeleSerie5();
            }
        });

        option4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listerModelesEtMarque();
            }
        });

        option5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listerVehiculesAvecIntervention();
            }
        });

        option6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherEmployesAvecNomCommencantParT();
            }
        });

        option7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherInterventionsEmployeLachemi();
            }
        });

        option8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherInterventionsMoisMars();
            }
        });

        option9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listerTroisEmployesPlusInterventions();
            }
        });

        option10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listerClientsPlusFideles();
            }
        });

        add(option1Button);
        add(option2Button);
        add(option3Button);
        add(option4Button);
        add(option5Button);
        add(option6Button);
        add(option7Button);
        add(option8Button);
        add(option9Button);
        add(option10Button);
    }

    private void augmenterSalaireBadiHatem() {
        // Chercher l'employé Badi Hatem dans la liste des employés
        EMPLOYE employeBadiHatem = null;
        for (EMPLOYE employe : employes) {
            if (employe.getNOMEMP().equals("BADI") && employe.getPRENOMEMP().equals("Hatem")) {
                employeBadiHatem = employe;
                break;
            }
        }
        
        if (employeBadiHatem != null) {
            // Afficher le salaire avant l'augmentation
            String messageAvant = "Le salaire de Badi Hatem avant augmentation : " + employeBadiHatem.getSALAIRE();
            JOptionPane.showMessageDialog(this, messageAvant);
            
            // Augmenter le salaire de Badi Hatem
            employeBadiHatem.setSALAIRE(employeBadiHatem.getSALAIRE() + 5000);
            
            // Afficher le salaire après l'augmentation
            String messageApres = "Le salaire de Badi Hatem après augmentation : " + employeBadiHatem.getSALAIRE();
            JOptionPane.showMessageDialog(this, messageApres);
        } else {
            JOptionPane.showMessageDialog(this, "Employé Badi Hatem non trouvé");
        }
    }
    

    

   
    private void rajouterCinqJoursInterventionsFevrier() {
        // Parcourir la liste des interventions
        for (INTERVENTIONS intervention : App.interventions) {
            // Vérifier si l'intervention a lieu en février (mois == 2)
            if (intervention.getDATEDEBINTERV().getMois() == 2) {
                String messageAvant = "La date avant l'ajout : " + intervention.getDATEFININTERV().affichedate2();
                String messageApres;
                
                // Ajouter cinq jours à la date de fin de l'intervention
                Datep dateFinIntervention = intervention.getDATEFININTERV();
                Datep nouvelleDateFin = new Datep(dateFinIntervention.jour + 5, dateFinIntervention.getMois(), dateFinIntervention.année);
                intervention.setDATEFININTERV(nouvelleDateFin);
                
                messageApres = "La date après l'ajout : " + intervention.getDATEFININTERV().affichedate2();
                
                // Afficher les messages dans une fenêtre de dialogue
                JOptionPane.showMessageDialog(this, messageAvant + "\n" + messageApres);
            }
        }
    }
    

    private void supprimerVehiculesModeleSerie5() {
        boolean vehiculetrouve = false;
        Iterator<VEHICULE> iterator = vehicules.iterator();
        for (MODELE modele : modeles) {
            if (modele.getMODELE().equalsIgnoreCase("Serie 5")) {
                while (iterator.hasNext()) {
                    VEHICULE vehicule = iterator.next();
                    if (vehicule.getNUMMODELE() == modele.getNUMMODELE()) {
                        JOptionPane.showMessageDialog(this, "Ce véhicule est de modèle 'Serie 5': " + vehicule);
                        iterator.remove();
                        JOptionPane.showMessageDialog(this, "Véhicule supprimé");
                        vehiculetrouve = true;
                    }
                }
            }
        }
        if (!vehiculetrouve) {
            JOptionPane.showMessageDialog(this, "Aucun véhicule de modèle 'Serie 5' trouvé");
        }
    }
    

    private void listerModelesEtMarque() {
        StringBuilder message = new StringBuilder();
        
        // Parcourir la liste des modèles et des marques
        for (MODELE modele : modeles) {
            for (MARQUE marque : marques) {
                // Vérifier si le numéro de marque correspond
                if (modele.getNUMMARQUE() == marque.getNUMMARQUE()) {
                    message.append("Modèle : ").append(modele.getMODELE()).append(" | Marque : ").append(marque.getMARQUE()).append("\n");
                }
            }
        }
        
        // Afficher le message dans une fenêtre de dialogue
        JOptionPane.showMessageDialog(this, message.toString(), "Liste des modèles et marques", JOptionPane.INFORMATION_MESSAGE);
    }
    
    

   

    private void listerVehiculesAvecIntervention() {
        StringBuilder message = new StringBuilder();
        for (VEHICULE vehicule : vehicules) {
            for (INTERVENTIONS intervention : interventions) {
                if (vehicule.getNUMVEHICULE() == intervention.getNUMVEHICULE()) {
                    for (MODELE modele : modeles) {
                        if (vehicule.getNUMMODELE() == modele.getNUMMODELE()) {
                            message.append("Numéro du véhicule : ").append(vehicule.getNUMVEHICULE()).append("\n");
                            message.append("Modèle du véhicule : ").append(modele.getMODELE()).append("\n\n");
                            break;
                        }
                    }
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Liste des véhicules avec au moins une intervention:\n" + message.toString());
    }
    
    
    private void afficherEmployesAvecNomCommencantParT() {
        StringBuilder message = new StringBuilder();
        for (EMPLOYE employe : employes) {
            if (Character.toUpperCase(employe.getNOMEMP().charAt(0)) == 'T') {
                message.append(employe).append("\n");
            }
        }
        JOptionPane.showMessageDialog(this, "Liste des employés dont le nom commence par T:\n" + message.toString());
    }
    

    private void afficherInterventionsEmployeLachemi() {
        int numemploye = 0;
        //  Déterminer la liste des interventions faites par l'employé nommé LACHEMI
        StringBuilder message = new StringBuilder();
        message.append("Les interventions faites par l'employé nommé LACHEMI:\n");
    
        for (EMPLOYE employe : employes) {
            if (employe.getNOMEMP().equalsIgnoreCase("LACHEMI")) {
                numemploye = employe.getNUMEMPLOYE();
            }
        }
    
        for (INTERVENANTS intervenant : intervenantsList) {
            if (intervenant.getNUMEMPLOYE() == numemploye) {
                for (INTERVENTIONS intervention : interventions) {
                    if (intervention.getNUMINTERVENTION() == intervenant.getNUMINTERVENTION()) {
                        message.append(intervention).append("\n");
                    }
                }
            }
        }
    
        JOptionPane.showMessageDialog(this, message.toString());
    }
    

    private void afficherInterventionsMoisMars() {
        boolean bb = false;
        // Déterminer la liste des interventions faites en mois de Mars
        StringBuilder message = new StringBuilder();
        message.append("Les interventions faites en mois de Mars:\n");
    
        for (INTERVENTIONS intervention : interventions) {
            if (intervention.getDATEDEBINTERV().getMois() == 3) {
                message.append(intervention).append("\n");
                bb = true;
            }
        }
    
        if (!bb) {
            message.append("Aucune intervention en mois de Mars");
        }
    
        JOptionPane.showMessageDialog(this, message.toString());
    }
    
    private void listerTroisEmployesPlusInterventions(){
        JOptionPane.showMessageDialog(this, "Liste des 3 premiers employes avec plus d'intervention ");
    }
 
    private void listerClientsPlusFideles() {
        // Code pour lister les clients les plus fidèles
        JOptionPane.showMessageDialog(this, "Liste des clients les plus fidèles");
    }

    
}
