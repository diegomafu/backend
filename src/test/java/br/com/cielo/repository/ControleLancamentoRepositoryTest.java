package br.com.cielo.repository;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.cielo.model.ControleLancamentoRetorno;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControleLancamentoRepositoryTest {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;

	@Test
	public void listControleLancamento() throws Exception {
		
		final ControleLancamentoRetorno controleLancamentoRetorno = controleLancamentoRepository
				.listControleLancamento();
		
		Assert.assertNotNull(controleLancamentoRetorno);
		Assertions.assertThat(controleLancamentoRetorno.getTotalElements()).isGreaterThan(0);
	}
}
