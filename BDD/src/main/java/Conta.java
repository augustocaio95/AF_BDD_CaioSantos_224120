import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
    public void um_cliente_especial_com_saldo_atual_de_reais(int saldoAtual) throws Throwable {
        this.saldo = saldoAtual;
    }

    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_um_saque_no_valor_de_reais(int valorSaque) throws Throwable {
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
        }
    }

    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int novoSaldo) throws Throwable {
        // Verifica se o saldo foi atualizado corretamente
        if (this.saldo == novoSaldo) {
            System.out.println("Saque efetuado com sucesso. Saldo atual: " + this.saldo + " reais");
        } else {
            throw new Exception("Falha ao atualizar saldo da conta após saque.");
        }
    }

    @Then("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
        // Adicione aqui mais verificações de outros resultados desejados
    }
}
