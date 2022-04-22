package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos {
	WebDriver driver;

	public void abrirWebSite(String Url, String descricao) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://oiplace.com.br");

	}

	public void fecharWebSite() {

		driver.quit();

	}

	public void salvascreenShot(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Evidencias/" + fileName + ".png"));

	}

	public void clicarBanner(By el) {
		driver.findElement(el).click();
	}

	public void queroAderir(By el) {
		driver.findElement(el).click();
	}

	public void contratar(By el) {
		driver.findElement(el).click();
	}

	public void clicarCookies(By el) {
		driver.findElement(el).click();

	}

	public void clicarCookies1(By el) {
		driver.findElement(el).click();
	}

	public void preencherEmail(String dado, By el) {
		driver.findElement(el).sendKeys(dado);
	}

	public void clicaContinuar(By el) {
		driver.findElement(el).click();
	}

	public void comoFacoCartao(By el) {
		driver.findElement(el).click();

	}

	public String validaTexto(By el) {
		return driver.findElement(el).getText();
	}
}