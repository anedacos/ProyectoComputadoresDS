package builder;

import emsamablajecomputadoras.creacional.Computador;

public class ComputadorDirector {
	private BuilderComputadora builder;

	public ComputadorDirector(BuilderComputadora builder) {
		this.builder = builder;
	}
	
	public void EnsamblarComputadora() {
		builder.definirComputador();
		builder.definirMarca();
		builder.definirModelo();
		builder.definirRAM();
		builder.definirAlmacenamiento();
		builder.definirSO();
		builder.definirMainboard();
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
