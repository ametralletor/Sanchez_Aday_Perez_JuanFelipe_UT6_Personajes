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

abstract class combateMagico extends Personajes{
    combateMagico(int id, String nombre, int nivel, int salud) {
        super(id, nombre, nivel, salud);
    }


    void magico(){
        System.out.println(nombre + " Es un atacante magico");
    }

    void mana(){
        System.out.println(nombre + "Cuenta con Maná");
    }

    @Override
    abstract void atacar();


}

class Guerrero extends combateFisico /*interfaz defendible*/ {
    int fuerza;
    int armadura;
    int escudo;
    Guerrero(int id, String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(id, nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }
    
    @Override
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    void cargarAtaque(){
        System.out.println(nombre + " carga su ataque.");
    }

    void defender(){
        System.out.println(nombre + " se defiende.");
    }

}

class Mago extends combateMagico {
    int mana;
    int sabiduria;
    Mago(int id, String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(id, nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }
    
    @Override
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    void lanzarHechizo(){
        System.out.println(nombre + " lanza un hechizo.");
    }

    void regenerarMana(){
        System.out.println(nombre + " regenera maná.");
    }
}

class Arquero extends combateFisico{
    int agilidad;
    int numFlechas;
    Arquero(int id, String nombre, int nivel, int salud, int agilidad, int numFlechas) {
        super(id, nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }

    @Override
    void atacar() {
        System.out.println(nombre + " ataca.");
    }

    void dispararFlecha(){
        System.out.println(nombre + " dispara una flecha.");
    }

    void reabastecerFlechas(){
        System.out.println(nombre + " reabastece flechas.");
    }   
}

