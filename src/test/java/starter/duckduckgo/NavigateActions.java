package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
//import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractions {

    @Step("Ir a DuckDuckGo")
    public void toTheDuckDuckGoSearchPage() {
        openUrl("https://duckduckgo.com/");
    }
}
