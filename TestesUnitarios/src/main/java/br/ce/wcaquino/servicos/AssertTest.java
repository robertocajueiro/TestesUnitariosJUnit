package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	@Test
	public void test() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
		Assert.assertEquals("erro de comparacao",1,1);
		Assert.assertEquals(0.51234, 0.512, 0.001);
		Assert.assertEquals(Math.PI, 3.14, 0.01);
		
		// Todos os tipos primitivos possui uma representação em forma de objetos (classes Wrappers)
		// que podemos trabalhas com essas duas forma pq o java tem o conceito de autobox e inbox.
		
		int i = 5;
		Integer i2 = 5;
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
		
		// comparar Strings
		Assert.assertEquals("bola", "bola");
		
		Assert.assertNotEquals("bola", "casa");
		
//		Teste não passa
//		Assert.assertEquals("Bola", "bola");
		
		// Ignora o case sensitive
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		
		// Caso do radical, inicia com bo
		Assert.assertTrue("bola".startsWith("bo"));
		
//		Comparando um objeto
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = null;
		
		Assert.assertEquals(u1, u2);
		
		// Comparando se o objeto são da mesma instancia
		Assert.assertSame(u2, u2);
		Assert.assertNotSame(u2, u1);
		
		// verificar se o objeto esta nulo
		Assert.assertTrue(u3 == null);
		
		// fazendo melhor
		Assert.assertNull(u3);
	}

}
