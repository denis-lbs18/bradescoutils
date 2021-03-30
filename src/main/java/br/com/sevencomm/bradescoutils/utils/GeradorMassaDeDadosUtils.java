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

	public static final MassaDeDadosManutencaoIndividualUnidade geraMassaDeDadosManutencaoIndividualUnidadeIncluir() {
		RandomEnum<TipoHierarquiaUnidade> randomTipoHierarquia = new RandomEnum<TipoHierarquiaUnidade>(
				TipoHierarquiaUnidade.class);
		TipoHierarquiaUnidade tipoHierarquia = randomTipoHierarquia.random();

		String cnpjEmpresaSubordinada = PropertiesUtils.getVariable("massa.dados.cnpj.subordinada");
		String tipoUnidadeSubordinada = PropertiesUtils.getVariable("massa.dados.tipoDeUnidade.subordinada");
		String tipoCodigoEmpresaSubordinada = PropertiesUtils.getVariable("massa.dados.tipoDeCodigo.subordinada");
		String codigoSubordinada = PropertiesUtils.getVariable("massa.dados.codigo.subordinada");

		String cnpjEmpresaSuperior = PropertiesUtils.getVariable("massa.dados.cnpj.subordinada");
		String tipoUnidadeSuperior = PropertiesUtils.getVariable("massa.dados.tipoDeUnidade.superior");
		String tipoCodigoEmpresaSuperior = PropertiesUtils.getVariable("massa.dados.tipoDeCodigo.superior");
		String codigoSuperior = PropertiesUtils.getVariable("massa.dados.codigo.superior");
		;

		return new MassaDeDadosManutencaoIndividualUnidade(tipoHierarquia, cnpjEmpresaSubordinada,
				tipoUnidadeSubordinada, tipoCodigoEmpresaSubordinada, codigoSubordinada, cnpjEmpresaSuperior,
				tipoUnidadeSuperior, tipoCodigoEmpresaSuperior, codigoSuperior);
	}

	public static MassaDeDadosManutencaoIndividualUnidade geraMassaDeDadosManutencaoIndividualUnidadeConsulta() {
		TipoHierarquiaUnidade tipoHierarquiaUnidade = TipoHierarquiaUnidade.CENTRALIZADA;
		String cnpjEmpresaSubordinada = PropertiesUtils.getVariable("massa.dados.cnpj.subordinada");
		String tipoUnidadeSubordinada = PropertiesUtils.getVariable("massa.dados.tipoDeUnidade.subordinada");
		String tipoCodigoSubordinada = PropertiesUtils.getVariable("massa.dados.tipoDeCodigo.subordinada");
		String codigo = PropertiesUtils.getVariable("massa.dados.codigo.subordinada");

		return new MassaDeDadosManutencaoIndividualUnidade(tipoHierarquiaUnidade, cnpjEmpresaSubordinada,
				tipoUnidadeSubordinada, tipoCodigoSubordinada, codigo);
	}
}
