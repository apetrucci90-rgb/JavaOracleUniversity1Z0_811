# GETTER e SETTER — teoria completa

I metodi GETTER (accessori) e SETTER (mutatori) sono lo strumento con cui si
implementa l'INCAPSULAMENTO (encapsulation) e l'INFORMATION HIDING, pilastri
della OOP.


## 1. COSA SONO

- GETTER (accessor): metodo che LEGGE un campo e lo restituisce. Nessun parametro.
- SETTER (mutator): metodo che SCRIVE un campo. Un parametro, restituisce void.
- Non sono parole chiave di Java: sono una CONVENZIONE. Il compilatore non li
  conosce; sono normali metodi che per nome e forma tutti riconoscono.


## 2. PERCHÉ ESISTONO: INCAPSULAMENTO

- Il campo si dichiara `private`: da fuori la classe non esiste, non è
  raggiungibile (niente `oggetto.campo`).
- L'unica porta per leggere/scrivere diventano i metodi `public` (get/set).
- Questo separa COSA fa la classe (interfaccia pubblica) da COME lo fa dentro
  (campi privati). Dentro posso cambiare tutto; fuori nessuno se ne accorge.


## 3. IL PROBLEMA SENZA INCAPSULAMENTO (campo public)

Se scrivessi `public double stipendio;` chiunque potrebbe fare:

    cuoco.stipendio = -5000;   // valore assurdo, nessun controllo

- Nessun controllo sul valore: l'oggetto va in uno stato incoerente.
- Se un domani cambio come memorizzo il dato (es. stipendio in centesimi), ogni
  riga che toccava `cuoco.stipendio` si rompe. Con i metodi, cambio solo dentro.


## 4. LA FORMA CANONICA

    private double prezzo;

    public double getPrezzo() {        // getter: TIPO get+Campo(), niente parametri
        return prezzo;
    }

    public void setPrezzo(double prezzo) {   // setter: void set+Campo(TIPO)
        this.prezzo = prezzo;
    }


## 5. CONVENZIONI DI NOME

- getter: `get` + Campo con iniziale MAIUSCOLA → `getPrezzo`, `getNome`.
- setter: `set` + Campo con iniziale maiuscola → `setPrezzo`.
- boolean: il getter è `isCampo()` (es. `isVegano`), MA il setter resta
  `setVegano`.
- Il campo resta minuscolo; la maiuscola dopo get/set/is marca il confine
  (camelCase). Vale anche se il campo inizia già minuscolo.


## 6. this E LO SHADOWING

- Se il parametro ha lo STESSO nome del campo, dentro il metodo è visibile solo
  il parametro: SHADOWA (oscura) il campo.
- `this` = riferimento all'oggetto corrente.
  `this.prezzo` = il CAMPO;  `prezzo` (nudo) = il PARAMETRO.
- `this.prezzo = prezzo;` → campo = parametro. Risolve lo shadowing.
- Senza clash di nomi `this` è opzionale (`return prezzo;` == `return this.prezzo;`).


## 7. COSA CI GUADAGNO DAVVERO

Un campo public dà lettura e scrittura "nude". Getter/setter aggiungono LOGICA:

- VALIDAZIONE: il setter rifiuta o corregge valori (`if (p > 0) ...`).
- PROPRIETÀ CALCOLATA: il getter CALCOLA invece di leggere, senza un campo
  dietro (es. `getPrezzoIvato()` = prezzo * 1.1).
- SOLA LETTURA / SOLA SCRITTURA: metto solo il getter (read-only) o solo il
  setter (write-only).
- TRASFORMAZIONE: `getPrezzo()` che arrotonda; un getter che torna una COPIA
  per non far modificare la struttura interna.
- PUNTO UNICO DI CONTROLLO: logging, notifiche, ricalcoli li metto nel setter
  e valgono per tutto il programma, una volta sola.


## 8. NON È OBBLIGATORIO UNO PER OGNI CAMPO

- Getter/setter su ogni campo "per abitudine" riespone i dati come se fossero
  public: incapsulamento solo di facciata.
- Si mettono dove servono davvero. Un campo che non deve cambiare da fuori NON
  ha setter; uno interno può non avere nessuno dei due.


## 9. TRABOCCHETTI

- COPIA DIFENSIVA: se il campo è un oggetto MUTABILE (array, lista, data),
  restituirlo diretto dal getter fa modificare lo stato interno da fuori.
  Restituisci una copia; nel setter, salva una copia.
- Niente logica pesante nascosta: chi chiama si aspetta un accesso rapido, non
  una query al database dentro un getter.
- Null-safe: `"kg".equals(unit)` (costante prima) invece di `unit.equals("kg")`:
  non lancia NullPointerException se `unit` è null.


## 10. RAPPORTO COL COSTRUTTORE (anticipazione)

- Il costruttore INIZIALIZZA i campi alla nascita dell'oggetto; il setter li
  CAMBIA dopo. Spesso il costruttore chiama i setter per riusare la stessa
  validazione in un punto solo (DRY).
