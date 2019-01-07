/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controller.*;

public class Main {
public static void main(String lai[]){
        ModelMayor model_mayor = new ModelMayor();
        ViewMayor viewmayor = new ViewMayor();
        
        ModelSuma model_suma = new ModelSuma();
        ViewSuma viewsuma = new ViewSuma();
        
        ModelOrdenar modelordenar = new ModelOrdenar();
        ViewOrdenar viewordenar = new ViewOrdenar();
        
        ModelOrdenar2 modelordenar2 = new ModelOrdenar2();
        ViewOrdenar2 viewordenar2 = new ViewOrdenar2();
        
        ModelEditorTexto model_editar_texto = new ModelEditorTexto();
        ViewEditorTexto vieweditartexto = new ViewEditorTexto();
        
        ModelsMain modelmain = new ModelsMain();
        ViewMain viewmain = new ViewMain();
        
        Object views[]=new Object[6];
        views[0]=vieweditartexto;      
        views[1]=viewmain;
        views[2]=viewmayor;
        views[3]=viewordenar;
        views[4]=viewordenar2;
        views[5]=viewsuma;
        
        ControllerMain controllermain = new ControllerMain(modelmain,views);
        ControllerMayor controller_mayor = new ControllerMayor(model_mayor,views);
        ControllerOrdenar controller_ordenar = new ControllerOrdenar(modelordenar,views);
        ControllerOrdenar2 controller_ordenar2 = new ControllerOrdenar2(modelordenar2, views);
        ControllerEditorTexto controller_editartexto = new ControllerEditorTexto(model_editar_texto, views);
        ControllerSuma controller_suma = new ControllerSuma(model_suma, views);
    }   
}