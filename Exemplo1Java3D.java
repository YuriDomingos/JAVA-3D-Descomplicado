/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exemplo1Java3D;

/**
 *
 * @author Yuri Domingos 
 * Data   : 05 -01 - 2021
 * Objectivo construir os primeiros passos de dese\ nvolvimentos com a API java 3D
 */


import javax.media.j3d.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.*;

public class Exemplo1Java3D {

    
    public Exemplo1Java3D()
    {
        // o nosso cenário   
        SimpleUniverse universe = new SimpleUniverse();
        BranchGroup group = new BranchGroup(); // cria a mossa raiz
        group.addChild(new ColorCube(0.5)); // adicona um elemnto na nossa hierarquia
      
        Connect_Cenary_Element(universe, group); // conecta os dois elementos na nossa hierarquia 
        
        
    }
    
   
    private void Connect_Cenary_Element(SimpleUniverse simple, BranchGroup group)
    {
        simple.getViewingPlatform().setNominalViewingTransform(); //aponta o visualisador para que lhe olhe ( objecto actual of grafo  )  ! 
        simple.addBranchGraph(group);
        
    }
    
    
    public static void main(String[] args) {
        
        new Exemplo1Java3D();
    }
}
