package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public Button configurationButton = new Button(By.xpath("//button[contains(@class,'top_bar_btn settings_btn')]"));
}
