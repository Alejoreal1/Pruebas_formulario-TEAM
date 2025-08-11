package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
//import net.thucydides.core.annotations.Step;

public class SearchActions extends UIInteractions {

    @Step("Ir a la URL: {0}")
    public void goToUrl(String url) {
        getDriver().get(url);
    }
}
