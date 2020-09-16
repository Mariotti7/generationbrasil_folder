package entities;

public class Patinete {
	
	//atributo
	public static String marcaPatinete;
	public static double precoPatinete;
	public static String acessorioTurbo;
	
	
	//metodo
	public static void mostrar() {
		System.out.printf("\nFabricante: %s%n", Patinete.marcaPatinete);
		System.out.printf("Preço: R$ %.2f%n", Patinete.precoPatinete);
	}
	
	public static double getPrecoPatinete() {
		return precoPatinete;
	}

	public static void setPrecoPatinete(double precoPatinete) {
		Patinete.precoPatinete = precoPatinete;
	}

	public static String getAcessorioTurbo() {
		return acessorioTurbo;
	}

	public static void setAcessorioTurbo(String acessorioTurbo) {
		Patinete.acessorioTurbo = acessorioTurbo;
	}

	public static String precoAcessorio(String acessorioTurbo) {
		if(acessorioTurbo == "SIM") {
			return "Acessório adicionado ao produto";
		}
		return "";
	}
	
	public static void addPrecoAcessorio(double acessorio) {
		Patinete.precoPatinete += acessorio;
	}
	
}
