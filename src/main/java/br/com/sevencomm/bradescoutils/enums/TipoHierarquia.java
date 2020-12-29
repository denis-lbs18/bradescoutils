package br.com.sevencomm.bradescoutils.enums;

public enum TipoHierarquia {
	RETESTE_CONTADORIA_GERAL {
		@Override
		public String toString() {
			return "RETESTE CONTADORIA GERAL";
		}
	},
	TESTE_EMPRESA {
		@Override
		public String toString() {
			return "TESTE EMPRESA";
		}
	};
}
