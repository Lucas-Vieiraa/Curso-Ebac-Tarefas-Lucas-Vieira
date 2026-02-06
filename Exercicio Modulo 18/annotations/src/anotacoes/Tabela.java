package anotacoes;

import java.lang.annotation.*;
import java.time.LocalDateTime;



@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface Tabela {

    String[] cliente() default {};

}