/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.ModelOrdenar;
import views.ViewOrdenar;


public class ControllerOrdenar {
    private final ModelOrdenar model_ordenar;
    private final ViewOrdenar view_ordenar;
   
    
    public ControllerOrdenar(ModelOrdenar mo, Object views[]){
        this.model_ordenar = mo;
        this.view_ordenar = (ViewOrdenar) views[3];
        initView();
    }

    private void initView() {
       view_ordenar.jTextField_ordenar.setText("" + model_ordenar.getNumero_Insertado());
       view_ordenar.jTextField_resiltado.setText("" + model_ordenar.getPromedio());
       view_ordenar.jButton_agregar.addActionListener(e -> jButton_agregarMouseClicked());
       view_ordenar.jButton_asc.addActionListener(e -> jButton_ascMouseClicked());
       view_ordenar.jButton_promedio.addActionListener(e -> jButton_promedioMouseClicked());
       model_ordenar.Crear_Modelo_Lista();
       view_ordenar.jList_listanum.setModel(model_ordenar.getModelo_lista());
    }

    private void jButton_agregarMouseClicked() {
       model_ordenar.setNumero_Insertado(Double.parseDouble(view_ordenar.jTextField_ordenar.getText()));
       model_ordenar.Insertar_Valor();
    }

    private void jButton_ascMouseClicked() {
        model_ordenar.Ordenar_Ascendente();
        view_ordenar.jList_listanum.setModel( model_ordenar.getModelo_lista());
    }

    private void jButton_promedioMouseClicked() {
        model_ordenar.Promediar_Lista();
        view_ordenar.jTextField_resiltado.setText("" + model_ordenar.getPromedio());
    }
    
}
