package reactiva.reactivamovil;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;


/**
 * Created by edgardan on 12/07/2017.
 */

public class VerTerapia extends AppCompatActivity {
    View section1, section2, section3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_terapias);

        section1 = findViewById(R.id.section1);
        section2 = findViewById(R.id.section2);
        section3 = findViewById(R.id.section3);

        final View header1 = findViewById(R.id.header1);
        header1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (section1.getVisibility() == View.GONE)
                {
                    section1.setVisibility(View.VISIBLE);
                    v.setVisibility(View.GONE);
                }
                else
                {
                    section1.setVisibility(View.GONE);
                }
            }
        });

        section1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (header1.getVisibility() == View.GONE)
                {
                    header1.setVisibility(View.VISIBLE);
                    v.setVisibility(View.GONE);
                }
                else
                {
                    header1.setVisibility(View.GONE);
                }
            }
        });

        View header2 = findViewById(R.id.header2);
        header2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (section2.getVisibility() == View.GONE)
                {
                    section2.setVisibility(View.VISIBLE);
                }
                else
                {
                    section2.setVisibility(View.GONE);
                }
            }
        });

        View header3 = findViewById(R.id.header3);
        header3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (section3.getVisibility() == View.GONE)
                {
                    section3.setVisibility(View.VISIBLE);
                }
                else
                {
                    section3.setVisibility(View.GONE);
                }
            }
        });
    }

}
