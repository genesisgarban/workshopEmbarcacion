import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("\n\t\t--------------------------------");
        System.out.println("\t\tBienvenido al sistema de alquiler de embarcaciones Makaia");
        System.out.println("\t\tSeleccione la opción que desea alquilar: ");
        System.out.println("\t\t1. Yate de lujo.");
        System.out.println("\t\t2. Yate normal.");
        System.out.println("\t\t3. Velero pequeño.");
        System.out.println("\t\t4. Velero grande.");
        System.out.println("\t\t--------------------------------");
        System.out.println("");

        int opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:
                Capitan capitan1 = new Capitan("Pedro", "Gonzalez", "TTE890");
                Yate yateDeLujo = new Yate(capitan1, 700000,20000,2022, 30,8);
                double montoYateLujo = yateDeLujo.calcularMontoAlquiler();
                System.out.println("Has alquilado un Yate de lujo.");
                System.out.println("Detalles de la embarcación:");
                System.out.println("Capitán: " + yateDeLujo.getCapitan().getNombre() + " " + yateDeLujo.getCapitan().getApellido());
                System.out.println("Matrícula de Navegación del Capitán: " + yateDeLujo.getCapitan().getMatriculaNavegacion());
                System.out.println("Precio Base: $" + yateDeLujo.getPrecioBase());
                System.out.println("Año de Fabricación: " + yateDeLujo.getAnioFabricacion());
                System.out.println("Eslora: " + yateDeLujo.getEslora() + " metros");
                System.out.println("Monto de alquiler: $" + montoYateLujo);
                break;

            case 2:

                Capitan capitan2 = new Capitan("Pepe", "Alvarez", "OJP456");
                Yate yateNormalNuevo = new Yate(capitan2,  500000,0,2019,15,5);

                double montoYateNormal = yateNormalNuevo.calcularMontoAlquiler();
                System.out.println("Has alquilado un Yate normal.");
                System.out.println("Detalles de la embarcación:");
                System.out.println("Capitán: " + yateNormalNuevo.getCapitan().getNombre() + " " + yateNormalNuevo.getCapitan().getApellido());
                System.out.println("Matrícula de Navegación del Capitán: " + yateNormalNuevo.getCapitan().getMatriculaNavegacion());
                System.out.println("Precio Base: $" + yateNormalNuevo.getPrecioBase());
                System.out.println("Año de Fabricación: " + yateNormalNuevo.getAnioFabricacion());
                System.out.println("Eslora: " + yateNormalNuevo.getEslora() + " metros");
                System.out.println("Monto de alquiler: $" + montoYateNormal);
                break;

            case 3:
                Capitan capitan3 = new Capitan("Luis", "Mendez", "RTU786");
                Velero veleroPequenoNuevo = new Velero(capitan3, 500000,0,2019,25,3);

                double montoVeleroPequeno = veleroPequenoNuevo.calcularMontoAlquiler();
                System.out.println("Has alquilado un Velero pequeño.");
                System.out.println("Detalles de la embarcación:");
                System.out.println("Capitán: " + veleroPequenoNuevo.getCapitan().getNombre() + " " + veleroPequenoNuevo.getCapitan().getApellido());
                System.out.println("Matrícula de Navegación del Capitán: " + veleroPequenoNuevo.getCapitan().getMatriculaNavegacion());
                System.out.println("Precio Base: $" + veleroPequenoNuevo.getPrecioBase());
                System.out.println("Año de Fabricación: " + veleroPequenoNuevo.getAnioFabricacion());
                System.out.println("Eslora: " + veleroPequenoNuevo.getEslora() + " metros");
                System.out.println("Monto de alquiler: $" + montoVeleroPequeno);
                break;

            case 4:
                Capitan capitan4 = new Capitan("Camilo", "Suarez", "GUH265");
                Velero veleroGrandeNuevo = new Velero(capitan4, 800000,20000,2022,40,5);

                double montoVeleroGrande = veleroGrandeNuevo.calcularMontoAlquiler();
                System.out.println("Has alquilado un Velero grande.");
                System.out.println("Detalles de la embarcación:");
                System.out.println("Capitán: " + veleroGrandeNuevo.getCapitan().getNombre() + " " + veleroGrandeNuevo.getCapitan().getApellido());
                System.out.println("Matrícula de Navegación del Capitán: " + veleroGrandeNuevo.getCapitan().getMatriculaNavegacion());
                System.out.println("Precio Base: $" + veleroGrandeNuevo.getPrecioBase());
                System.out.println("Año de Fabricación: " + veleroGrandeNuevo.getAnioFabricacion());
                System.out.println("Eslora: " + veleroGrandeNuevo.getEslora() + " metros");
                System.out.println("Monto de alquiler: $" + montoVeleroGrande);
                break;

            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                break;
        }
    }
}
