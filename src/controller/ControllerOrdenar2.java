/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.ModelOrdenar2;
import views.ViewOrdenar2;


public class ControllerOrdenar2 {
    private final ModelOrdenar2 model_ordenar2;
    private final ViewOrdenar2 view_ordenar2;

    public ControllerOrdenar2(ModelOrdenar2 model_ordenar2,Object views[]){
     this.model_ordenar2 = model_ordenar2;
     this.view_ordenar2 = (ViewOrdenar2) views[4];
     initView();
    }

    private void initView() {
       view_ordenar2.jTextField_numeros.setText("" + model_ordenar2.getNumero_Insertado());
       view_ordenar2.jTextField_resultado.setText("" + model_ordenar2.getPromedio());
       view_ordenar2.jButton_agregar.addActionListener(e -> jButton_agregarMouseClicked());
       view_ordenar2.jButton_asc.addActionListener(e -> jButton_ascMouseClicked());
       view_ordenar2.jButton_promedio.addActionListener(e -> jButton_promedioMouseClicked());
       view_ordenar2.jButton_eliminar.addActionListener(e -> jButton_eliminarMouseClicked());
       view_ordenar2.jButton_des.addActionListener(e -> jButton_desMouseClicked());
       model_ordenar2.Crear_Modelo_Lista();
       view_ordenar2.jList_numeros.setModel(model_ordenar2.getModelo_lista());
    }

    private void jButton_agregarMouseClicked() {
        model_ordenar2.setNumero_Insertado(Double.parseDouble(view_ordenar2.jTextField_numeros.getText()));
        model_ordenar2.Insertar_Valor();
    }

    private void jButton_ascMouseClicked() {
        model_ordenar2.Ordenar_Ascendente();
        view_ordenar2.jList_numeros.setModel(model_ordenar2.getModelo_lista());
    }

    private void jButton_desMouseClicked() {
        model_ordenar2.Ordenar_Descendente();
        view_ordenar2.jList_numeros.setModel(model_ordenar2.getModelo_lista());
    }

    private void jButton_eliminarMouseClicked() {
        model_ordenar2.Eliminar_Valor(view_ordenar2.jList_numeros.getSelectedIndex());
        view_ordenar2.jList_numeros.setModel(model_ordenar2.getModelo_lista());
    }

    private void jButton_promedioMouseClicked() {
        model_ordenar2.Promediar_Lista();
        view_ordenar2.jTextField_resultado.setText(""+ model_ordenar2.getPromedio());
    }   
}