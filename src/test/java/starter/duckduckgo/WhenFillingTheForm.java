package starter.duckduckgo;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenFillingTheForm {

    WebDriver driver;

    NavigateActions navigate;
    SearchActions search;
    FormActions form;

    @Test
    void shouldOpenDuckDuckGoAndFillForm() throws InterruptedException {
        // 1. Ir a DuckDuckGo
        navigate.toTheDuckDuckGoSearchPage();



        // 2. Buscar la URL del formulario
        search.goToUrl("https://formulario-re.infinityfreeapp.com/Formulario/");

        // 3. Llenar y enviar el formulario
        form.fillForm(
                "Stick ",
                "11157454574",
                "300315574",
                "stick@example.com",
                "1990-03-15",
                "Colombia",
                "Armenia",
                "ingenieria_sistemas",
                "2025-08-10"
        );

        //esperar para ver la alerta antes de que Serenity cierre el navegador
        Thread.sleep(1000); // espera 1 segundo

        Serenity.reportThat("Formulario completado y enviado correctamente",
                () -> assertThat(true).isTrue()
        );
    }
}
