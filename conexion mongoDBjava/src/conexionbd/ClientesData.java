package conexionbd;

import modelo.Cliente;
import modelo.Domicilio;

import static conexionbd.LocalidadData.lanus;
import static conexionbd.ObraSocialData.*;
import static conexionbd.ProvinciasData.buenosAires;

public class ClientesData {
    static Domicilio domicilioCliente1 = new Domicilio("9 de julio",123,lanus,buenosAires);
    static Cliente cliente1 = new Cliente("Lionel","Messi",39000075,domicilioCliente1,osde);

    static Domicilio domicilioCliente2 = new Domicilio("ayacucho",222,lanus,buenosAires);
    static Cliente cliente2 = new Cliente("Aguero","Sergio",39223453,domicilioCliente2,galeno);

    static Domicilio domicilioCliente3 = new Domicilio("madariaga",212,lanus,buenosAires);
    static Cliente cliente3 = new Cliente("Gonzalo","Muscolo",39443242,domicilioCliente3,osecac);
}
