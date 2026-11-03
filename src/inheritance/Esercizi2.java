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
  public boolean daRevisione() {
    return kmPercorsi > 20_000;
  }
  public double costoRevisione() {
    return 0;
  }
  @Override
  public String toString() {
    return descrizione();
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
  public double getPortataKg() {
    return portataKg;
  }
  @Override 
  public double costoRevisione() {
    return 150.0;
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
  @Override
  public boolean daRevisione() {
    return kmPercorsi >= 10_000;
  }
  @Override 
  public double costoRevisione() {
    return 40.0;
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

class Bicicletta extends MezzoConsegna {
  private String tipo;
  Bicicletta(String targa, int kmPercorsi, String tipo) {
    super(targa, kmPercorsi);
    this.tipo = tipo;
  }
  @Override
  public String descrizione() {
    return super.descrizione()+ " | Adatta per: " + tipo;
  }
}

class AutoElettrica extends MezzoConsegna {
  private int autonomiaKm;
  AutoElettrica(String targa, int kmPercorsi, int autonomiaKm) {
    super(targa, kmPercorsi);
    this.autonomiaKm = autonomiaKm;
  }
  @Override
  public String descrizione() {
    return super.descrizione() + " | Autonomia in km: " + autonomiaKm;
  }
  @Override
  public boolean daRevisione() {
    return kmPercorsi > 10_000;
  }
}

class FurgoneRefrigerato extends Furgone {
  private double temperatura;
  FurgoneRefrigerato(String targa, int kmPercorsi, int portataKg, double temperatura) {
    super(targa, kmPercorsi, portataKg);
    this.temperatura = temperatura;
  }
  @Override
  public String descrizione() {
    return super.descrizione() + " | Temperatura in °C: " + temperatura; 
  }
}



public class Esercizi2 {
  public static void main(String[] args) {

    MezzoConsegna mc1 = new MezzoConsegna("YY5467WU", 15_000);
    MezzoCostruzione mcos1 = new MezzoCostruzione("Gru", 1500);
    Furgone f1 = new Furgone("WW675II", 18_000, 5000);
    Scooter s1 = new Scooter("AA980BB", 10_000, 500);  
    FurgoneUso fu1 = new FurgoneUso("AC123AC", 100_000, 15_000, "Alimenti");
    Bicicletta b1 = new Bicicletta("AA456BB", 7_800, "Mountain Bike");
    AutoElettrica ae1 = new AutoElettrica("TT777TT", 120_000, 3000);
    FurgoneRefrigerato fr1 = new FurgoneRefrigerato("FF222FF", 14_000, 1000, 3.9);

    System.out.println(f1);
    System.out.println(fr1);

    MezzoConsegna[] flotta = { mc1, f1, s1, fu1, b1, fr1, ae1};

    int quanti = 0; // quanti mezzi da revisionare
    double totale = 0; // somma dei loro costi
    for (MezzoConsegna m : flotta) {
      System.out.println(m.descrizione());
      System.out.println(m.daRevisione());

      if (m.daRevisione()) {
        quanti++; // +1 al conteggio
        totale += m.costoRevisione(); // aggiungo il suo costo alla somma
      }
      if (m instanceof Furgone) {
        Furgone fg = (Furgone) m;
        System.out.println("Portata: " + fg.getPortataKg());
      }
      
      /*
      Il for-each legge e usa ogni elemento (anche chiamando
      metodi sugli oggetti), ma non dà l'indice, non va
      all'indietro e non può rimpiazzare gli elementi.
      Per queste tre cose si usa il for classico.
      */
    }

    System.out.println("Da revisionare: " + quanti + " mezzi, costo totale: " +
      totale + " euro");
    
    MezzoCostruzione[] squadra = { mcos1};
    for (MezzoCostruzione c : squadra) {
      System.out.println(c.descrizione());
    }
  }
}









