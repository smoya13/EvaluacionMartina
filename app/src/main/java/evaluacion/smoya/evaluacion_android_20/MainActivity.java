package evaluacion.smoya.evaluacion_android_20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Adapter;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contenido> listaContenido;
    RecyclerView recyclerContenido;
    TextView tryd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaContenido = new ArrayList<>();
        recyclerContenido = (RecyclerView) findViewById(R.id.rvList);
        recyclerContenido.setLayoutManager(new LinearLayoutManager(this));
        llenarContenido();
        AdaptadorContenido adaptador = new AdaptadorContenido(listaContenido);

        try {
            recyclerContenido.setAdapter(adaptador);
        }
            catch(Exception e) {
            tryd = findViewById(R.id.ovo);
            tryd.setText(e.toString());
        }



    }

    private void llenarContenido() {
        listaContenido.add(new Contenido("Mapache","Procyon (del griego: pro 'antes de'; κῠων [cyon] 'perro') es un género de mamíferos carnívoros de la familia Procyonidae1 conocidos comúnmente como mapaches u osos lavadores. Son propios de América.", R.drawable.raccoon, 5 ));
        listaContenido.add(new Contenido("Conejo","El conejo común o conejo europeo (Oryctolagus cuniculus) es una especie de mamífero lagomorfo de la familia Leporidae, y el único miembro actual del género Oryctolagus. Mide hasta 50 cm y su masa puede ser hasta 2.5 kg. Ha sido introducido en varios continentes y es la especie que se utiliza en la cocina y en la cunicultura. Está incluido en la lista 100 de las especies exóticas invasoras más dañinas del mundo.", R.drawable.rabbit, 5 ));
        listaContenido.add(new Contenido("Zorro","Los vulpinos (Vulpini) son una tribu de mamíferos carnívoros incluidos en la familia de los cánidos. Se conocen comúnmente como zorros o raposas. Actualmente están representados por unas 27 especies que se encuentran en casi todos los continentes, aunque la más extendida es el zorro rojo o zorro común (Vulpes vulpes), que habita en Europa y América del Norte. Otras especies importantes son el zorro gris, el zorro isleño y el zorro polar, también conocido como «zorro ártico» ", R.drawable.fox, 5 ));
        listaContenido.add(new Contenido("Ballena","Los balénidos (Balaenidae) son una familia de cetáceos misticetos que incluye cuatro especies, distribuidas en dos géneros, Balaena y Eubalaena. Sin embargo el término ballena es usado en sentido amplio para referirse a todos los grandes cetáceos incluidos en el parvorden Mysticeti (cetáceos con barbas) como el rorcual azul (Balaenoptera musculus) y a varias especies del parvorden Odontoceti (cetáceos dentados), por ejemplo el cachalote (Physeter macrocephalus).", R.drawable.whale, 5 ));
        listaContenido.add(new Contenido("Hipocampo","Los caballitos de mar o hipocampos (género Hippocampus) constituyen un grupo de peces marinos pertenecientes a la familia Syngnathidae, Su etimología procede de la combinación de los dos términos en griego clásico ίππος (hippos, que significa \"caballo\"), por el peculiar parecido que presenta su cabeza con la de los caballos, y kampos (\"monstruo de mar\").", R.drawable.seahorse, 5 ));
        listaContenido.add(new Contenido("Lobo","El lobo (Canis lupus) es una especie de mamífero placentario del orden de los carnívoros. El perro doméstico (Canis familiaris) se considera miembro de la misma especie según distintos indicios, la secuencia del ADN y otros estudios genéticos. Sin embargo, desde 1758 se consideró una especie distinta por el biólogo Carl Linneaus en la décima edición de Systema naturæ.", R.drawable.wolf, 5 ));
        listaContenido.add(new Contenido("Gato","El gato doméstico (Felis silvestris catus), llamado más comúnmente gato, y de forma coloquial minino. es un mamífero carnívoro de la familia Felidae. Es una subespecie domesticada, por la convivencia con el ser humano, del gato montés; El nombre actual en muchas lenguas proviene del latín vulgar catus. Paradójicamente, catus aludía al gatos salvajes, mientras que los gatos domésticos eran llamados felis.", R.drawable.cat, 5 ));
        listaContenido.add(new Contenido("Tigre","El tigre (Panthera tigris) es una de las especies de la subfamilia de los panterinos (familia Felidae) pertenecientes al género Panthera. Se encuentra solamente en el continente asiático; es un predador carnívoro y es la especie de félido más grande del mundo junto con el león pudiendo alcanzar ambos un tamaño comparable al de los fósiles de félidos de mayor tamaño", R.drawable.tiger, 5 ));
        listaContenido.add(new Contenido("Elefante","Los elefantes o elefántidos (Elephantidae) son una familia de mamíferos placentarios del orden Proboscidea. Antiguamente se clasificaban, junto con otros mamíferos de piel gruesa, en el orden, ahora inválido, de los paquidermos (Pachydermata). Existen hoy en día tres especies y diversas subespecies. Entre los géneros extintos de esta familia destacan los mamuts. Los elefantes son los animales terrestres más grandes que existen en la actualidad y El periodo de gestación es de veintidós meses, el más largo en cualquier animal terrestre.", R.drawable.elephant, 5 ));
        listaContenido.add(new Contenido("Leon","El león (Panthera leo) es un mamífero carnívoro de la familia de los félidos y una de las cinco especies del género Panthera. Los leones salvajes viven en poblaciones cada vez más dispersas y fragmentadas del África subsahariana (a excepción de las regiones selváticas de la costa del Atlántico y la cuenca del Congo) y una pequeña zona del noroeste de India (una población en peligro crítico en el parque nacional del Bosque de Gir y alrededores), habiendo desaparecido del resto de Asia del Sur, Asia Occidental, África del Norte y la península balcánica en tiempos históricos.", R.drawable.lion, 5 ));
    }
}
