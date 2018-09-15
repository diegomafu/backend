package br.com.cielo.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.model.ControleLancamentoRetorno;
import br.com.cielo.repository.ControleLancamentoRepository;

@RestController
public class LancamentoContaRS {

	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;
	
	@CrossOrigin
	@RequestMapping(value = "/lancamentoLista", method = RequestMethod.GET)
	public ResponseEntity<ControleLancamentoRetorno> listar() {
		
		final ControleLancamentoRetorno controleLancamentoRetorno = controleLancamentoRepository.listControleLancamento();
		
		//Not expected
		if(controleLancamentoRetorno==null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<ControleLancamentoRetorno>(controleLancamentoRetorno, HttpStatus.OK);
	}

}
