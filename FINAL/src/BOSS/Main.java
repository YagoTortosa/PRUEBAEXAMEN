package BOSS;

public class Main {
    public static void main(String[] args) {
        try{
            Bombilla bombilla=new Bombilla("Lampara",Ubicacion.SALON);
            Persiana persiana=new Persiana("persiana",Ubicacion.ENTRADA);
            Persiana persiana1=new Persiana("persiana",Ubicacion.ENTRADA);
            Termostato termostato=new Termostato("falgor",Ubicacion.ASEO);
            Alarma alarma=new Alarma("direct",Ubicacion.DORMITORIO);
            Alarma alarma1=new Alarma("hola",Ubicacion.SALON);
            HogarInteligente hogarInteligente=new HogarInteligente("manel");

            hogarInteligente.agregarDispositivo(termostato);
            hogarInteligente.agregarDispositivo(bombilla);
            hogarInteligente.agregarDispositivo(alarma);
            hogarInteligente.agregarDispositivo(persiana);
            hogarInteligente.agregarDispositivo(alarma1);
            hogarInteligente.listarDispositivos();
            hogarInteligente.agregarDispositivo(persiana1);
            hogarInteligente.getDispositivos().sort(Dispositivo::compareTo);
            System.out.println();
            hogarInteligente.listarDispositivos();


            persiana.bajar();

            persiana.subir();
            System.out.println();
            hogarInteligente.cambiarModo(ModoHogar.NOCHE);
            System.out.println(termostato.mostrarEstado());
            System.out.println(bombilla.mostrarEstado());
            System.out.println(alarma.mostrarEstado());
            System.out.println(persiana1.mostrarEstado());
            System.out.println();
            hogarInteligente.cambiarModo(ModoHogar.DIA);
            System.out.println(termostato.mostrarEstado());
            System.out.println(bombilla.mostrarEstado());
            System.out.println(alarma.mostrarEstado());
            System.out.println(persiana1.mostrarEstado());
            System.out.println();
            hogarInteligente.cambiarModo(ModoHogar.VACACIONES);
            System.out.println(termostato.mostrarEstado());
            System.out.println(bombilla.mostrarEstado());
            System.out.println(alarma.mostrarEstado());
            System.out.println(persiana1.mostrarEstado());
            alarma1.apagar();
            System.out.println(alarma1.detectarIntrusion());
            

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}