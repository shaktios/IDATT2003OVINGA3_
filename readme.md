# **Text Commands API**  

Dette prosjektet er et **enkelt tekstbehandlings-API** i Java, hvor man kan bruke ulike kommandoer for å manipulere tekst. Oppgaven er en del av faget **IDATT2003** ved NTNU.

## 📌 **Funksjonalitet**
- **TextCommand** (interface) – Grunnlaget for alle kommandoene.
- **ReplaceTextCommand** – Erstatter alle forekomster av en gitt tekst.
- **ReplaceFirstTextCommand** – Erstatter kun første forekomst.
- **WrapTextCommand** – Legger til en prefiks og en suffiks rundt en tekst.
- **WrapLinesTextCommand** – Legger til prefiks/suffiks på hver linje i en tekst.
- **WrapSelectionTextCommand** – Legger til prefiks/suffiks rundt en spesifikk del av en tekst.
- **CapitalizeTextCommand** – Gjør første bokstav i teksten stor.
- **CapitalizeWordsTextCommand** – Gjør første bokstav stor i alle ord i en tekst.
- **CapitalizeSelectionTextCommand** – Gjør **kun et spesifikt ord** stort i en tekst.
- **Script** – Kjede av kommandoer som kan utføres som en sekvens.

## 🚀 **Kjøring av prosjektet**
### **Krav**
- Java 21
- Maven  

### **Bygg og kjør tester**
```sh
mvn clean package
mvn test
