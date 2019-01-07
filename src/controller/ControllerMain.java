/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelsMain;
import views.ViewEditorTexto;
import views.ViewMain;
import views.ViewMayor;
import views.ViewOrdenar;
import views.ViewOrdenar2;
import views.ViewSuma;


public class ControllerMain {
    private final ModelsMain model_main;
    private final ViewMain view_main;
    private final ViewMayor view_mayor;
    private final ViewOrdenar view_ordenar;
    private final ViewOrdenar2 view_ordenar2;
    private final ViewSuma view_suma;
    private final ViewEditorTexto view_editartexto;
    
    
    public ControllerMain(ModelsMain model_main, Object views[]){
    this.model_main = model_main;
        this.view_editartexto = (ViewEditorTexto)views[0];
        this.view_main = (ViewMain)views[1];
        this.view_mayor = (ViewMayor)views[2]; 
        this.view_ordenar = (ViewOrdenar)views[3];
        this.view_ordenar2 = (ViewOrdenar2)views[4];
        this.view_suma = (ViewSuma)views[5]; 
        InitView();
    }

    private void InitView(){
        this.view_main.jmiMayor.addActionListener(e -> jmiMayorMouseClicked());
        this.view_main.jmiOperaciones.addActionListener(e -> jmiOperacionesMouseClicked());
        this.view_main.jmiOrdenar.addActionListener(e -> jmiOrdenarMouseClicked());
        this.view_main.jmiOrdenar2.addActionListener(e -> jmiOrdenar2MouseClicked());
        this.view_main.jmiNotas.addActionListener(e -> jmiNotasMauseClicked());
        this.view_main.setLocationRelativeTo(null);
        this.view_main.setVisible(true);
        
    }

    private void jmiMayorMouseClicked() {
        view_main.setContentPane(view_mayor);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmiOperacionesMouseClicked() {
        view_main.setContentPane(view_suma);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmiOrdenarMouseClicked() {
        view_main.setContentPane(view_ordenar);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmiOrdenar2MouseClicked() {
        view_main.setContentPane(view_ordenar2);
        view_main.revalidate();
        view_main.repaint();
    }

    private void jmiNotasMauseClicked() {
        view_main.setContentPane(view_editartexto);
        view_main.revalidate();
        view_main.repaint();
    }
}
