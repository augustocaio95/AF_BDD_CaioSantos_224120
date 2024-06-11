import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Esta classe representa os passos definidos para testes BDD 
 * usando Cucumber.
 * 
 * @author Caio Augusto Carvalho dos Santos
 */
public class Conta {

    /**
     * Dado um cliente especial com saldo atual negativo.
     *
     * @param arg1 Este é o primeiro parametro.
     * @throws PendingException Se o passo ainda não estiver implementado.
     */
    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
        // Código que transforma a frase acima em ações concretas
        throw new PendingException();
    }

    /**
     * Quando for solicitado um saque de um determinado valor.
     *
     * @param arg1 O valor do saque solicitado em reais.
     * @throws PendingException Se o passo ainda não estiver implementado.
     */
    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
        // Código que transforma a frase acima em ações concretas
        throw new PendingException();
    }

    /**
     * Então deve efetuar o saque e atualizar o saldo da conta.
     *
     * @param arg1 O saldo atualizado da conta em reais após o saque, deve ser um valor negativo.
     * @throws PendingException Se o passo ainda não estiver implementado.
     */
    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
        // Código que transforma a frase acima em ações concretas
        throw new PendingException();
    }

    /**
     * Então deve verificar outros resultados.
     *
     * @throws PendingException Se o passo ainda não estiver implementado.
     */
    @Then("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
        // Código que transforma a frase acima em ações concretas
        throw new PendingException();
    }
}
