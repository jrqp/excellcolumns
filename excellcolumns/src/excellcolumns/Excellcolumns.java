/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excellcolumns;
import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class Excellcolumns {

public static void main(String[] args) {    
        String[] columnombres = generateExcelColumnNames(350);
        
        for (String columnnombres : columnombres)
        {
            System.out.print(columnnombres + " ");
        }
    }
    
    public static String[] generateExcelColumnNames(int conteocolumna)
    {
        String[] columna = new String[conteocolumna];
        int caracter = 65;
        int posicion=0;
        columna[0]="";
        int indicador=0;
        if(conteocolumna<1)
        {
            columna[0]="Cantidad debe de ser mayor a 1";
            return columna;
        }        
        if(conteocolumna>10000)
        {
            columna[0]="Cantidad debe de ser menor a 10000";
            return columna;
        }
        for (int i=0;i<conteocolumna;i++)
        {
            if(indicador==0)
            {
                columna[i]=""+Character.toString((char)caracter);
            }
            if(indicador!=0)
            {
                columna[i]=columna[posicion]+Character.toString((char)caracter);
            }
            if(caracter == 90)
            {
                caracter = 64;
                if(indicador==0)
                {
                    indicador++;
                }
                else
                {
                    posicion = posicion+1;
                }
            }
            caracter++;
            
        }
        
        
        return columna;
    }
    
}