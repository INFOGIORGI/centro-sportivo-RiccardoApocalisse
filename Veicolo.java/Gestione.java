import java.util.HashMap;
public class Gestione {
    private HashMap<String,Veicolo>veicoli;
    private HashMap<String,Proprietario>proprietari;

    public Gestione(){
        veicoli=new HashMap<>();

    }
    public boolean aggiungiVeicolo(String nTelaio){
        if(veicoli.containsKey(nTelaio)){
            Veicolo v=new Veicolo(nTelaio,marca,modello);
            veicoli.pur(nTelaio,v);
            return true;
        }
        return false;
    }
    public Veicolo getVeicolo(){
        
    }

    
}