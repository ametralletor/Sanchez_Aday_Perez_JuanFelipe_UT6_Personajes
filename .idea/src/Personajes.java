abstract class Personajes {
    int id;
    String nombre;
    int nivel;
    int salud;

    public Personajes(int id, String nombre, int nivel, int salud) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    abstract void atacar();

    @Override
    public String toString() {
        return "Personaje: " + nombre + ", Nivel: " + nivel + ", Salud: " + salud;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        Personajes other = (Personajes) obj;
        return id==other.id &&nombre.equals(other.nombre) &&nivel == other.nivel &&salud==other.salud;
    }


    //cambiar por objects.hash
    @Override
    public int hashCode(){
        return nombre.hashCode();
    }



}

abstract class combateFisico extends Personajes {
    combateFisico(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
    }

    void fisico(){
        System.out.println(nombre+" se prepara físicamente.");
    }

    @Override
    abstract void atacar();

}

class Guerrero extends combateFisico {
    Guerrero(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
    }
    

    void cargarAtaque(){}

    /* 
    @Override
    void atacar() {
        System.out.println(nombre + " ataca con su espada.");
    }
        */
}