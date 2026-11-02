package inheritance;

class MezzoConsegna {
  protected String targa;
  protected int kmPercorsi;

  MezzoConsegna(String targa, int kmPercorsi) {
    this.targa = targa;
    this.kmPercorsi = kmPercorsi;
  }
  String descrizione() {
    return "Targa: " + targa + " | Km Percorsi: " + kmPercorsi;
  }
}

class MezzoCostruzione {
  protected String nome;
  protected int oreLavoro;

  MezzoCostruzione(String nome, int oreLavoro) {
    this.nome = nome;
    this.oreLavoro = oreLavoro;
  }
  String descrizione() {
    return "Nome: " + nome + " | Ore lavorate: " + oreLavoro;
  }
}




class Furgone extends MezzoConsegna {
  private double portataKg;

  Furgone(String targa, int kmPercorsi, double portataKg) {
    super(targa, kmPercorsi);
    this.portataKg = portataKg;
  }
  @Override
  public String descrizione() {
    return super.descrizione() + " | Portata in KG: " + portataKg; 
  }
  public boolean daRevisione() {
    return kmPercorsi > 20_000;
  }
}

class Scooter extends MezzoConsegna {
  private int cilindrata;

  Scooter(String targa, int kmPercorsi, int cilindrata) {
    super(targa, kmPercorsi);
    this.cilindrata = cilindrata;
  }
  @Override
  public String descrizione() {
    return super.descrizione() + " | Cilindrata: " + cilindrata;
  }
  public boolean daRevisione() {
    return kmPercorsi >= 10_000;
  }
}

class FurgoneUso extends Furgone {
  private String utilizzo;

  FurgoneUso(String targa, int kmPercorsi, double portataKg, String utilizzo) {
    super(targa, kmPercorsi, portataKg);
    this.utilizzo = utilizzo;
  }
  @Override
  public String descrizione() {
    return super.descrizione() + " | Usato per: " + utilizzo;
  }
}



public class Esercizi2 {
  public static void main(String[] args) {

    MezzoConsegna mc1 = new MezzoConsegna("YY5467WU", 15_000);
    MezzoCostruzione mcos1 = new MezzoCostruzione("Gru", 1500);
    Furgone f1 = new Furgone("WW675II", 18_000, 5000);
    System.out.println("Da revisionare: " + f1.daRevisione());
    Scooter s1 = new Scooter("AA980BB", 10_000, 500);
    System.out.println("Da revisionare: " + s1.daRevisione());
    FurgoneUso fu1 = new FurgoneUso("AC123AC", 100_000, 15_000, "Alimenti");
    


    MezzoConsegna[] flotta = { mc1, f1, s1, fu1};
    for (MezzoConsegna m : flotta) {
      System.out.println(m.descrizione());

      /*
      Il for-each legge e usa ogni elemento (anche chiamando
      metodi sugli oggetti), ma non dà l'indice, non va
      all'indietro e non può rimpiazzare gli elementi.
      Per queste tre cose si usa il for classico.
      */
    }

    MezzoCostruzione[] squadra = { mcos1};
    for (MezzoCostruzione c : squadra) {
      System.out.println(c.descrizione());
    }
  }
}









