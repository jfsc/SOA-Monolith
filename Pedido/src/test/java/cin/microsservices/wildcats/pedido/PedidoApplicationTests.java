package cin.microsservices.wildcats.pedido;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cin.microsservices.wildcats.pedido.domain.pedido.ItemPedido;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PedidoApplicationTests {
	private ItemPedido item1 = new ItemPedido();
	
	@Before
	public void setUp() {
		//Criação de item pedido
		
		item1.setIdProduto(36);
		item1.setQuantidade(65);
	}
	
	/**
	 * Teste simples na criação de um ItemPedido
	 * 12/11/2017
	 */
	@Test
	public void testCriacaoDePedido() {
		//=================VERIFICAÇÃO===============
		
	}

}
