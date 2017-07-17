package reactiva.reactivamovil;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nancy on 2017-07-15.
 */

public class ObservacionMedicaAdaptador extends RecyclerView.Adapter<ObservacionMedicaAdaptador.ObservacionMedicaViewHolder> {

    ArrayList<ObservacionMedica> observacionMedicas;

    public ObservacionMedicaAdaptador(ArrayList<ObservacionMedica> observacionMedicas) {
        this.observacionMedicas = observacionMedicas;
    }


    @Override
    public ObservacionMedicaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                                            //ASOCIO MI LAYOUT DE UN ITEM AL RECYCLER VIEW
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_observa_medicas,parent,false);
                                            //LUEGO LO PASO AL MANEJADOR PARA QUE OBTENGA CADA UNA DE LOS VIEWS O ELEMENTOS DE LA VISTA
        return new ObservacionMedicaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ObservacionMedicaViewHolder observacionMedicaViewHolder, int position) {
                                            ///MEDIANTE EL MANEJADOR ASOCIO MIS VALORES CONTENIDOS EN EL ARRAYLIST A CADA
                                            //ELEMENTO DE MI LAYAOUT ITEMT(UN VIEW)
                                            //PARA ESO CREO UN ITEM DE MI LISTA Y LE ASOCIO LOS CRORRESPONDIENTES VALORES
        ObservacionMedica observacionMed = observacionMedicas.get(position);
        observacionMedicaViewHolder.tvFechaObsMed.setText(observacionMed.getFechaObservacion());
        observacionMedicaViewHolder.tvMedicoObs.setText(observacionMed.getDoctorObservacion());
        observacionMedicaViewHolder.tvDetalleObsMed.setText(observacionMed.getDetalleObservacion());
    }

    @Override
    public int getItemCount() {  ///CANTIDAD DE ELEMENTOS QUE CONTIENE LA LISTA DE OBSERVACIONES MEDICAS
        return observacionMedicas.size();
    }

    public static class ObservacionMedicaViewHolder extends RecyclerView.ViewHolder {

        private TextView tvFechaObsMed;
        private TextView tvMedicoObs;
        private TextView tvDetalleObsMed;


        public ObservacionMedicaViewHolder(View itemView) {
            super(itemView);

            tvFechaObsMed    = (TextView) itemView.findViewById(R.id.fechaObsMed);
            tvMedicoObs      = (TextView) itemView.findViewById(R.id.medicoObsMed);
            tvDetalleObsMed  = (TextView) itemView.findViewById(R.id.detalleObsMed);
        }
    }
}
