
package com.com470.CalculadoraApp.controller;

import com.com470.CalculadoraApp.model.Modelo_Operacion;
import com.com470.CalculadoraApp.services.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;


public class CalculadoraController {
    Modelo_Operacion OperacionModelo = new Modelo_Operacion();

    @Autowired
    private Calculadora calculadora_simple;

    @RequestMapping("/calculadora")
    public String getCalculatorPage(Model model){
        model.addAttribute("OperacionModelo",OperacionModelo);
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="Suma", method = RequestMethod.POST)
    public String add(@ModelAttribute("OperacionModelo")  Modelo_Operacion OperacionModelo, Model model ){
        model.addAttribute("result", calculadora_simple.suma(OperacionModelo));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="Resta", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("OperacionModelo")  Modelo_Operacion OperacionModelo, Model model ){
        model.addAttribute("result", calculadora_simple.resta(OperacionModelo));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="Multiplicacion", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel")  Modelo_Operacion OperacionModelo, Model model ){
        model.addAttribute("result", calculadora_simple.multiplicacion(OperacionModelo));
        return "calculadora";
    }

    @RequestMapping(value="/calculadora", params="Division", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel")  Modelo_Operacion OperacionModelo, Model model ){
        model.addAttribute("result", calculadora_simple.division(OperacionModelo));
        return "calculadora";
    }

    
}
