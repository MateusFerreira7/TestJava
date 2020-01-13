package calendario;

public class Controle {

	public Data proximoDia(Data dataAtual) {
		Data diaSeguinte = new Data(0,0,0);
		
		if(dataAtual.getDia() <= 27) {
			
		}
		
		else {

			diaSeguinte.setDia(dataAtual.getDia() + 1);
			diaSeguinte.setMes(dataAtual.getMes());
		}
		
		diaSeguinte.setAno(dataAtual.getAno());
		
		return diaSeguinte; 
	}
	
	private int getUltimoDiaDoMes(int mes, int ano) {
		int ultimoDia;
		int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(mes==2 && ehBissexto(ano)) 
			ultimoDia = 29;
		else 
			ultimoDia = meses[mes-1];
		return ultimoDia;
		
	}
	
	private boolean ehBissexto(int ano) {
		boolean bissexto = false;
		if(ano % 4 == 0 && ano % 100 != 0) {
			bissexto = true;
		} else if(ano % 400 == 0) {
			bissexto = true;
		}
		return bissexto;
	}

}
