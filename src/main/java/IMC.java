public abstract class IMC {

        protected String nome;
        private float  altura;
        protected float  peso;

        public String getNome() {
            return nome;
        }
        public float  getAltura() {
            return altura;
        }
        public float  getPeso() {
            return peso;
        }


        public float calcularimc() {
            return (this.altura)/ (this.peso * this.peso);
        }

        public abstract String verificarIMC();

        public String getTipo() {
            return "IMC";
        }

        public String getInfo() {
            return getTipo() + "{" +
                    ", nome='" + this.nome + '\'' +
                    ", resultado=" + this.verificarIMC() +
                    '}';
        }
    }

