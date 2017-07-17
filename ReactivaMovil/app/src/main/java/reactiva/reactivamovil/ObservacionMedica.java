package reactiva.reactivamovil;

/**
 * Created by Nancy on 2017-07-15.
 */

public class ObservacionMedica {

    String fechaObservacion;
    String doctorObservacion;
    String detalleObservacion;

    public ObservacionMedica(String fechaObservacion, String doctorObservacion, String detalleObservacion) {
        this.fechaObservacion = fechaObservacion;
        this.doctorObservacion = doctorObservacion;
        this.detalleObservacion = detalleObservacion;
    }

    public String getFechaObservacion() {
        return fechaObservacion;
    }

    public String getDoctorObservacion() {
        return doctorObservacion;
    }

    public String getDetalleObservacion() {
        return detalleObservacion;
    }

    public void setFechaObservacion(String fechaObservacion) {
        this.fechaObservacion = fechaObservacion;
    }

    public void setDoctorObservacion(String doctorObservacion) {
        this.doctorObservacion = doctorObservacion;
    }

    public void setDetalleObservacion(String detalleObservacion) {
        this.detalleObservacion = detalleObservacion;
    }
}
