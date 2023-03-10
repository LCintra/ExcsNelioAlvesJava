package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		Instant d01 = Instant.parse("2022-07-20T01:30:26Z");
		LocalDate d02 = LocalDate.parse("2022-07-20");
		LocalDateTime d03 = LocalDateTime.now();
		
		LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d02 dia = " + d02.getDayOfMonth());
		System.out.println("d02 mes = " + d02.getMonthValue());
		System.out.println("d02 ano = " + d02.getYear());
		
		System.out.println("d03 hora = " + d03.getHour());
		System.out.println("d03 minuto = " + d03.getMinute());
		
		System.out.println("d01 mes = " + d01.atZone(ZoneId.systemDefault()).getDayOfMonth());
	}

}
