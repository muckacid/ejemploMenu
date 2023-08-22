/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomenu;

import java.io.IOException;
import java.util.ArrayList;
import model.MenuController;
import model.Option;

/**
 *
 * @author morag
 */
public class EjemploMenu {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        MenuController menu = new MenuController();
        menu.addOption(new Option(0, "opcion0", "Salir"));
        menu.addOption(new Option(1, "opcion1", "Crear"));
        menu.addOption(new Option(2, "opcion2", "Eliminar"));
        menu.addOption(new Option(3, "opcion3", "Modificar"));
        menu.addOption(new Option(4, "opcion4", "Ver"));
        menu.addOption(new Option(5, "opcion5", "Listar"));
        boolean runAplication = true;
        
        
        do {
            menu.printMenu();
            int op = menu.selectOption();
            limpiarPantalla();
            switch (op) {
                case 0 -> {
                    System.out.println("Ejecicion de la opcion -> " + menu.getOption(op).getOptionText());
                    runAplication = false;
                }
                case 1 -> {
                    System.out.println("Ejecicion de la opcion -> " + menu.getOption(op).getOptionText());
                }
                case 2 -> {
                    System.out.println("Ejecicion de la opcion -> " + menu.getOption(op).getOptionText());
                }
                case 3 -> {
                    System.out.println("Ejecicion de la opcion -> " + menu.getOption(op).getOptionText());
                }
                case 4 -> {
                    System.out.println("Ejecicion de la opcion -> " + menu.getOption(op).getOptionText());
                }
                case 5 -> {
                    System.out.println("Ejecicion de la opcion -> " + menu.getOption(op).getOptionText());
                }
                default ->{
                    System.out.println("Ejecicion de la opcion -> " + menu.getOption(op).getOptionText());
                }
            }
        } while (runAplication);
    }
    
    
    private static void limpiarPantalla() {
        
        try {
            
            String sistemaOperativo = System.getProperty("os.name");
            ArrayList<String> comando = new ArrayList();
        
            if (sistemaOperativo.contains("Windows")) {
                comando.add("cmd");
                comando.add("/C");
                comando.add("cls");

            } else {
                comando.add("clear");
            }

            ProcessBuilder pb = new ProcessBuilder(comando);
            Process iniciarProceso = pb.inheritIO().start();
            iniciarProceso.waitFor();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al limpiar la pantalla" + e.getMessage());
        }
    }
    
}
