package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter
				.ofPattern("dd/MM/yyyy HH:mm")
				.withZone(ZoneId.systemDefault()); // pega o do sistema do usuário
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // existem nomes padrões para as datas
		
		LocalDate d01 = LocalDate.now(); // data dia de agora
		LocalDateTime d02 = LocalDateTime.now(); // data dia e hora de agora
		Instant d03 = Instant.now(); // data dia e hora com padrão GNT Londres
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // gerar datas
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36"); //gerar datas
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // gerar datas
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //precisa do formatter
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); //precisa do formatter
		
		LocalDate d10 = LocalDate.of(2022, 7, 20); // instanciar hora
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30); // instanciar hora
		
		System.out.println("d01 - " + d01);
		System.out.println("d02 - " + d02);
		System.out.println("d03 - " + d03);
		System.out.println("d04 - " + d04);
		System.out.println("d05 - " + d05);
		System.out.println("d06 - " + d06);
		System.out.println("d07 - " + d07);
		System.out.println("d08 - " + d08);
		System.out.println("d09 - " + d09);
		System.out.println("d10 - " + d10);
		System.out.println("d11 - " + d11);
		
		System.out.println("d08 - " + d08.format(fmt1)); //formatar a saida
		System.out.println("d08 - " + fmt1.format(d08)); //formatar a saida mesmo rsultado da linha de cima
		System.out.println("d06 -" + fmt3.format(d06)); // formatou a hora de londres para o do Brasil que é do meu sistema
		// quando for instant tem que formatar falando qual o fuso horario como fez no fmt3
		
		System.out.println("d05 - " + fmt4 .format(d05));
	}

}
