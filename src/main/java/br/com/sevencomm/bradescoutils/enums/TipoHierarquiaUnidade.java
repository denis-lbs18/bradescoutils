package br.com.sevencomm.bradescoutils.enums;

public enum TipoHierarquiaUnidade {
	CENTRALIZADA {
		@Override
		public String toString() {
			return "CENTRALIZADA";
		}
	},
	UNIFICADA {
		@Override
		public String toString() {
			return "UNIFICADA";
		}
	},
	RESTRITO {
		@Override
		public String toString() {
			return "RESTRITO";
		}
	},
	ORGANIZACIONAL {
		@Override
		public String toString() {
			return "ORGANIZACIONAL";
		}
	};
}
