/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poyecto.rino;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author omarmedina
 */
public class myUtilities {
   
    
    public static void SetImageLabel(JLabel label, String root){
        ImageIcon originalIcon = new ImageIcon(root);

        // Obtener el tamaño máximo disponible en el JLabel
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();

        // Calcular el nuevo tamaño del Icon manteniendo las proporciones originales
        int newWidth, newHeight;
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();
        double widthRatio = (double) labelWidth / originalWidth;
        double heightRatio = (double) labelHeight / originalHeight;

        // Usar el ratio más pequeño para asegurarse de que el Icon encaje completamente en el JLabel
        double scaleFactor = Math.min(widthRatio, heightRatio);
        newWidth = (int) (originalWidth * scaleFactor);
        newHeight = (int) (originalHeight * scaleFactor);

        // Escalar el Icon
        Image scaledImage = originalIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        label.setIcon(scaledIcon);
        label.repaint();
    }
    public static void SetImageLabel(JLabel label, String root, Dimension dimension){
        ImageIcon originalIcon = new ImageIcon(root);

        // Obtener el tamaño máximo disponible en el JLabel
        int labelWidth = dimension.width;
        int labelHeight = dimension.height;
        // Calcular el nuevo tamaño del Icon manteniendo las proporciones originales
        int newWidth, newHeight;
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();
        double widthRatio = (double) labelWidth / originalWidth;
        double heightRatio = (double) labelHeight / originalHeight;

        // Usar el ratio más pequeño para asegurarse de que el Icon encaje completamente en el JLabel
        double scaleFactor = Math.min(widthRatio, heightRatio);
        newWidth = (int) (originalWidth * scaleFactor);
        newHeight = (int) (originalHeight * scaleFactor);

        // Escalar el Icon
        Image scaledImage = originalIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        label.setIcon(scaledIcon);
        label.repaint();
    }
    
    public static ArrayList<String> CrearListaStrings(String root, String fileName, String fileFormat, int size)
    {
        ArrayList<String> ListaTemp = new ArrayList<>();
        for(int i = 0; i < size; i++)
        {
            ListaTemp.add(root + fileName + i + fileFormat);
        }
        return ListaTemp;
    }
    
    //JSON
    private static final String JSON_FILE_PATH = "src/db/BaseDeDatos.json";
    
    public static String NombreGrado(int indexGrado) throws FileNotFoundException
    {
        String Path="db/BaseDeDatos.json";
        try (BufferedReader br = new BufferedReader(new FileReader(Path))) //Lee el json con BufferedReader
        {
            //Convierte la lectura del json en un string con StringBuilder
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) 
            {
                sb.append(line);
            }
            
            //Utiliza las librerias de JSON para acceder hasta la variable
            JSONObject grado = new JSONObject(sb.toString())
                    .getJSONArray("grados")
                        .getJSONObject(indexGrado);
            
            return grado.getString("titulo");
        } 
        catch (IOException | JSONException e) 
        {
            return "Error al leer el archivo JSON";
        }
    }    
    
    public static String NombreJuego(int indexGrado, int indexJuego) throws FileNotFoundException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) //Lee el JSON con BufferedReader
        {
            //Convierte la lectura del JSON en un string con StringBuilder
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) 
            {
                sb.append(line);
            }
            
            //Utiliza las librerias de JSON para acceder hasta la variable
            JSONObject juego = new JSONObject(sb.toString())
                    .getJSONArray("grados")
                        .getJSONObject(indexGrado)
                            .getJSONArray("juegos")
                                .getJSONObject(indexJuego);
            
            return juego.getString("titulo");
        }
        catch (IOException | JSONException e) 
        {
            return "Error al leer el archivo JSON";
        }
    }
    
    public static String ImagenJuego(int indexGrado, int indexJuego) throws FileNotFoundException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) //Lee el JSON con BufferedReader
        {
            //Convierte la lectura del JSON en un string con StringBuilder
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) 
            {
                sb.append(line);
            }
            
            //Utiliza las librerias de JSON para acceder hasta la variable
            JSONObject juego = new JSONObject(sb.toString())
                    .getJSONArray("grados")
                        .getJSONObject(indexGrado)
                            .getJSONArray("juegos")
                                .getJSONObject(indexJuego);
            
            return juego.getString("imagen");
        }
        catch (IOException | JSONException e) 
        {
            return "Error al leer el archivo JSON";
        }
    }
    
    public static String DescripcionJuego(int indexGrado, int indexJuego) throws FileNotFoundException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) //Lee el JSON con BufferedReader
        {
            //Convierte la lectura del JSON en un string con StringBuilder
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) 
            {
                sb.append(line);
            }
            
            //Utiliza las librerias de JSON para acceder hasta la variable
            JSONObject juego = new JSONObject(sb.toString())
                    .getJSONArray("grados")
                        .getJSONObject(indexGrado)
                            .getJSONArray("juegos")
                                .getJSONObject(indexJuego);
            
            return juego.getString("descripcion");
        }
        catch (IOException | JSONException e) 
        {
            return "Error al leer el archivo JSON";
        }
    }
        
    public static String RutaJuego(int indexGrado, int indexJuego) throws FileNotFoundException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) //Lee el JSON con BufferedReader
        {
            //Convierte la lectura del JSON en un string con StringBuilder
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) 
            {
                sb.append(line);
            }
            
            //Utiliza las librerias de JSON para acceder hasta la variable
            JSONObject juego = new JSONObject(sb.toString())
                    .getJSONArray("grados")
                        .getJSONObject(indexGrado)
                            .getJSONArray("juegos")
                                .getJSONObject(indexJuego);
            
            return juego.getString("ruta");
        }
        catch (IOException | JSONException e) 
        {
            return "Error al leer el archivo JSON";
        }
    }
}


