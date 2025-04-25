abstract class Personajes {
    String nombre;
    int nivel;
    int salud;

    public Personajes(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    abstract void atacar();
}
