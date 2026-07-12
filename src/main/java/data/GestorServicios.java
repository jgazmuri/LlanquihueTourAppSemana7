package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;
import java.util.ArrayList;
import java.util.List;
import model.Registrable;

public class GestorServicios {


    public void mostrarTodosLosServicios(){



        ArrayList<Registrable> servicios = new ArrayList<>();

        servicios.add(new ServicioTuristico("Volcan", "4 Horas"));
        servicios.add(new PaseoLacustre("Paseo Frutillar", "2 Horas", "Bus"));
        servicios.add(new ExcursionCultural("Museo Villarrica", "3 Horas", "Plaza Principal"));
        servicios.add(new RutaGastronomica("El Guaton", "1 Hora", 5));
        servicios.add(new ServicioTuristico("Cuevas", "4 Horas"));

        for (Registrable turistico : servicios) {

            turistico.mostrarResumen();

             if (turistico instanceof PaseoLacustre) {
                System.out.println(" → Esta es un Paseo Lacustre");
            }else if (turistico instanceof ExcursionCultural) {
                System.out.println(" → Esta es un Excursion Cultural");
            }else if (turistico instanceof RutaGastronomica) {
                System.out.println(" → Esta es una Ruta Gastronomica");
            }else if (turistico instanceof ServicioTuristico){
                System.out.println(" → Este es un Servicio Turistco");
            }

        }
        System.out.println();

    }


}
