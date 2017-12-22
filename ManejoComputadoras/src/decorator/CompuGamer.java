package decorator;

import emsamablajecomputadoras.creacional.Computador;

public class CompuGamer extends GamerDecorator {
	public Computador compu;
	
	public CompuGamer(Computador c) {
		compu=c;
	}

	@Override
	public String especificacionesTecnicas() {
		return "Especificiaciones Técnicas:\n"
	               +"Modelo : "+"ROG Gamer"+"\n"
	               +"Marca: "+compu.getMarca()+"\n"
	               +"Mainboard: "+compu.getPlaca()+"\n"
	               +"Memoria Ram: "+"48"+"\n"
	               +"Disco duro: "+compu.getAlmacenamiento()+"\n"
	               +"Sistema Operativo: "+compu.getOs()+"\n" ;
	}

	

}
