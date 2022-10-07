package RedeSocial;

import RedeSocial.entities.Comentario;
import RedeSocial.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Tenha uma boa viagem");
        Comentario c2 = new Comentario("Isso é ótimo");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Viajando para Nova Zelandia",
                "Vou visitar esse país maravilhoso",12);

        Comentario c3 = new Comentario("Boa noite");
        Comentario c4 = new Comentario("Desejo que a força esteje com você");

        Post p2 = new Post(sdf.parse("28/07/2018 23:15:30"),
                "Boa noite pessoal",
                "Vejo vocês amanha",32);


        p1.adicionarComentario(c1);
        p1.adicionarComentario(c2);

        System.out.println(p1);



    }

}
