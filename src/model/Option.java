/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author morag
 */
public class Option {
    private int optionId;
    private String optionText;
    private String optionFunction;

    
    public Option(int option_id, String option_function, String option_text) {
        optionId = option_id;
        optionText = option_text;
        optionFunction = option_function;
    }

    public int getOptionId() {
        return optionId;
    }

    public String getOptionText() {
        return optionText;
    }
    
    public String getOptionFunction() {
        return optionFunction;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public void setOptionFunction(String optionFunction) {
        this.optionFunction = optionFunction;
    }
    
    @Override
    public String toString() {
        return "| [" + optionId + "] " + optionText;
    }
    
}
