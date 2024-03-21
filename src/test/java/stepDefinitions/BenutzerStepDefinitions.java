package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.de.Angenommen;
import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Wenn;
import org.junit.Assert;
import pages.MainPage;
import pages.NavBarPage;
import pages.NewsletterPage;
import utilities.ConfigurationReader;
import utilities.Driver;


import java.sql.SQLOutput;
import java.util.Locale;

public class BenutzerStepDefinitions {
    NavBarPage navBarPage = new NavBarPage();
    NewsletterPage newsletterPage = new NewsletterPage();
    MainPage mainPage = new MainPage();
    Faker faker = new Faker(new Locale("ch-DE"));
    @Angenommen("die Benutzer befindet sich auf der Startseite der Website")
    public void die_benutzer_befindet_sich_auf_der_startseite_der_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlDe"));
    }
    @Dann("die Benutzer klickt aud den Datenschutzerklärung Taste")
    public void dieBenutzerKlicktAudDenDatenschutzerklärungTaste() {
        mainPage.datenschutzerklaerungTaste.click();
    }
    @Wenn("der Benutzer auf den Support Link in der Navigationsleiste klickt")
    public void der_benutzer_auf_den_support_link_in_der_navigationsleiste_klickt() {
        navBarPage.support.click();
    }
    @Wenn("der Benutzer auf den Newsletter Link hinten der Support link klickt")
    public void der_benutzer_auf_den_newsletter_link_hinten_der_support_link_klickt() {
        navBarPage.newsletter.click();
    }
    @Dann("sollte der Newsletter Seite öffnen")
    public void sollte_der_newsletter_seite_öffnen() {
        String expectedOutput = "Anmeldung Newsletter";
        Assert.assertTrue(newsletterPage.anmeldungNewsletter.getText().contains(expectedOutput));
    }
    @Dann("der Benutzer wählt Herr aus dem Auswahlfeld aus")
    public void der_benutzer_wählt_herr_aus_dem_auswahlfeld_aus() {
        newsletterPage.herrRadio.click();
    }
    @Dann("der Benutzer gibt seinen Namen {string} in das Name-Feld ein")
    public void der_benutzer_gibt_seinen_namen_in_das_name_feld_ein(String string) {
        String vorname = faker.name().firstName();
        newsletterPage.vorname.sendKeys(vorname);
    }
    @Dann("der Benutzer gibt seinen Nachnamen {string} in das Nachname-Feld ein")
    public void der_benutzer_gibt_seinen_nachnamen_in_das_nachname_feld_ein(String string) {
        String nachname = faker.name().lastName();
        newsletterPage.nachname.sendKeys(nachname);
    }
    @Dann("der Benutzer gibt seine Firma {string} in das Firma-Feld ein")
    public void der_benutzer_gibt_seine_firma_in_das_firma_feld_ein(String string) {
        String firma = faker.company().name();
        newsletterPage.firma.sendKeys(firma);
    }
    @Dann("der Benutzer gibt seine E-Mail-Adresse {string} in das E-Mail-Feld ein")
    public void der_benutzer_gibt_seine_e_mail_adresse_in_das_e_mail_feld_ein(String string) {
        String email = faker.internet().emailAddress();
        newsletterPage.email.sendKeys(email);
    }
    @Dann("der Benutzer wählt das Kontrollkästchen Datenschutzerklärung aus")
    public void der_benutzer_wählt_das_kontrollkästchen_datenschutzerklärung_aus() {
        newsletterPage.datenschutzBox.click();
    }
    @Dann("der Benutzer wählt das Kontrollkästchen I'm not a robot aus")
    public void der_benutzer_wählt_das_kontrollkästchen_i_m_not_a_robot_aus() {
        Driver.getDriver().switchTo().frame(newsletterPage.noRobotIframe);
        newsletterPage.noRobotCheckbox.click();
        System.out.println("==========================================================");
        System.out.println("======== Bitte behandeln Sie selbst den Captcha, =========");
        System.out.println("=================== dann warten Sie bitte ================");
        System.out.println("==========================================================");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Driver.getDriver().switchTo().defaultContent();
    }
    @Dann("der Benutzer klickt auf den Anmelden Taste")
    public void der_benutzer_klickt_auf_den_anmelden_taste() {
        newsletterPage.anmeldenTaste.click();
    }
    @Dann("sollte der Benutzer eine Dankesnachricht erhalten")
    public void sollte_der_benutzer_eine_dankesnachricht_erhalten() {
        String actualResult = newsletterPage.dankeschoenNachricht.getText();
        Assert.assertTrue(actualResult.contains("Vielen Dank"));
    }


}
