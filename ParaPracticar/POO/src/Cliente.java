public class Cliente {
    String dni;
    String nombre;

    public Cliente(String dni,String nombre) throws Exception {
        if (validardni(dni)){
            this.dni=dni;
        }
        if (!nombre.isEmpty()){
            this.nombre=nombre;
        }

    }
    public String getNombre() {
        return nombre;
    }
    public String datosCliente(){
       return nombre+" (DNI: "+dni+")";
    }
    public boolean validardni(String dni) throws Exception{
        String letra;
        String numero;
        if (dni.length()==9){
            letra=String.valueOf(dni.charAt(8));
        }else {
            throw new IllegalArgumentException("El formato del dni no es correcto");
        }

        if (!letra.matches("[A-Z]")){
            throw new IllegalArgumentException("El formato del dni no es correcto");
        }
        return true;
    }
}
