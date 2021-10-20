import static org.junit.jupiter.api.Assertions.*;

class FemininoIMC {

            @Test
            void deveRetonarAprovado() {
                FemininoIMC aluno = new FemininoIMC();
                aluno.altura(1.50f);
                aluno.peso(60.0f);
                assertEquals("Aprovado", aluno.verificarIMC());
            }

}