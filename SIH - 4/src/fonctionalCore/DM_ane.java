package fonctionalCore;

import static fonctionalCore.DB_Link.cnx;
import static fonctionalCore.DB_Link.connecterDB;
import static fonctionalCore.DB_Link.rst;
import static fonctionalCore.DB_Link.st;
import java.sql.SQLException;
import java.util.ArrayList;


/*
 * 
 */
public class DM_ane {

    public ArrayList<String> lobservation;

    public ArrayList<String> lprescription;

    public String lettreSortie;

    public ArrayList<Prestation> lPrestation;

    /**
     *
     * @element-type Patient
     */
    public void DM_ane() {
        lPrestation = new ArrayList<Prestation>();
        lobservation = new ArrayList<String>();
        lprescription = new ArrayList<String>();
    }

public static void AjouterPrescription(String prescri,int id_dmane,int id_dmcli){

  
    try{ 
        String query="INSERT INTO prescription(prescri) VALUE('"+prescri+"')";
        
/*TEST CONSOLE*/      System.out.println("La requete pour l'insertion d'une prescription : "+query);   
        cnx=connecterDB();
        st=cnx.createStatement();
        st.executeUpdate(query);
       
        // recupère l'id de la prescription
        String query2="Select id_prescription FROM prescription WHERE prescri=LOWER('"+prescri+"')";
        rst=st.executeQuery(query2);
        rst.next();
        int idDeLaPrescri =rst.getInt("id_prescription");
        
/*TEST console*/ System.out.println("id de la prescription : "+idDeLaPrescri);

       // lier a dm anesthesie
       
        String query3="INSERT INTO `prescription-iddmane`(`id_prescription`, `id_DMane`) VALUES("+idDeLaPrescri+","+id_dmane+")";
        st.executeUpdate(query3);System.out.println("execute");
        
        
         //laison avec dm clinique
    
    String query4="INSERT INTO `prescription-iddmcli`(`id_prescription`, `id_DMcli`) VALUES("+idDeLaPrescri+","+id_dmcli+")";
    st.executeUpdate(query4);
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    
   
    
}

/****************************AJOUTER OBSERVATION*********************************/

public static void AjouterObservation(String obs,int id_dmane,int id_dmcli, int id_dmmt){
    
    try{ 
        String query="INSERT INTO observation VALUE('"+obs+"')";
        
/*TEST CONSOLE*/      System.out.println("La requete pour l'insertion d'une observation : "+query);   
        cnx=connecterDB();
        st=cnx.createStatement();
        st.executeUpdate(query);
       
        // recupère l'id de l'observation
        String query2="Select id_observation FROM observation WHERE obs=LOWER('"+obs+"')";
        rst=st.executeQuery(query2);
        rst.next();
        int idDeLObs =rst.getInt("id_observation");
/*TEST console*/ System.out.println("id de l'observation : "+idDeLObs);

       // lier a dm anesthesie
       
        String query3="INSERT INTO observation-iddmane VALUES('"+idDeLObs+"','"+id_dmane+"')";
        st.executeUpdate(query3);
        
        
         //liaison avec dm clinique
    
    String query4="INSERT INTO observation-iddmcli  VALUES ('"+idDeLObs+"','"+id_dmcli+"')";
    st.executeUpdate(query4);
    
    // liaison avec dm medico tehnique
    
      String query5="INSERT INTO observation-iddmmt  VALUES ('"+idDeLObs+"','"+id_dmmt+"')";
    st.executeUpdate(query5);
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    
    
}
	
}
