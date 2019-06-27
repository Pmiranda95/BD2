package conexionbd;

import modelo.Domicilio;
import conexionbd.LocalidadData;
import conexionbd.ProvinciasData;
public class DomicilioData {
	static Domicilio domicilio1 = new Domicilio("Alvarez tomas",5454,LocalidadData.lanus,ProvinciasData.buenosAires);
	static Domicilio domicilio2 = new Domicilio("Corrientes",85656,LocalidadData.capitalFederal,ProvinciasData.buenosAires);
	static Domicilio domicilio3 = new Domicilio("Venezuela",5454,LocalidadData.capitalFederal,ProvinciasData.buenosAires);
	static Domicilio domicilio4 = new Domicilio("Olazabal",5454,LocalidadData.banfield,ProvinciasData.buenosAires);

}
