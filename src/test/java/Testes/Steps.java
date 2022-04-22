package Testes;

import static org.junit.Assert.assertEquals;

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

	@When("clicar vai bem")
	public void clicar_vai_bem() {
		metodos.clicarBanner(el.clicarBanner);

	}

	@When("clicar como faco meu cartao vai bem")
	public void clicar_como_faco_meu_cartao_vai_bem() throws InterruptedException {
		Thread.sleep(4000);
		metodos.clicarCookies1(el.clicarCookies1);
		metodos.comoFacoCartao(el.clicarComoFacoCartao);
	}

	@Then("valido texto com informacao desejada")
	public void valido_texto_com_informacao_desejada() throws IOException {
		String validaTexto = metodos.validaTexto(el.validatexto);
		System.out.println(validaTexto);
		assertEquals(validaTexto,
				"Basta clicar em Contratar, preencher corretamente as etapas e você já garante a sua assinatura de Telemedicina Vai Bem de forma ilimitada. É super prático e totalmente seguro.");
		metodos.salvascreenShot("validar o texto esperado");
		metodos.fecharWebSite();
	}

}
