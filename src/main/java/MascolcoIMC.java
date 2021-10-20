public class MascolcoIMC extends IMC {

        public String verificarIMC() {
            if (this.calcularimc() < 20.0f) {
                return "Baixo peso";
            }
            else {
                return "Peso não baixo";
            }
        }

    }

