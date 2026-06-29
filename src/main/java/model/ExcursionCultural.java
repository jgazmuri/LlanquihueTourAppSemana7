package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural(String nombre, String duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;



    }

    @Override
    public String toString() {
        return "ExcursionCultural{" + super.toString() + ','+
                "lugarHistorico=" + lugarHistorico +
                '}';
    }
}
