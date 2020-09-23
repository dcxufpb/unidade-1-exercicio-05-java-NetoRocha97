package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	private static String BRK = System.lineSeparator();

	public static String dadosLoja(){
		if(NOME_LOJA == ""){
			throw new RuntimeException("O campo nome da loja é obrigatório");
		}
		if(LOGRADOURO == ""){
			throw new RuntimeException("O campo logradouro do endereço é obrigatório");
		}

		String _logradouro = LOGRADOURO + ", ";
		String _numero = NUMERO <=0 ? "s/n" : String.format("%d", NUMERO);
		String _complemento = " " + COMPLEMENTO;
		String _bairro = BAIRRO.isEmpty() ? "" : BAIRRO + " - ";

		if(MUNICIPIO == ""){
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}
		String _municipio = MUNICIPIO + " - ";

		if(ESTADO == ""){
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}

		String _cep = CEP.isEmpty() ? "" : "CEP:" + CEP;
		String _telefone = TELEFONE.isEmpty() ? "" : "Tel " + TELEFONE;
		_telefone = !_cep.isEmpty() && !_telefone.isEmpty() ? " " + _telefone : _telefone;

		if(CNPJ == ""){
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		}
		String _cnpj = "CNPJ: " + CNPJ;

		if(INSCRICAO_ESTADUAL == ""){
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}
		String _ie = "IE: " + INSCRICAO_ESTADUAL;

		return(NOME_LOJA + BRK + 
			_logradouro + _numero + _complemento + BRK + 
			_bairro + _municipio + ESTADO + BRK + 
			_cep + _telefone + BRK + 
			OBSERVACAO + BRK + 
			_cnpj + BRK +  
			_ie + BRK);
	}


	public static void main( String[] args) {
		dadosLoja();		
	}

}