/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amazing;

import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

/**
 *
 * @author Yuri Domingos UCAN (Universidade Católica de Angola )
 * Data   : 06 - 01 - 2021
 * Objectivo  : Desenhar uma figura Iluminada
 
 OBS : O nome deste ficheiro é Standy, estou a ouvir a música Standy By me  ( kkkkkkkkk )
 */
public class Standy {

        
    
    
    
    public void DesignCenary(DirectionalLight light , Color3f colorLight, BranchGroup sourceRoot)
    {
        // toda cor no nosso cenário, precisa ter uma certa intensidade de iluminação, da origem até um certo ponto ( alhás aqui no ( JAVA 3D ) , a tal expressão é já  metros whe,  então  os 3 primeiros pontos da função Point3D  representam os 3 eixos do 
        // do plano tridimensional ( X,Y,Z ) -> neste casso partimos da origem até 90 metros 
        
        BoundingSphere bounds_intensity = new BoundingSphere(new Point3d(0.0,0.0,0.0), 90.0);
        Vector3f lightDirection = new Vector3f(3.0f,-6.0f,-10.0f);
        light = new DirectionalLight (colorLight,lightDirection);
        light.setInfluencingBounds(bounds_intensity);
        sourceRoot.addChild(light);
      
    }
    
    
    // Esta função faz a junção de todos os elementos do nosso cenário gráfico I mean , faz o kistom todo kkkkkkkk
    
     public void ConnectionElemenCenary(SimpleUniverse virtual_universe, BranchGroup sourse)
     {
         
        virtual_universe.getViewingPlatform().setNominalViewingTransform();
        virtual_universe.addBranchGraph(sourse);
        
     }
    
 
}
