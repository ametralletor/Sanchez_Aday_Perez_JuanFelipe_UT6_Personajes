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

    void descripcion(){
        System.out.println(nombre+"es un Personaje");
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


    //MIRAR ESTO Y HACER HASHCODE PARA EL ID Y QUE UN ID NO SE REPITA
    @Override
    public int hashCode(){
        return nombre.hashCode();
    }

    class combateMagico extends Personajes{
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
        void atacar() {
            System.out.println(nombre + " ataca");
        }


    }

    class hechizero extends combateMagico implements defendedible{
        hechizero(int id, String nombre, int nivel, int salud) {
            super(id, nombre, nivel, salud);
        }

        @Override
        void descripcion(){
            System.out.println(nombre+" Es un Hechizero");
            System.out.println("los hechizeros cuentan con el poder de invocar entidades para atacar a los enemigos");
        }

        @Override
        void atacar() {
            System.out.println(nombre + " ataca");
        }

        @Override
        public void defender() {
            System.out.println(nombre + " se defiende, resistira el siguiente ataque enemigo");
        }
    }

    /*wip al no tener el ataque fisico*/
    class asesino extends combateMagico implements curar{
        asesino(int id, String nombre, int nivel, int salud) {
            super(id, nombre, nivel, salud);
        }

        @Override
        void descripcion(){
            System.out.println(nombre+" Es un asesino");
            System.out.println("Los asesinos son unidades fragiles pero cuentan siempre atacan primero, estos sigilosos personajes son capaces de ocultarse y robar un porcentaje del vida en base al daño que hacen");
        }

        @Override
        void atacar() {

        }

        @Override
        public void curacion(){
            System.out.println(nombre + " recupera la mitad de la salud que le hizo a su enemigo");
        }
    }

    //interfaces:
    interface volador{
        void volar();
    }

    interface curar{
        void curacion();
    }

    interface defendedible{
        void defender();
    }
}
