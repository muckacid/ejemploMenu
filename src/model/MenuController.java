/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author morag
 */
public class MenuController {
    
    private ArrayList<Option> options;
    
    public MenuController() {
        options = new ArrayList<>();
    }
    
    
    public void printMenu() {
        System.out.println("+------------------------------------");
        System.out.println("| Bienvenido");
        
        for (int i = 0; i < options.size(); i++) {
            Option option = options.get(i);
            System.out.println("| "+ option.getOptionId() +": "+ option.getOptionText());
        }
        
        System.out.println("+------------------------------------");
    }
    
    public int selectOption(){
        Scanner input = new Scanner(System.in);
        System.out.print("| Selecciona una opcion para continuar: ");
        return input.nextInt();
    }
    
    public Option getOption(int option){
        return options.get(option);
    }
    
    public void addOption(Option option){
        options.add(option);
    }
    
    
}
