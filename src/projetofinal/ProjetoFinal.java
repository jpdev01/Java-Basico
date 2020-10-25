/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author jptru
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video ("Aula 01 de POO");
        v[1] = new Video ("Aula 02 de HTML");
        v[2] = new Video ("Aula 03 de JAVA");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] =  new Gafanhoto ("Jubileu", 22, "M", "mylogin");
        g[1] = new Gafanhoto ("Creuza", 12, "F", "mylog");
        
//        v[0].play();
//        System.out.println(v[0].toString());
//        System.out.println(g[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]); // jubileu assiste POO
        vis[1] = new Visualizacao(g[0], v[1]); //jubileu assiste HTML
        
        vis[0].avaliar();
        vis[1].avaliar(87.0f);
        System.out.println(vis[0].toString()); 
        System.out.println(vis[1].toString());
    }
    
}
