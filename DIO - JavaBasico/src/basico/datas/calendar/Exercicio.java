package basico.datas.calendar;

import java.util.Calendar;

public class Exercicio {
	public static void main(String[] args) {
		Calendar dataDeVencimento =  Calendar.getInstance();
		dataDeVencimento.add(Calendar.DATE, 22);
		
		System.out.println(dataDeVencimento.getTime());
		
		if(dataDeVencimento.get(dataDeVencimento.DAY_OF_WEEK) == 7) 
		{
			System.out.println("Sabado!");
			dataDeVencimento.add(Calendar.DATE, 2);
		}else if (dataDeVencimento.get(dataDeVencimento.DAY_OF_WEEK) == 1)
		{
			System.out.println("Domingo");
			dataDeVencimento.add(Calendar.DATE, 1);
		}
		System.out.println("A nova data de vencimento � " + dataDeVencimento.getTime());
		
		
	}
	
}
