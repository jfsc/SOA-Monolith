package cin.microsservices.wildcats.cliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.awt.List;
import java.io.Console;
import java.util.ArrayList;

import org.hamcrest.core.Is;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cin.microsservices.wildcats.cliente.domain.cliente.Cliente;
import cin.microsservices.wildcats.cliente.rest.ClienteRestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteApplicationTests {
	private Cliente cliente1 = new Cliente();
	private Cliente cliente2 = new Cliente();
	private Cliente cliente3 = new Cliente();
	private Cliente cliente4 = new Cliente();
	private ClienteRestService clientRest = new ClienteRestService();
	
	@Before
	public void inicia() {
		// Criando clientes
		cliente1.setId(1);
		cliente1.setNome("Carlos Melo");
		cliente1.setEmail("chnm@cin.ufpe.br");
		cliente2.setId(2);
		cliente2.setNome("Augusto Lima");
		cliente2.setEmail("arl4@cin.ufpe.br");
		cliente3.setId(3);
		cliente3.setNome("Pedro Neto");
		cliente3.setEmail("pjsn@cin.ufpe.br");
		cliente4.setId(4);
		cliente4.setNome("Rafael Jodão");
		cliente4.setEmail("rfpj@cin.ufpe.br");
		

		clientRest.addCliente(cliente1);
		clientRest.addCliente(cliente2);
		clientRest.addCliente(cliente3);
		clientRest.addCliente(cliente4);
	}
	
	/**
	 * Teste simples de criação de clientes utilizando a classe cliente
	 * e averiguando se este retorna os valores de forma correta e concreta.
	 * 12/11/2017
	 */
	
	@Test
	public void testCriancaoClient() {
		
		
		
		//=================Verificação====================		
		assertThat(cliente1.getId(), is(Long.valueOf(1)));
		assertThat(cliente1.getEmail(), is("chnm@cin.ufpe.br"));
		assertThat(cliente1.getNome(), is("Carlos Melo"));
		assertEquals(Cliente.class, cliente1.getClass());
		
	}
	/**
	 * Testando class clientrest.
	 * e averiguando se este retorna os valores de forma correta dos clientes adicionados.
	 * 15/11/2017
	 */
	@Test
	public void testClientRestGetCliente() {
				
		Cliente cliente;
		cliente = clientRest.getCliente(Long.valueOf(1));
		//=================Verificação====================		
		assertThat(cliente.getId(), is(Long.valueOf(1)));
		assertThat(cliente.getNome(), is("Carlos Melo"));
		
	}
	/**
	 * Testando deleteCLiente da classe CienteRest
	 * averiguando se ao procurar cliente deletado é dado erro de NullPointer.
	 * 15/11/2017
	 */
	@Test
	public void testClientRestDelCliente() {
		
		clientRest.deleteCliente(Long.valueOf(1));
		
		Cliente cliente;
		
		//=================Verificação====================	
		try {
		cliente = clientRest.getCliente(Long.valueOf(1));
		fail();
		}
		catch (Exception e) {
			//Se não vir para o catch, quer dizer que encontrou o cliente
			//se encontrou então não deletou.
		}
			
		
		
	}
	/**
	 * Testando Atualizar valores de um cliente inserido no ClienteRest
	 * esperado que o update ocorra.
	 * 15/11/2017
	 */
	@Test
	public void testClientRestUpdateCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(2);
		cliente.setNome("Gutin do Borel");
		cliente.setEmail("arl4@cin.ufpe.br");
		clientRest.mergeCliente(cliente);
		Cliente testee;
		testee = clientRest.getCliente(Long.valueOf(2));
		//=================Verificação====================	
		assertThat(testee.getNome(),is("Gutin do Borel"));
		
	}
	/**
	 * Testando Atualizar valores de um cliente inserido no ClienteRest
	 * esperado que o update de erro
	 * 15/11/2017
	 */
	@Test
	public void testClientRestNotUpdateCliente() {
		Cliente clienteTest = new Cliente();
		clienteTest.setId(6);
		clienteTest.setNome("Carlin do Borel");
		clienteTest.setEmail("chnm@cin.ufpe.br");
		
		//=================Verificação====================	
		try {
			clientRest.mergeCliente(clienteTest);
			fail();
		}
		catch (Exception e) {
			//Se não vir para o catch, quer dizer que atualizou
			// um cliente não existente
		}
		
	}
	/**
	 * Testando adicionar um cliente com um id que já existe.
	 * esperado que o addClient ocorra.
	 * 15/11/2017
	 */
	@Test
	public void testClientRestNotAddClient() {
		Cliente clienteTest = new Cliente();
		clienteTest.setId(2);
		clienteTest.setNome("Carlin do Borel");
		clienteTest.setEmail("chnm@cin.ufpe.br");
		
		//=================Verificação====================	
		try {
			clientRest.addCliente(clienteTest);
			fail();
		}
		catch (Exception e) {
			//Se não vir para o catch, quer dizer que adicionou
			// um cliente que o id já existe.
		}
		
	}

}
