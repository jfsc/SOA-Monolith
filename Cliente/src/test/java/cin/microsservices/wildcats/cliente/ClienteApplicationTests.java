package cin.microsservices.wildcats.cliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.awt.List;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteApplicationTests {
	private Cliente cliente1 = new Cliente();
	private Cliente cliente2 = new Cliente();
	
	@Before
	public void inicia() {
		// Criando clientes
		cliente1.setId(1);
		cliente1.setNome("Carlos Melo");
		cliente1.setEmail("chnm@cin.ufpe.br");
		cliente2.setId(2);
		cliente2.setNome("Augusto Lima");
		cliente2.setEmail("arl4@cin.ufpe.br");
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

}
