import static org.junit.jupiter.api.Assertions.*;

class MascolcoIMCTest {

            @Test
            void deveRetonarAprovado() {
                FemininoIMC aluno = new MascolcoIMC();
                aluno.altura(1.50f);
                aluno.peso(60.0f);
                assertEquals("Aprovado", aluno.verificarIMC());
            }

}