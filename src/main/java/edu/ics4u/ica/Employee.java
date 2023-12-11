
public class Singleton {
    private static Singleton instance;
    private String data;
    private int id;// in case another attribut is needed fpr later(maybe more complexe?)

    private Singleton(String data) {
        this.data = data;
    }

    /**
     * declaration d'une classe statique privé appelé instance
     * et j'ai caché le constructeur de la classe Employee en déclarant un
     * constructeur privé
     * pour empêcher l'initiation de la classe de l'extérieur.
     */
    /**
     * @param data
     * @return
     * 
     */
    public static Singleton getInstance(String data) {
        // Si l'objet vient d'être initialisé pour la premier fois le "if statement" va
        // être appliquer plus l'object va avoir une noucvelle instance
        if (instance == null) {
            instance = new Singleton(data);
        }
        // Si l'objet à déjà était créee la méthode va juste le retourne telle qu'il
        // était, sans aucune nouvelle initialisation
        return instance;
    }

}