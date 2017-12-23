package main;

import builder.BuilderAsusROGE;

import builder.ComputadorDirector;
import decorator.CompuGamer;
import emsamablajecomputadoras.creacional.Computador;

import java.util.ArrayList;
import java.util.Iterator;

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
		ArrayList<Computador> al = new ArrayList<Computador>();
		al.add(comp);
		//al.add(comp2);
		Iterator itr = al.iterator();
		System.out.println("----------------------");
		System.out.println("Test inicial: ");		
		int contador1 = 1;
		while (itr.hasNext()) {
			Computador elemento = (Computador) itr.next();			
			if(elemento.getMarca()!=null && elemento.getOs()!=null) {
				System.out.println("test 1 para la computadora #"+contador1+" aprobado!");
				contador1 ++;
			}else {
				System.out.println("test 1 para la computadora #"+contador1+" No aprobado!");
				contador1 ++;
			};			
		}
		
		Iterator itr2 = al.iterator();
		System.out.println("----------------------");
		System.out.println("Test medio: ");		
		int contador2 = 1;		
		while (itr2.hasNext()) {
			Computador elemento = (Computador) itr2.next();			
			if(elemento.getModelo()!=null && elemento.getAlmacenamiento()!=0) {
				System.out.println("test 2 para la computadora #"+contador2+" aprobado!");
				contador2 ++;
			}else {
				System.out.println("test 2 para la computadora #"+contador2+" No aprobado!");
				contador2 ++;
			};
	}
		
		Iterator itr3 = al.iterator();
		System.out.println("----------------------");
		System.out.println("Test completo: ");		
		int contador3 = 1;		
		while (itr3.hasNext()) {
			Computador elemento = (Computador) itr3.next();			
			if(elemento.getPlaca()!=null && elemento.getRam()!=0) {
				System.out.println("test 3 para la computadora #"+contador3+" aprobado!");
				contador2 ++;
			}else {
				System.out.println("test 3 para la computadora #"+contador3+" No aprobado!");
				contador2 ++;
			};
	}
		
}}