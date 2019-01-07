/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.ModelMayor;
import views.ViewMayor;

public class ControllerMayor {

ModelMayor  model_mayor;
ViewMayor   view_mayor;

public ControllerMayor(ModelMayor model_mayor, Object[] views) {
    this.model_mayor= model_mayor;
    this.view_mayor= (ViewMayor) views[2];
    initView();
    }

public void initView(){
    view_mayor.jtf_n1.setText(String.valueOf(model_mayor.getN1()));
    view_mayor.jtf_n2.setText(String.valueOf(model_mayor.getN2()));
    view_mayor.jtf_n3.setText(String.valueOf(model_mayor.getN3()));
    view_mayor.jtf_m.setText(String.valueOf(model_mayor.getM()));
    view_mayor.setVisible(true);
    view_mayor.jbtn_mayor.addActionListener(e -> jbtn_mayor_click());
}
public void jbtn_mayor_click(){
    model_mayor.setN1(Integer.parseInt(view_mayor.jtf_n1.getText()));
    model_mayor.setN2(Integer.parseInt(view_mayor.jtf_n2.getText()));
    model_mayor.setN3(Integer.parseInt(view_mayor.jtf_n3.getText()));
    model_mayor.mayor();
    
    view_mayor.jtf_m.setText(String.valueOf(model_mayor.getM()));
  }
}

