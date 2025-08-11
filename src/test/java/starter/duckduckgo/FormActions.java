package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
//import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class FormActions extends UIInteractions {

    @Step("Llenar formulario con datos")
    public void fillForm(String nombre, String cedula, String telefono, String email,
                         String fechaNacimiento, String pais, String ciudad,
                         String carrera, String fechaInscripcion) {

        // Ir directo al formulario (desde resultados de búsqueda)
        openUrl("https://formulario-re.infinityfreeapp.com/Formulario/");

        $(By.id("name")).sendKeys(nombre);
        $(By.id("Cedula")).sendKeys(cedula);
        $(By.id("Telefono")).sendKeys(telefono);
        $(By.id("email")).sendKeys(email);
        $(By.id("Fecha_N")).sendKeys(fechaNacimiento);
        $(By.id("Pais")).sendKeys(pais);
        $(By.id("ciudad")).sendKeys(ciudad);
        $(By.id("carrera")).selectByValue(carrera);
        $(By.id("fecha_I")).sendKeys(fechaInscripcion);

        $(By.id("boton_enviar")).click();
    }
}
