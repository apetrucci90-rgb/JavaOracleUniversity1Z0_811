# Drill ABSTRACT — Figure geometriche (schema 10)

Obiettivo: imparare `abstract class` + metodi astratti.
Padre astratto `Figura` (non istanziabile) con `area()` e `perimetro()` ASTRATTI
(il padre NON sa calcolarli) + `descrizione()` CONCRETO (li chiama -> polimorfismo).

Schema fisso per ogni figlia (modello = Cerchio):
campi `private` -> costruttore con `super("Nome")` -> `@Override area()` -> `@Override perimetro()`.

## Stato
- [x] 1  Cerchio              (modello, fatto)
- [x] 2  Quadrato
- [x] 3  Rettangolo
- [x] 4  TriangoloRettangolo
- [x] 5  TriangoloEquilatero
- [ ] 6  Rombo
- [ ] 7  Parallelogramma
- [ ] 8  Trapezio
- [ ] 9  PentagonoRegolare
- [ ] 10 EsagonoRegolare
- [ ] main (classe Esercizi1)

## Tabella figure
| #  | Classe              | Campi (private)                            | area                     | perimetro                                             |
|----|---------------------|--------------------------------------------|--------------------------|-------------------------------------------------------|
| 1  | Cerchio             | raggio                                     | PI*r*r                   | 2*PI*r                                                 |
| 2  | Quadrato            | lato                                       | lato*lato                | 4*lato                                                 |
| 3  | Rettangolo          | base, altezza                              | base*altezza             | 2*(base+altezza)                                      |
| 4  | TriangoloRettangolo | cateto1, cateto2                           | cateto1*cateto2/2        | cateto1+cateto2+Math.sqrt(cateto1*cateto1+cateto2*cateto2) |
| 5  | TriangoloEquilatero | lato                                       | lato*lato*Math.sqrt(3)/4 | 3*lato                                                 |
| 6  | Rombo               | diag1, diag2, lato                         | diag1*diag2/2            | 4*lato                                                 |
| 7  | Parallelogramma     | base, altezza, latoObliquo                 | base*altezza             | 2*(base+latoObliquo)                                  |
| 8  | Trapezio            | baseMag, baseMin, altezza, lato1, lato2    | (baseMag+baseMin)*altezza/2 | baseMag+baseMin+lato1+lato2                        |
| 9  | PentagonoRegolare   | lato, apotema                              | perimetro()*apotema/2    | 5*lato                                                 |
| 10 | EsagonoRegolare     | lato, apotema                              | perimetro()*apotema/2    | 6*lato                                                 |

Math.sqrt(x) = radice quadrata. Serve SOLO in #4 (ipotenusa) e #5 (radice di 3).
#9 e #10: in area() si puo' richiamare perimetro() (come il padre chiama i suoi metodi).

## main (classe Esercizi1) — 3 obiettivi
1. Prova a scrivere `new Figura("x")`, poi commentala e scrivi accanto l'errore
   del compilatore (prova che `abstract` blocca l'istanza del concetto).
2. Array polimorfico `Figura[] figure = { ... };` con tutte e 10 -> for-each che
   stampa `f.descrizione()`.
3. Somma le aree in un `double totale` (stesso pattern del conteggio flotta in
   inheritance/Esercizi2.java righe 185-193) e stampala.

Trappole viste: copia-incolla che lascia formule sbagliate (Math.PI nel Quadrato);
scordare `extends Figura` sulla classe figlia (grappolo di 3 errori con una sola causa).
