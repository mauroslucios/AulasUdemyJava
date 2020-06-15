package aulas.udemy.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		//pega data de 1º janeiro de 1970 e reduz 03:00 horas
		Date d = Date.from(Instant.parse("2020-06-15T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		//usando a interface Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//acrescento 4 horas a0 dia usando o objeto Calendar
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		//pegando a quantidade de minutos
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		
		//pegando mês de uma data
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("Month: " + month);
		
	}
}
