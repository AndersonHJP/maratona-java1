package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.sql.SQLOutput;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("America/Sao_Paulo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowIstant = Instant.now();
        System.out.println(nowIstant);
        ZonedDateTime zonedDateTime2 = nowIstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowIstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate JapaneseDate = java.time.chrono.JapaneseDate.now();
        System.out.println(JapaneseDate);

        JapaneseDate JapaneseDate2 = java.time.chrono.JapaneseDate.from(LocalDateTime.now());
        System.out.println(JapaneseDate2);

        //ZoneOffset offsetJAPAN = ZoneOffset;
        //OffsetDateTime offsetDateTime4 = OffsetDateTime.of(now, offset);

    }
}
