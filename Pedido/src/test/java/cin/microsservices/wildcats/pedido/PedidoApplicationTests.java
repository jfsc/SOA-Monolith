package cin.microsservices.wildcats.pedido;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cin.microsservices.wildcats.pedido.domain.pedido.ItemPedido;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PedidoApplicationTests {

	@Test
	public void testCriacaoDePedido() {
		/**
		 * Teste simples na criação de um ItemPedido
		 * 12/11/2017
		 */
		//Criação de item pedido
		ItemPedido item1 = new ItemPedido();
		item1.setIdProduto(36);
		item1.setQuantidade(65);
		
		
	}

}
