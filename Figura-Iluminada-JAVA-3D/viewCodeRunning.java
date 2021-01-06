/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amazing;

import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

/**@author Yuri Domingos UCAN (Universidade Católica de Angola )
 * Data   : 06 - 01 - 2021
 * Objectivo : Criar uma figura Iluminada
 *

 */
public class viewCodeRunning {

    
    
    private Standy functions;
    private SimpleUniverse universe = new SimpleUniverse();
    private DirectionalLight ligth = new DirectionalLight();
    private BranchGroup root = new BranchGroup();
    private Color3f color = new Color3f(1.6f,0.1f,0.2f);

    public viewCodeRunning () {
        
        
            functions = new Standy();
            Sphere sphere = new Sphere(0.4f);
            root.addChild(sphere);
            functions.DesignCenary(ligth, color, root);
            functions.ConnectionElemenCenary(universe, root);
         
    }
 
    
    public static void main(String[] args) {

         new viewCodeRunning ();
    }
    
}
