# Oracle Java Foundations (1Z0-811) — Study Guide & Exercises

Active study repository for the **Oracle Certified Foundations Associate, Java (`1Z0-811`)** exam, compiled and tested on **JDK 25** (`Temurin 25.0.3 LTS`) in VS Code.

All study guides, bilingual notes, and `76` Java source files are written in my own words and practice drills (including restaurant & kitchen-operations domain exercises alongside standard exam topics) — not copied Oracle slides or dumps.

---

## Repository Contents

| Path | Description |
| :--- | :--- |
| [`CORSO-Java-Foundations-1Z0-811.md`](CORSO-Java-Foundations-1Z0-811.md) | Structured study guide covering all 8 course modules + 1Z0-811 exam extras, `javac`-verified slide discrepancies, and a 30-question diagnostic self-test. |
| [`src/Glossario.md`](src/Glossario.md) | Personal EN/IT bilingual Java glossary mapping exam terminology to plain explanations and short code examples. |
| [`src/`](src/) | **`76` `.java` files** and **`24` module notes** (`Theory.md` / drills) organized by topic (see below). |

---

## Topics & Modules (`src/`)

- **Language Basics & Types:** `introductiontojava`, `creatingcompilingexecuting`, `asimplejavaapplication`, `variableconstantsandtypes`, `operators`, `workwithtextvalues`
- **Control Flow & Arrays:** `writeloops`, `arrays`
- **OOP & Methods:** `classesandobjects`, `constructors`, `methods`, `gettersetter`, `staticmembers`, `overload`, `codeaggregration`, `stage`
- **Inheritance, Interfaces & Exceptions:** `inheritance`, `abstractclasses`, `interfaces`, `exceptions`, `esameextra`, `ripassogenerale`, `ripassomirato`

---

## Compile & Run Locally

Requires **JDK 21+** (developed on **JDK 25**). From the `src/` directory:

```bash
cd src
javac <package>/<ClassName>.java
java <package>.<ClassName>
```

---

**Author:** Andrea Petrucci · [GitHub Profile](https://github.com/apetrucci90-rgb) · [KitchenMetrics (`kitchenmetrics-public`)](https://github.com/apetrucci90-rgb/kitchenmetrics-public)
