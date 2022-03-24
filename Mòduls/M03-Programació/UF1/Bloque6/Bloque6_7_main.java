/*package Bloque6;

import java.util.Scanner;

public class Bloque6_7_main {

    public static final int trabj = 4;
    public static final int deps = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        classBL71 trabajadores[] = new classBL71[trabj];
        classBL72 departamentos[] = new classBL72[deps];

        llenaEmp(trabajadores);
        llenaDep(departamentos);
        String dep;

        do {
            System.out.println("Intro departament: ");
            dep = in.nextLine();

        } while (!checkDepa(departamentos, dep));
        datosDep(departamentos, trabajadores, dep);

        System.out.println("Nuevo telefono: ");
        String nuevoTel = in.nextLine();
        trabajadores[0].setTelefon(nuevoTel);
        System.out.println(trabajadores[0].toString());

    }

    public static void datosDep(classBL72[] departamentos, classBL71[] trabajadores, String dep) {
        int horas = 0;
        double sueldo = 1;
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].getCodigo().equals(dep)) {
                horas = departamentos[i].getHoras();
                sueldo = departamentos[i].getSueldo();
            }
            break;
        }
        int trabajador = 0;
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i].getDepartament().equals(dep)) {
                trabajador++;

            }
        }
        System.out.println("Departamento: " + dep);
        System.out.println("Trabajadores: " + trabajador);
        System.out.println("Sueldo: " + sueldo * trabajador);
        System.out.println("Horas: " + horas * trabajador);
    }

    public static void llenaEmp(classBL71[] trabajadores) {
        trabajadores[0] = new classBL71("Pepe", 25, "942591045", "Ventas");
        trabajadores[1] = new classBL71("Lucia", 21, "471957392", "Logistica");
        trabajadores[2] = new classBL71("Martha", 36, "938935473", "Ventas");
        trabajadores[3] = new classBL71("Hector", 19, "139084934", "Administración");
    }

    public static void llenaDep(classBL72[] departamentos) {
        departamentos[0] = new classBL72(40, 30.50, "Administración");
        departamentos[1] = new classBL72(50, 45.50, "Ventas");
        departamentos[2] = new classBL72(60, 59.08, "Logistica");

    }

    public boolean checkDepa(classBL72[] departamentos, String dep) {
        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i].getCodigo().equals(dep)) {
                return true;
            }
        }
        return false;
    }

        }
*/