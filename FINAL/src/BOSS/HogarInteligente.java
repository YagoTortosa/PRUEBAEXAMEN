package BOSS;

import java.util.ArrayList;

public class HogarInteligente {
    private String nombre;
    private ModoHogar modoActual;
    private ArrayList<Dispositivo> dispositivos;

    public HogarInteligente(String nombre) {

        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacio");
        }

        this.nombre = nombre;
        this.modoActual = ModoHogar.DIA;
        this.dispositivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacio");
        }
        this.nombre = nombre;
    }

    public ModoHogar getModoActual() {
        return modoActual;
    }

    public void setModoActual(ModoHogar modoActual) {
        this.modoActual = modoActual;
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        if (dispositivo == null) {
            throw new IllegalArgumentException("El dispositivo no puede ser nulo");
        }
        if (dispositivos.contains(dispositivo)) {
            throw new IllegalArgumentException("El dispositivo ya existe en el hogar");
        }
        dispositivos.add(dispositivo);
    }

    public void listarDispositivos() {
        for (Dispositivo dispositivo : dispositivos) {
            System.out.println(dispositivo.getUbicacion() + " >>>>> " + dispositivo.getNombre());
        }
    }

    public void cambiarModo(ModoHogar modoNuevo) {

        if (modoNuevo == null) {
            throw new IllegalArgumentException("El modo no puede ser nulo");
        }
        if (modoNuevo == modoActual) {
            throw new IllegalArgumentException("El hogar ya está en ese modo");
        }

        modoActual = modoNuevo;

        if (modoNuevo.equals(ModoHogar.DIA)) {

            for (Dispositivo dispositivo : dispositivos) {
                if (dispositivo instanceof Bombilla) {
                    ((Bombilla) dispositivo).apagar();
                }
                if (dispositivo instanceof Termostato) {
                    ((Termostato) dispositivo).apagar();
                }
                if (dispositivo instanceof Persiana) {
                    ((Persiana) dispositivo).subir();
                }
                if (dispositivo instanceof Alarma) {
                    ((Alarma) dispositivo).apagar();
                }
            }

        } else if (modoNuevo.equals(ModoHogar.NOCHE)) {

            for (Dispositivo dispositivo : dispositivos) {
                if (dispositivo instanceof Bombilla) {
                    ((Bombilla) dispositivo).encender();
                }
                if (dispositivo instanceof Termostato) {
                    ((Termostato) dispositivo).encender();
                }
                if (dispositivo instanceof Persiana) {
                    ((Persiana) dispositivo).bajar();
                }
                if (dispositivo instanceof Alarma) {
                    ((Alarma) dispositivo).encender();
                }
            }

        } else if (modoNuevo.equals(ModoHogar.VACACIONES)) {

            for (Dispositivo dispositivo:dispositivos) {
                if (dispositivo instanceof Bombilla) {
                    ((Bombilla) dispositivo).apagar();
                }
                if (dispositivo instanceof Termostato) {
                    ((Termostato) dispositivo).apagar();
                }
                if (dispositivo instanceof Persiana) {
                    ((Persiana) dispositivo).bajar();
                }
                if (dispositivo instanceof Alarma) {
                    ((Alarma) dispositivo).encender();
                }
            }

        }
    }

}
