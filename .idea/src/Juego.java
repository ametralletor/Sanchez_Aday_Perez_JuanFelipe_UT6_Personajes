import java.util.ArrayList;

public class Juego {
    ArrayList<Personajes> personajes = new ArrayList<>();

    public void agregarPersonaje(Personajes personaje) {
        personajes.add(personaje);
    }

    public void mostrarAcciones(){
        for (Personajes personaje : personajes) {
            if (personaje instanceof Guerrero) {
                Guerrero guerrero = (Guerrero) personaje;
                guerrero.fisico();
                guerrero.atacar();
                guerrero.cargarAtaque();
                guerrero.defender();
            } else if (personaje instanceof Mago) {
                Mago mago = (Mago) personaje;
                mago.magico();
                mago.mana();
                mago.atacar();
                mago.lanzarHechizo();
                mago.regenerarMana();
            } else if (personaje instanceof Arquero) {
                Arquero arquero = (Arquero) personaje;
                arquero.fisico();
                arquero.atacar();
                arquero.moverse();
                arquero.dispararFlecha();
                arquero.reabastecerFlechas(); 
            }
        }
    }

}
