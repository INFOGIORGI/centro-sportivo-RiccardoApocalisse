import java.util.HashMap;

public class veicolo {

    private String ntelaio;
    private String modello;
    private String marca;
    private Proprietario p;
    private HashMap <String,Proprietario> proprietari;


public Veicolo(String nTelaio,String modello,String marca){
    this.telaio=telaio;
    this.modello=modello;
    this.marca=marca;
}
public addProprietario(Proprietario p){
    proprietari.put(p.getCf(),p);

}
}
