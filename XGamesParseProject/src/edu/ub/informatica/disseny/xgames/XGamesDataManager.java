package edu.ub.informatica.disseny.xgames;

import java.util.ArrayList;

/**
 * Data manager per XGames_Soft. Crea les estructures de dades necessàries 
 * per a manegar l'aplicació de gestió de XGames_Soft.
 * 
 */
public class XGamesDataManager {
    private ArrayList<UsuariLogat> usuaris;
    private ArrayList<Esport> esports;
    private ArrayList<Pais> paisos;
    private UsuariLogat usuariLogat;
    public XGamesDataManager(){
        usuaris = new ArrayList();
        esports = new ArrayList();
        paisos = new ArrayList();
        usuariLogat = null;
    
    }

	/* -------------------------------------------------------------------
	 * Metodes a implementar per vosaltres. En aquests metodes creareu els
	 * vostres objectes a partir de la informacio obtinguda del fitxer XML
	 * 
	 * Podeu esborrar els prints si voleu. Tambe podeu canviar el tipus de
	 * dades que retorna el metode, es a dir que sou lliures de
	 * modificar-ho al gust, excepte les crides inicials que es fan.
	 * -------------------------------------------------------------------
	 */

	/**
	 * Obté les dades del fitxer XML passat per paràmetre
	 * 
	 * @param nomFitxer ruta del fitxer XML del que obtenir les dades
	 */
	public void obtenirDades(String nomFitxer) {
		XGamesXMLParser parser = new XGamesXMLParser(this);
		parser.parse(nomFitxer);
	}

	 /**
	 * Crea un nou esport a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de l'esport
	 * @param nom de l'esport
	 */	
	public void crearEsport(String id, String nom) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'un nou esport
		 */

                System.out.println("\n==================================================");
		System.out.println("Esport amb ID: " + id);
		System.out.println("    Nom: " + nom);
	}
        
        
        /**
	 * Crea una nova disciplina a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de la disciplina
	 * @param nom de la disciplina
	 */	
	public void crearDisciplina(String id, String nom) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui
                 * la informacio d'una nova disciplina.
		 */
                System.out.println("    ______________________________________________");
		System.out.println("    Disciplina amb ID: " + id);
		System.out.println("        Nom: " + nom);
	}
        
        /**
	 * Crea una nova prova a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de la prova
	 * @param lloc on es realitza la prova
         * @param jutge assignat a la prova
         * @param data de la prova
	 */
	public void crearProva(String id, String jutge, String lloc, String data) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'una nova prova.
		 */

                System.out.println("    . . . . . . . . . . . . . . . . . . . . . . .");
                System.out.println("    Prova amb ID: " + id);
                System.out.println("        Jutge ID " + jutge);
		System.out.println("        Lloc: " + lloc);
                System.out.println("        Data: " + data);
	}
        

	/**
	 * Afegeix un Esportista a una prova en concret, la informacio obtinguda del fitxer XML és el identificador de l'esportista participant i el Id de la prova
	 * 
         * @param idEsportista dni de l'esportista participant
	 * @param idProva id de la prova on participa aquest esportista
	 * 
	 */
	public void afegeixEsportistaAProva(String idEsportista, String idProva)
        {       
                /* TODO: Creeu aqui el vostre codi per relacionar els objectes 
                 * esportista i prova
		 */

		System.out.println("\nProva ID : " + idProva);
		System.out.println("-----------------");
		System.out.println("ID Esportista: " + idEsportista);
                                       
        }      
         
	/**
	 * Crea un nou admin a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id del administrador
	 * @param nom de l'administrador
         * @param dni de l'administrador
	 * @param usuari nom d'usuari de l'administrador
	 * @param password de l'administrador
         * @param data de naixement de l'administrador
         * @param pais de naixement de l'administrador
	 */
	public void crearAdmin(String id, String nom, String dni, String usuari, String password, String data, String pais) {

		/* TODO: Creeu aqui el vostre admin
		 */
                System.out.println("\n==================================================");
		System.out.println("Admin ID: " + id);
		System.out.println("-----------------");
		System.out.println("Nom: " + nom);
		System.out.println("DNI: " + dni);
                System.out.println("Nom: " + usuari);
		System.out.println("Password: " + password);
                System.out.println("Data naixement: " + data);
                System.out.println("Pais: " + pais);
	}

	/**
	 * Crea un nou usuari a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de l'usuari
	 * @param nom de l'usuari
	 * @param dni de l'usuari
	 * @param adreca de l'usuari
	 * @param usuari nom d'usuari de l'usuari
	 * @param password de l'usuari
         * @param data de naixement de l'usuari
         * @param pais de naixement de l'usuari
	 
	 */
	public void crearUsuari(String id, String nom, String dni, String adreca, String usuari, String password, String data, String pais) {

		/* TODO: Creeu aqui el vostre usuari
		 */

                System.out.println("\n==========================-========================");
                System.out.println("Usuari ID: " + id);
		System.out.println("-----------------");
		System.out.println("Nom: " + nom);
		System.out.println("Nom d'usuari: " + usuari);
		System.out.println("Dni: " + dni);
		System.out.println("Adreça: " + adreca);
		System.out.println("Password: " + password);
                System.out.println("Data naixement: " + data);
                System.out.println("Pais: " + pais);
	}
        
        /**
	 * Crea un nou jutge a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id del jutge
	 * @param nom del jutge
	 * @param dni del jutge
	 * @param adreca del jutge
	 * @param usuari nom d'usuari del jutge
	 * @param password  del jutge
         * @param pais de naixement del jutge
         * @param any d'inici com a jutge
	 */
	public void crearJutge(String id, String nom, String dni, String adreca, String usuari, String password, String pais, String any) {

		/* TODO: Creeu aqui el vostre jutge
		 */

                System.out.println("\n==================================================");
                System.out.println("Jutge ID: " + id);
		System.out.println("-----------------");
		System.out.println("Nom: " + nom);
		System.out.println("Nom d'usuari: " + usuari);
		System.out.println("Dni: " + dni);
		System.out.println("Adreça: " + adreca);
		System.out.println("Password: " + password);
		System.out.println("Pais: " + pais);
		System.out.println("Any d'inici: " + any);
	}
        
        /**
	 * Crea un nou esportista a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id de l'esportista
	 * @param nom nom de l'esportista
	 * @param dni dni de l'esportista
	 * @param adreca adreça de l'esportista
	 * @param usuari usuari al sistema de l'esportista
	 * @param password password de l'esportista
         * @param data de naixement de l'esportista
	 * @param pais de naixement de l'esportista
	 */
	public void crearEsportista(String id, String nom, String dni, String adreca, String data, String pais) {

		/* TODO: Creeu aqui el vostre esportista
		 */

                System.out.println("\n==================================================");
                System.out.println("Esportista ID: " + id);
		System.out.println("-----------------");
		System.out.println("Nom: " + nom);
		System.out.println("Dni: " + dni);
		System.out.println("Adreça: " + adreca);
		System.out.println("Pais: " + pais);
		System.out.println("Data de naixement: " + data);
	}
}
