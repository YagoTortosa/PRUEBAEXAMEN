package EJ8;

import java.util.ArrayList;


public class ProbarEmpresa {

    public static void main(String[] args) {

        // ── Crear dispositivos ──────────────────────────────────────────────
        Portatil portatil1 = new Portatil("Dell XPS 15");
        Portatil portatil2 = new Portatil("MacBook Pro");
        Movil movil1 = new Movil("Samsung Galaxy S24");
        Movil movil2 = new Movil("iPhone 15");

        portatil1.encender();
        movil1.encender();

        // ── Crear empleados ─────────────────────────────────────────────────
        JefeEquipo jefe = new JefeEquipo("Carlos", 3000.0, portatil1);
        Programador prog1 = new Programador("Elena", 2600.0, portatil2);
        Programador prog2 = new Programador("Ana", 2500.0);         // sin dispositivo
        Administrativo admin1 = new Administrativo("Luis", 2000.0, movil1);
        Administrativo admin2 = new Administrativo("Pedro", 3200.0, movil2);

        // ── Probar getters y setters ────────────────────────────────────────
        System.out.println("=== GETTERS Y SETTERS ===");
        System.out.println("Nombre jefe antes: " + jefe.getNombre());
        jefe.setNombre("Carlos");
        System.out.println("Nombre jefe después: " + jefe.getNombre());
        System.out.println("Salario base jefe: " + jefe.getSalarioBase());
        System.out.println();

        // ── Probar VPN ──────────────────────────────────────────────────────
        System.out.println("=== ESTADO VPN ===");
        System.out.println(jefe.getNombre() + " VPN inicial: " + jefe.estadoConexionVPN());
        jefe.conectarVPN();
        System.out.println(jefe.getNombre() + " VPN tras conectar: " + jefe.estadoConexionVPN());
        prog1.conectarVPN();
        System.out.println(prog1.getNombre() + " VPN: " + prog1.estadoConexionVPN());
        System.out.println();

        // ── Crear empresa y añadir empleados ────────────────────────────────
        Empresa empresa = new Empresa("TechSolutions S.L.");
        empresa.agregarEmpleado(jefe);
        empresa.agregarEmpleado(prog1);
        empresa.agregarEmpleado(prog2);
        empresa.agregarEmpleado(admin1);
        empresa.agregarEmpleado(admin2);

        System.out.println("=== EMPRESA ===");
        System.out.println(empresa);
        System.out.println();

        // ── Mostrar información de todos los empleados ──────────────────────
        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===");
        for (Empleado e : empresa.getEmpleados()) {
            e.mostrarInformacion();
            System.out.println("  Salario con bono: " + e.calcularSalario() + " euros");
            System.out.println();
        }

        // ── Ranking por salario base (ascendente) ───────────────────────────
        ArrayList<Empleado> ranking = new ArrayList<>(empresa.getEmpleados());
        ranking.sort(new ComparaSalario());

        System.out.println("RANKING POR SALARIO:");
        System.out.println("====================================================");
        int pos = 1;
        for (Empleado e : ranking) {
            System.out.println(pos + " -> Empleado: " + e.getNombre()
                    + " / Salario: " + e.getSalarioBase() + " euros");
            pos++;
        }
        System.out.println();

        // ── Probar equals en dispositivos ───────────────────────────────────
        System.out.println("=== EQUALS DISPOSITIVOS ===");
        Portatil p1 = new Portatil("Dell XPS 15");
        Portatil p2 = new Portatil("Dell XPS 15");
        Portatil p3 = new Portatil("MacBook Pro");
        System.out.println("p1.equals(p2) [mismo modelo]: " + p1.equals(p2));   // true
        System.out.println("p1.equals(p3) [distinto modelo]: " + p1.equals(p3)); // false

        // ── Probar constructor con nombre/salario inválido ───────────────────
        System.out.println();
        System.out.println("=== VALIDACIONES ===");
        try {
            Administrativo invalido = new Administrativo("", 1500.0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error esperado (nombre vacío): " + ex.getMessage());
        }
        try {
            Administrativo invalido2 = new Administrativo("María", -500.0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error esperado (salario negativo): " + ex.getMessage());
        }
    }
}
