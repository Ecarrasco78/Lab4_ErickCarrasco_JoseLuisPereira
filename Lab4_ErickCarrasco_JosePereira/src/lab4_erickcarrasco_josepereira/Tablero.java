/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_erickcarrasco_josepereira;

/**
 *
 * @author erick
 */
public class Tablero {
    String[][] tablero = new String [10][10];
    int color;
    String M="";

    

    public Tablero() {
        tablero = create(tablero);
        tablero = asign(tablero);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j].equals(" ")){
                    M += "[" + "" + tablero[i][j] + "" + "]" + " ";
                }else{
                    M += "[" + "" + tablero[i][j] + "" + "]" + " ";
                }
            }
            M += "\n";
        }
        
        
    }
    
    
    
    public String [][] create (String[][]tablero){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero [i][j]=" ";
            }
        }
        return tablero;
    }
    
    public String [][] asign (String[][]tablero){
        //Superior fila 0
        tablero [0][0]= "C";
        tablero [0][2]= "F";
        tablero [0][3]= "A";
        tablero [0][4]= "R";
        tablero [0][5]= "M";
        tablero [0][6]= "A";
        tablero [0][7]= "F";
        tablero [0][9]= "C";
        //Superior fila 1
        tablero [1][0]= "D";
        tablero [1][2]= "A";
        tablero [1][3]= "D";
        tablero [1][4]= "C";
        tablero [1][5]= "F";
        tablero [1][6]= "D";
        tablero [1][7]= "A";
        tablero [1][9]= "D";
        //Inferior fila 9
        tablero [9][0]= "C";
        tablero [9][2]= "F";
        tablero [9][3]= "A";
        tablero [9][4]= "M";
        tablero [9][5]= "R";
        tablero [9][6]= "A";
        tablero [9][7]= "F";
        tablero [9][9]= "C";
        //Inferior fila 8
        tablero [8][0]= "D";
        tablero [8][2]= "A";
        tablero [8][3]= "D";
        tablero [8][4]= "F";
        tablero [8][5]= "C";
        tablero [8][6]= "D";
        tablero [8][7]= "A";
        tablero [8][9]= "D";
        
        
        return tablero;
        
    }
    
}
