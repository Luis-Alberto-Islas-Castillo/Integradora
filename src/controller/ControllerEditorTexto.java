
package controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import models.ModelEditorTexto;
import views.ViewEditorTexto;


public class ControllerEditorTexto {
private ViewEditorTexto view_editortexto;
private ModelEditorTexto model_editortexto;
private FileWriter fw;
private FileReader fr =null;
private JFileChooser jfc = new JFileChooser(); 


    public ControllerEditorTexto(ModelEditorTexto model_editortexto,Object views[]) {
         this.model_editortexto= model_editortexto;
         this.view_editortexto= view_editortexto;
         this.view_editortexto = (views.ViewEditorTexto) views[0];
         initView();
    }


private void jmi_abrir(){
    try{
        jfc.showOpenDialog(view_editortexto);
        model_editortexto.setArchivo(jfc.getSelectedFile());
        fr= new FileReader(model_editortexto.getArchivo());
        int character =0;
        String texto ="";
        while((character = fr.read())!=-1){
            texto +=(char)character;
        }
        fr.close();
        view_editortexto.jta_archivo.setText(texto);
    }
    catch(FileNotFoundException e){
        System.err.print("Archivo no encontrado");
    }
    catch(IOException e){
        System.err.print("Error en el Archivo");
    }
    finally{
        try{
            fr.close();
        }
        catch(IOException err){
        System.err.print("Error al Cerrar");   
            }
        }
    }

private void jmi_guardar(){
    try{
        fw = new FileWriter(model_editortexto.getArchivo(),false);
        fw.write(view_editortexto.jta_archivo.getText());
        System.out.println("se guardo"+ model_editortexto.archivo.getName());
        fw.close();
    }
    catch(FileNotFoundException e){
        System.err.print("Archivo no encontrado");
    }
    catch(IOException e){
        System.err.print("Error en el Archivo");
    }
    finally{
        try{
            fr.close();
        }
        catch(IOException err){
        System.err.print("Error al Cerrar");   
            }
        }
    }

private void jmi_salir(){
    System.exit(0);
    }

    private void initView() {
       this.view_editortexto.setLocationRelativeTo(null);
       this.view_editortexto.setVisible(true); 
       view_editortexto.jmi_abrir.addActionListener(e -> jmi_abrirclick());
       view_editortexto.jmi_guardar.addActionListener(e -> jmi_guardarclick());
       view_editortexto.jmi_salir.addActionListener(E -> jmi_salirclick());
    }

    private void jmi_abrirclick() {
        jmi_abrir();
    }

    private void jmi_guardarclick() {
        jmi_guardar();
    }

    private void jmi_salirclick() {
        jmi_salir();
    }
}