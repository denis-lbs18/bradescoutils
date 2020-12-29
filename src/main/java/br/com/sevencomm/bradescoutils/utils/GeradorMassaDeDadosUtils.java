package br.com.sevencomm.bradescoutils.utils;

import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquiaUnidade;
import br.com.sevencomm.bradescoutils.modelos.MassaDeDadosManutencaoIndividualEmpresa;
import br.com.sevencomm.bradescoutils.modelos.MassaDeDadosManutencaoIndividualUnidade;

public final class GeradorMassaDeDadosUtils {
	private GeradorMassaDeDadosUtils() {
	}

	public static final MassaDeDadosManutencaoIndividualEmpresa geraMassaDeDadosManutencaoIndividual() {
		RandomEnum<TipoHierarquia> randomTipoHierarquia = new RandomEnum<TipoHierarquia>(TipoHierarquia.class);
		TipoHierarquia tipoHierarquia = randomTipoHierarquia.random();
		String cnpjEmpresaSubordinada = PropertiesUtils.getVariable("massa.dados.cnpj.subordinada");
		String codigoEmpresaSubordinada = PropertiesUtils.getVariable("massa.dados.codigosequencia.subordinada");
		String cnpjEmpresaSuperior = PropertiesUtils.getVariable("massa.dados.cnpj.superior");
		String codigoEmpresaSuperior = PropertiesUtils.getVariable("massa.dados.codigosequencia.superior");

		return new MassaDeDadosManutencaoIndividualEmpresa(tipoHierarquia, cnpjEmpresaSubordinada,
				codigoEmpresaSubordinada, cnpjEmpresaSuperior, codigoEmpresaSuperior);
	}

	public static final MassaDeDadosManutencaoIndividualUnidade geraMassaDeDadosManutencaoIndividualUnidade() {
		RandomEnum<TipoHierarquiaUnidade> randomTipoHierarquia = new RandomEnum<TipoHierarquiaUnidade>(
				TipoHierarquiaUnidade.class);
		TipoHierarquiaUnidade tipoHierarquia = randomTipoHierarquia.random();
		String tipoUnidadeSubordinada = PropertiesUtils.getVariable("massa.dados.codigotipounidade.subordinada");
		String cnpjEmpresaSubordinada = PropertiesUtils.getVariable("massa.dados.cnpj.subordinada");
		String codigoEmpresaSubordinada = PropertiesUtils.getVariable("massa.dados.codigosequencia.subordinada");
		String cnpjEmpresaSuperior = PropertiesUtils.getVariable("massa.dados.cnpj.superior");
		String codigoEmpresaSuperior = PropertiesUtils.getVariable("massa.dados.codigosequencia.superior");
		;

		return new MassaDeDadosManutencaoIndividualUnidade(tipoHierarquia, tipoUnidadeSubordinada,
				cnpjEmpresaSubordinada, codigoEmpresaSubordinada, cnpjEmpresaSuperior, codigoEmpresaSuperior);
	}
}
