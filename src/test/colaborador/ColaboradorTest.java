package test.colaborador;

import org.junit.Assert;
import org.junit.Test;

import com.modelo.Colaborador;
import com.modelo.Desenvolvedor;

public class ColaboradorTest {

	@Test
	public void percentualDescontoMaior3000DesenvolvedorTest() {
		Colaborador colaborador = new Desenvolvedor(new Double(5000));
		colaborador.getPercentualDesconto();
		Assert.assertEquals(20, colaborador.getPercentualDesconto().intValue());
	}
	
	@Test
	public void percentualDescontoMenor3000DesenvolvedorTest() {
		Colaborador colaborador = new Desenvolvedor(new Double(2500));
		colaborador.getPercentualDesconto();
		Assert.assertEquals(10, colaborador.getPercentualDesconto().intValue());
	}
}
