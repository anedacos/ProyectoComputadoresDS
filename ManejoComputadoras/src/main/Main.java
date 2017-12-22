package main;

import builder.BuilderAsusROGE;
import builder.ComputadorDirector;
import decorator.CompuGamer;
import emsamablajecomputadoras.creacional.Computador;

public class Main {

	public static void main(String[] args) {
		ComputadorDirector creador = new ComputadorDirector(new BuilderAsusROGE());
		creador.EnsamblarComputadora();
		Computador comp = creador.getComputador();
		String especificacion = comp.especificacionesTecnicas();
		System.out.println(especificacion);
		System.out.println("----------------------");
		CompuGamer comp2 = new CompuGamer(comp); 
		System.out.println(comp2.especificacionesTecnicas());
	}
}