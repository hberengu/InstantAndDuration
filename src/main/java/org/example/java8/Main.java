package org.example.java8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) throws InterruptedException {
	
	
		
	/*	Instant start = Instant.now();
		System.out.println(start);
		
		//Thread.sleep(1000);
		
		Instant end = Instant.now();
		System.out.println(end);
		
		Duration elapsed = Duration.between(start, end);
		System.out.println("Elapsed: " + elapsed.toMillis() + " milliseconds");
		
		 -------------- 
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("\nCurrent Date: " + currentDate); 
		
		LocalDate specificDate = LocalDate.of(2015, 04, 2);
		System.out.println("Specific Time: " + specificDate);
		
		 -------------- 
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("\nCurrent Time: "+ currentTime);
		
		LocalTime specificTime = LocalTime.of(18, 20, 10);
		System.out.println("Specific Time: "+ specificTime);
		
		 -------------- 
		
		LocalDateTime currentDT = LocalDateTime.now();
		System.out.println("\nCurrent Date and Time: "+ currentDT);
		
		LocalDateTime specificDT = LocalDateTime.of(specificDate, specificTime);
		System.out.println("Specific Date and Time: " + specificDT);
		
		 -------------- 
		
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
		System.out.println("\nData formatada com DateTimeFormatter: " + df.format(specificDate));
		
		DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
		System.out.println("\nHora formatada com DateTimeFormatter: " + tf.format(specificTime));
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("\nData e Hora formatadas com DateTimeFormatter: " + dtf.format(specificDT));
		
		 -------------- 
		
		DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("\nData formatada com DateTimeFormatter of Localized Date LONG : " + f_long.format(specificDate));
		
		DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("\nData formatada com DateTimeFormatter of Localized Date SHORT : " + f_short.format(specificDate));
		
		String fr_short = f_short.withLocale(Locale.FRENCH).format(currentDT);
		String fr_long = f_long.withLocale(Locale.FRENCH).format(currentDT);
		
		System.out.println("Usando .withLocale short: " + fr_short);
		System.out.println("Usando .withLocale long: " + fr_long);
		
		 -------------- 
		
		DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
		    .appendLiteral("(")
			.appendValue(ChronoField.MONTH_OF_YEAR)
			.appendLiteral("-")
			.appendValue(ChronoField.DAY_OF_MONTH)
			.appendLiteral("-")
			.appendValue(ChronoField.YEAR)
			.appendLiteral(")");
		
		DateTimeFormatter f = b.toFormatter();
		System.out.println("\nData formatada com DateTimeFormatterBuilder: " + f.format(specificDate));
			
		 -------------- 
		// TimeZones
		
		DateTimeFormatter tz_f_short = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println("\nTimeZone : Hora formatada com DateTimeFormatter of Localized Time SHORT : " + tz_f_short.format(specificTime));
		
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println("TimeZone : Hora formatada com ZonedDateTime GMT+0: " + tz_f_short.format(gmt));

		ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("TimeZone : Hora formatada com ZonedDateTime NY: \n\n" + tz_f_short.format(ny));
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		
		// Nova funcionalidade do Java SE 8 - Predicates para filtrar resultado de lambda expressions
		Predicate<String> condition = str -> str.contains("Brazil");
		
		// Impressao uzando Java SE 8 - Lambda expression
		zones.forEach(z -> {
			if (condition.test(z)) {
				System.out.println(z);		
			}
		});
		
*/

		/* -------------- */
		// Date 

		System.out.println("\n\nUtilizando o Objeto Date:\n");
		
		// Classe deprecated 
		Date data = new Date();
		System.out.println("Data com objeto Date: " + data);

		// Calendar
		
		System.out.println("\n\nUtilizando o Objeto Calendar:\n");
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal.getTime: " + cal.getTime());
		
		int mes = cal.get(Calendar.MONTH) + 1;   // adicionei 1 porque no Calendar, Janeiro = 0
		
		//cal.set(Calendar.HOUR_OF_DAY, 10);
		
		System.out.println("Get Dia.: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Get Mes.: " + mes);
		System.out.println("Get Ano.: " + cal.get(Calendar.YEAR));
		System.out.println("Hora....: " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos.: " + cal.get(Calendar.MINUTE));
		System.out.println("Segundos: " + cal.get(Calendar.SECOND));
		System.out.println("Mili....: " + cal.get(Calendar.MILLISECOND));
		
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println("Hora formatada: " + hora.format(cal.getTime()));
		
		
		cal.set(Calendar.YEAR, 2005);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 15);
		
		System.out.println("Setado Dia: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Setado Mes: " + cal.get(Calendar.MONTH));
		System.out.println("Setado Ano: " + cal.get(Calendar.YEAR));
		
		//cal.set(2014, 10, 21);
		//System.out.println("Apos utilizacao do cal.set: " + cal);
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada com SimpleDateFormat: " + formato.format(cal.getTime()));
		
		/* -------------- */
		// Utilizacao das classes Date, Calendar e SimpleDateFormat -> DevMedia
		System.out.println("System.currentTimeMillis: " + System.currentTimeMillis());
		
		
		
		
		
		
	}
	
}
