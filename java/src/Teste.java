import static org.junit.Assert.*;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;


public class Teste {

	@Test
	public void testaTudo() {
		
		Assert.assertEquals(20, calcula(1,10));
		Assert.assertEquals(125, calcula(100,200));
		Assert.assertEquals(89, calcula(201,210));
		Assert.assertEquals(174, calcula(900,1000));
	}

	@Test
	public void testaTamanhoDaSerie() {
		Assert.assertEquals(1, tamanhoDaSerie(1));
		Assert.assertEquals(2, tamanhoDaSerie(2));
		Assert.assertEquals(16, tamanhoDaSerie(22));

	}

	private int calcula(int i, int j) {
		int x =i;
		int max = 0;
		while(x<=j) {
			int tamanho = tamanhoDaSerie(x);
			if (max < tamanho) {
				max = tamanho;
			}
			x++;
		}
		return max;
	}

	private int tamanhoDaSerie(int x) {
		int i=1;
		while(x>1){
			i++;
			if(x%2==0){
				x /=2;
			}else{
				x=3*x+1;
			}
		}
		return i;
	}

}
