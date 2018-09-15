package br.com.cielo.repository.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.google.gson.Gson;

import br.com.cielo.model.ControleLancamentoRetorno;
import br.com.cielo.repository.ControleLancamentoRepository;

@Repository
public class ControleLancamentoDao implements ControleLancamentoRepository {

	@Value("${classpath.json.legado}")
	private String jsonFileClassPath;
	
	@Override
	public ControleLancamentoRetorno listControleLancamento() {

		final StringBuilder jsonBuilder = new StringBuilder();
		FileInputStream fis = null;
		BufferedReader in = null;
        try {
        	fis = new FileInputStream(ResourceUtils.getFile(jsonFileClassPath)); 
        	in = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            while((line = in.readLine()) != null) {
                jsonBuilder.append(line);
            }
        } catch(IOException ioe) {
        	ioe.printStackTrace();
        } finally {
        	try {
        		if(in != null) {
        			in.close();
        		}
				if(fis != null) {
					fis.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
        }
		
        final Gson gson = new Gson();
        final ControleLancamentoRetorno retorno = gson.fromJson(jsonBuilder.toString(), ControleLancamentoRetorno.class);
		return retorno;
	}

}
