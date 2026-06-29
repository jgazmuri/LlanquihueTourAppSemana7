package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void crearYMostrarServicios(){

        RutaGastronomica rutaGastronomica = new RutaGastronomica ("Ruta de los Lagos", "4", 2);
        RutaGastronomica rutaGastronomica1 = new RutaGastronomica("Subida Volcan Villarica", "6", 5);

        System.out.println("Ruta Gastronomica: " + rutaGastronomica);
        System.out.println("Ruta Gastronomica: " + rutaGastronomica1);

        PaseoLacustre paseoLacustre = new PaseoLacustre("Trekking Laguna Alta", "2", "Bus");
        PaseoLacustre paseoLacustre1 = new PaseoLacustre("Laguna Baja", "3", "Bus");

        System.out.println("Paseo Lacustre: " + paseoLacustre);
        System.out.println("Paseo Lacustre: " + paseoLacustre1);

        ExcursionCultural excursionCultural = new ExcursionCultural("Museo Frutillar", "1", "Central");
        ExcursionCultural excursionCultural1 = new ExcursionCultural("Museo Puerto Varas", "2", "Central");

        System.out.println("Excursion Cultural: " + excursionCultural);
        System.out.println("Excursion Cultural: " + excursionCultural1);

    }


}
