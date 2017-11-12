package cin.microsservices.wildcats.cliente;

import static org.junit.Assert.assertThat;

import java.awt.List;
import java.util.ArrayList;

import org.hamcrest.core.Is;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cin.microsservices.wildcats.cliente.domain.cliente.Cliente;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteApplicationTests {

	@Test
	public void testCriancaoClient() {
		// Criando clientes
		Cliente cliente1 = new Cliente();
		cliente1.setId(1);
		cliente1.setNome("Carlos Melo");
		cliente1.setEmail("chnm@cin.ufpe.br");
		Cliente cliente2 = new Cliente();
		cliente2.setId(2);
		cliente2.setNome("Augusto Lima");
		cliente2.setEmail("arl4@cin.ufpe.br");
		
				
		assertThat(cliente1.getId(), is(Long.valueOf(1)));
		
		
	}

}
