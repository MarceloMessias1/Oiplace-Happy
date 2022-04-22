package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	public By clicarBanner = By.xpath("//div[3]/ul/li[4]/a");
	public By clicarQueroAderir = By.xpath("//*[@id=\"col-header-home\"]/section/div/div[1]/div/button");
	public By clicarCookies = By.xpath("//body/div[2]//button");
	public By clicarContratar = By.xpath("//*[@href='https://www.oiplace.com.br/servicos/checkout/signin/4']");
	public By preencherEmail = By.id("email");
	public By clicarContinuar = By.xpath("//*[@id=\"__next\"]//button");

	public By clicarCookies1 = By.xpath("//body/div[2]//button");
	public By clicarComoFacoCartao = By.xpath("//*[@id=\"faq\"]/div[2]/div/div[1]");
	public By validatexto = By.xpath("//*[@id=\"collapse-2\"]//p");
}
