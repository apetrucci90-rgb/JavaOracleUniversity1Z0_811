
1. COSA SONO

- GETTER (accessor): metodo che LEGGE un campo e lo restituisce. Nessun parametro

- SETTER (mutator): metodo che SCRIVE un campo. Un parametro, torna void.

2. PERCHE' ESISTONO: INCAPSULAMENTO

- Il campo si dichiara private: da fuori la classe non esiste, non è raggiungibile (niente oggetto.campo)
- L'unica porta per leggere/scrivere diventano i metodi public (get/set).
- Separa COSA fa la classe (interfaccia pubblica) da COME lo fa dentro (campi privati). Dentro posso canmbiare tutto, fuori nessuno se ne accorge.

3. IL PROBLEMA, SENZA INCAPSULAMENTO (campo public)

cuoco.stipendio = -5000; 

Nessun controllo sul valore: l'oggetto va in uno stato incoerente.

4. LA FORMA CANONICA

private double prezzo;

public double getPrezzo() { return prezzo; }

public void setPrezzo(double prezzo) { this.prezzo = prezzo }

5. CONVENIONI DI NOME
- getter: get + campo con iniziale maiuscola -> getPrezzo, getNome
- setter: set + campo con iniziale maiscola -> setPrezzo, setNome
- boolean: il getter è isCampo(), ma il setter resta setCampo
- il campo resta minuscolo, la maiuscola dope get/set/is marca il confine. Vale anche se il campo inizia già con maiuscolo

6. this E LO SHADOWING



