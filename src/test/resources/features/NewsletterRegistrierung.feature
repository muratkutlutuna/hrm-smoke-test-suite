#language: de
@SmokeTest
Funktionalität: Registrierung für Newsletter

  Regel: Benutzer kann sich für den Newsletter registrieren

    Hintergrund:
      Angenommen die Benutzer befindet sich auf der Startseite der Website
      Dann die Benutzer klickt aud den Datenschutzerklärung Taste

    Szenario: Benutzer registriert sich für den Newsletter
      Wenn der Benutzer auf den Support Link in der Navigationsleiste klickt
      Und der Benutzer auf den Newsletter Link hinten der Support link klickt
      Dann sollte der Newsletter Seite öffnen
      * der Benutzer wählt Herr aus dem Auswahlfeld aus
      * der Benutzer gibt seinen Namen "<name>" in das Name-Feld ein
      * der Benutzer gibt seinen Nachnamen "<nachname>" in das Nachname-Feld ein
      * der Benutzer gibt seine Firma "<firma>" in das Firma-Feld ein
      * der Benutzer gibt seine E-Mail-Adresse "<email>" in das E-Mail-Feld ein
      * der Benutzer wählt das Kontrollkästchen Datenschutzerklärung aus
      * der Benutzer wählt das Kontrollkästchen I'm not a robot aus
      Und der Benutzer klickt auf den Anmelden Taste
      Dann sollte der Benutzer eine Dankesnachricht erhalten


