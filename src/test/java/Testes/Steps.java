package Testes;

import java.io.IOException;

import javax.swing.text.html.parser.Element;

import Pages.Metodos;
import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String string) throws Exception {
		metodos.abrirWebSite(string, string);
	}

	@When("que eu clica no banner vai bem")
	public void que_eu_clica_no_banner_vai_bem() {
		metodos.clicarBanner(el.clicarBanner);

	}

	@When("clique em quero aderir")
	public void clique_em_quero_aderir() {
		metodos.queroAderir(el.clicarQueroAderir);
		metodos.clicarCookies(el.clicarCookies);
	}

	@When("clique em contratar")
	public void clique_em_contratar() throws InterruptedException {
		Thread.sleep(4000);
		metodos.contratar(el.clicarContratar);

	}

	@When("inserir email invalido")
	public void inserir_email_invalido() {
		metodos.preencherEmail("1223", el.preencherEmail);
	}

	@Then("sistema emitira aviso de advertencia")
	public void sistema_emitira_aviso_de_advertencia() throws IOException {
		metodos.clicaContinuar(el.clicarContinuar);
		metodos.salvascreenShot("Advertência email válido");
		metodos.fecharWebSite();
	}

}
