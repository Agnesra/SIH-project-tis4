/**************************************************************************************
                                                                                       
                      LA CLASSE SUIVANTE CORRESPOND A L'INTERFACES                     
                                D'ACCUEIL DES URGENCES                                 
                                                                                       
 *************************************************************************************/

package Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author camille
 */
public class URGENCE_Accueil extends javax.swing.JFrame {
    String nom_fichier_image = "Background02.png";
     
    
/****************************************************************
                            CONSTRUCTEUR                         
****************************************************************/ 
    public URGENCE_Accueil() {
        
        super("Connexion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(URGENCE_Accueil.MAXIMIZED_BOTH); 
        initComponents();
        Dimension sizeBckgrd = this.getSize();
        Label_bckgrd.setSize(sizeBckgrd);       
        pack();
        this.setVisible(true);
        Panel_Accueil.setVisible(true);
        URL resource = SA_Accueil.class.getResource("/Images/AccueilOn.png");
        Icon warnIcon = new ImageIcon(resource);
        Button_Accueil.setIcon(warnIcon);
        AccueilUrgenceCréerAdmission.setText("<html>Créer<br />Admission</html>");
        AccueilUrgenceVoirInfos.setText("<html>Voir<br/>Information</html>");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_Deconexion = new javax.swing.JButton();
        Button_Accueil = new javax.swing.JButton();
        Panel_Accueil = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AccueilUrgenceCréerPatient = new javax.swing.JButton();
        AccueilUrgenceCréerAdmission = new javax.swing.JButton();
        AccueilUrgenceVoirInfos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AccueilUrgenceRechercherPatient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AccueilPHTableau = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AccueilUrgenceNom = new javax.swing.JTextField();
        AccueilUrgencePrenom = new javax.swing.JTextField();
        AccueilUrgenceMois = new javax.swing.JTextField();
        AccueilUrgenceJour1 = new javax.swing.JTextField();
        AccueilUrgenceAnnee = new javax.swing.JTextField();
        AccueilUrgenceIPP = new javax.swing.JTextField();
        Label_bckgrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        Button_Deconexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Deconnexion.png"))); // NOI18N
        Button_Deconexion.setMaximumSize(new java.awt.Dimension(213, 213));
        Button_Deconexion.setMinimumSize(new java.awt.Dimension(213, 213));
        Button_Deconexion.setPreferredSize(new java.awt.Dimension(213, 213));
        Button_Deconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DeconexionActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Deconexion);
        Button_Deconexion.setBounds(180, 30, 60, 50);

        Button_Accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AccueilOff.png"))); // NOI18N
        Button_Accueil.setMaximumSize(new java.awt.Dimension(213, 213));
        Button_Accueil.setMinimumSize(new java.awt.Dimension(213, 213));
        Button_Accueil.setPreferredSize(new java.awt.Dimension(213, 213));
        Button_Accueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AccueilActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Accueil);
        Button_Accueil.setBounds(250, 30, 60, 50);

        Panel_Accueil.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AccueilUrgenceCréerPatient.setBackground(new java.awt.Color(255, 255, 255));
        AccueilUrgenceCréerPatient.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceCréerPatient.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceCréerPatient.setText("Créer Patient");
        AccueilUrgenceCréerPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccueilUrgenceCréerPatientActionPerformed(evt);
            }
        });

        AccueilUrgenceCréerAdmission.setBackground(new java.awt.Color(255, 255, 255));
        AccueilUrgenceCréerAdmission.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceCréerAdmission.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceCréerAdmission.setText("Créer Admission");
        AccueilUrgenceCréerAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccueilUrgenceCréerAdmissionActionPerformed(evt);
            }
        });

        AccueilUrgenceVoirInfos.setBackground(new java.awt.Color(255, 255, 255));
        AccueilUrgenceVoirInfos.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceVoirInfos.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceVoirInfos.setText("Voir Informations");
        AccueilUrgenceVoirInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccueilUrgenceVoirInfosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("NOM :");

        jLabel4.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Prénom :");

        jLabel5.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Date de Naissance :");

        jLabel6.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("IPP :");

        AccueilUrgenceRechercherPatient.setBackground(new java.awt.Color(255, 255, 255));
        AccueilUrgenceRechercherPatient.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceRechercherPatient.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceRechercherPatient.setText("Rechercher");
        AccueilUrgenceRechercherPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccueilUrgenceRechercherPatientActionPerformed(evt);
            }
        });

        AccueilPHTableau.setFont(new java.awt.Font("Arvo", 0, 11)); // NOI18N
        AccueilPHTableau.setForeground(new java.awt.Color(102, 102, 102));
        AccueilPHTableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
                {"", "", null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nom", "Prénom", "Date de Naissance"
            }
        ));
        jScrollPane2.setViewportView(AccueilPHTableau);

        jLabel7.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("//");

        jLabel8.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("//");

        AccueilUrgenceNom.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceNom.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceNom.setText("Nom");

        AccueilUrgencePrenom.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgencePrenom.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgencePrenom.setText("Prenom");

        AccueilUrgenceMois.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceMois.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceMois.setText("JJ");

        AccueilUrgenceJour1.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceJour1.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceJour1.setText("JJ");

        AccueilUrgenceAnnee.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceAnnee.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceAnnee.setText("JJ");

        AccueilUrgenceIPP.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        AccueilUrgenceIPP.setForeground(new java.awt.Color(102, 102, 102));
        AccueilUrgenceIPP.setText("IPP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(AccueilUrgenceVoirInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccueilUrgenceCréerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AccueilUrgenceCréerAdmission, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccueilUrgenceNom, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(AccueilUrgenceJour1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(16, 16, 16)
                                .addComponent(AccueilUrgenceMois, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(AccueilUrgenceAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AccueilUrgenceIPP))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AccueilUrgencePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 98, Short.MAX_VALUE)
                        .addComponent(AccueilUrgenceRechercherPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccueilUrgenceNom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccueilUrgencePrenom)
                    .addComponent(AccueilUrgenceRechercherPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AccueilUrgenceMois, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AccueilUrgenceJour1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AccueilUrgenceAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(AccueilUrgenceIPP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AccueilUrgenceCréerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccueilUrgenceCréerAdmission, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(AccueilUrgenceVoirInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Panel_AccueilLayout = new javax.swing.GroupLayout(Panel_Accueil);
        Panel_Accueil.setLayout(Panel_AccueilLayout);
        Panel_AccueilLayout.setHorizontalGroup(
            Panel_AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AccueilLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(103, 103, 103))
        );
        Panel_AccueilLayout.setVerticalGroup(
            Panel_AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AccueilLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        getContentPane().add(Panel_Accueil);
        Panel_Accueil.setBounds(260, 130, 1040, 580);

        Label_bckgrd.setFont(new java.awt.Font("Arvo", 0, 14)); // NOI18N
        Label_bckgrd.setForeground(new java.awt.Color(102, 102, 102));
        Label_bckgrd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background03.png"))); // NOI18N
        Label_bckgrd.setName("Label_bckgrd"); // NOI18N
        getContentPane().add(Label_bckgrd);
        Label_bckgrd.setBounds(0, -20, 1370, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  
    
/******************************************************
                        RETOUR ACCUEIL                 
 /****************************************************/ 
    private void Button_AccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AccueilActionPerformed
       Panel_Accueil.setVisible(true);
    //   PanelInfoPatient.setVisible(false);
    }//GEN-LAST:event_Button_AccueilActionPerformed


 /*****************************************************
                       DECONNEXION                     
 *****************************************************/  
    private void Button_DeconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DeconexionActionPerformed
        InterfaceConnexion connexion;
        try {
            connexion = new InterfaceConnexion();
            connexion.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(URGENCE_Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Button_DeconexionActionPerformed

    
/*****************************************************
                  RECHERCHER UN PATIENT               
*****************************************************/  
    private void AccueilUrgenceRechercherPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccueilUrgenceRechercherPatientActionPerformed

    }//GEN-LAST:event_AccueilUrgenceRechercherPatientActionPerformed

/*****************************************************
            VOIR INFO PATIENT SELECTIONNE             
*****************************************************/  
    private void AccueilUrgenceVoirInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccueilUrgenceVoirInfosActionPerformed
        URGENCE_Detail_Patient ur_detP =new URGENCE_Detail_Patient();
        ur_detP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AccueilUrgenceVoirInfosActionPerformed

    
/*****************************************************
      ADMISSION URGENCE DU PATIENT SELECTIONE         
*****************************************************/  
    private void AccueilUrgenceCréerAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccueilUrgenceCréerAdmissionActionPerformed
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Le patient est désormais hospitalisé en urgence.");
    }//GEN-LAST:event_AccueilUrgenceCréerAdmissionActionPerformed

    
/*****************************************************
           CREER UN NOUVEAU PATIENT EN URGENCE        
*****************************************************/   
    private void AccueilUrgenceCréerPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccueilUrgenceCréerPatientActionPerformed
        URGENCE_NewPatient ur_newp = new URGENCE_NewPatient();
        ur_newp.setVisible(true);
    }//GEN-LAST:event_AccueilUrgenceCréerPatientActionPerformed

    JDialog dialog2;
    JDialog dialog3;
    javax.swing.JComboBox prescriptions;
    javax.swing.JComboBox prescriptionsType;
    JTextField resultat;
    JTextField resultat2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AccueilPHTableau;
    private javax.swing.JTextField AccueilUrgenceAnnee;
    private javax.swing.JButton AccueilUrgenceCréerAdmission;
    private javax.swing.JButton AccueilUrgenceCréerPatient;
    private javax.swing.JTextField AccueilUrgenceIPP;
    private javax.swing.JTextField AccueilUrgenceJour1;
    private javax.swing.JTextField AccueilUrgenceMois;
    private javax.swing.JTextField AccueilUrgenceNom;
    private javax.swing.JTextField AccueilUrgencePrenom;
    private javax.swing.JButton AccueilUrgenceRechercherPatient;
    private javax.swing.JButton AccueilUrgenceVoirInfos;
    private javax.swing.JButton Button_Accueil;
    private javax.swing.JButton Button_Deconexion;
    private javax.swing.JLabel Label_bckgrd;
    private javax.swing.JPanel Panel_Accueil;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
