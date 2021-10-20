public class FemininoIMC extends IMC {

        public String verificarIMC() {
            if (this.calcularimc() < 19.1f) {
                return "Baixo peso";
            }
            else {
                return "Peso não baixo";
            }
        }

    }


