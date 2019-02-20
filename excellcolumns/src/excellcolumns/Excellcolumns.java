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
        String[] columnNames = generateExcelColumnNames(350);
        
        for (String columnName : columnNames)
        {
            System.out.print(columnName + " ");
        }
    }
    
    public static String[] generateExcelColumnNames(int columnCount)
    {
        String[] columns = new String[columnCount];
        int caracter = 65;
        int posicion=0;
        columns[0]="";
        int indicador=0;
        if(columnCount<1)
        {
            columns[0]="Cantidad debe de ser mayor a 1";
            return columns;
        }        
        if(columnCount>10000)
        {
            columns[0]="Cantidad debe de ser menor a 10000";
            return columns;
        }
        for (int i=0;i<columnCount;i++)
        {
            if(indicador==0)
            {
                columns[i]=""+Character.toString((char)caracter);
            }
            if(indicador!=0)
            {
                columns[i]=columns[posicion]+Character.toString((char)caracter);
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
        
        
        return columns;
    }
    
}