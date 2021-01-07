/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuraanimada;

/**
 *
 * @author : Yuri Domingos 
 * Data    : 7 - 01 - 2020
 * Objectivo : Animar uma figura iluminada no java 3D
 */

import javax.media.j3d.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.*;
import javax.vecmath.*;
public class FiguraAnimada implements Runnable {
    
    
    
    // Local Variables 
    
   private SimpleUniverse universe = new SimpleUniverse();
   private BranchGroup    rootSource = new BranchGroup();
   private BodyBehavior body = new BodyBehavior();
   private TransformGroup transformGroup = new TransformGroup();
   private Transform3D transform3D = new Transform3D();
   private Thread thread = new Thread(this);

    public FiguraAnimada() {
        
        body.DesignStyle3D(rootSource);
        body.TransformStyle(transformGroup,transform3D,rootSource);
        body.ConnectionElementCenary3D(universe, rootSource);
        
        //-- we  begin the thread here 
        thread.start();
        
    }
   
   
  
    
    public static void main(String[] args) {
        
        new FiguraAnimada();
     
    }

    @Override
    public void run() {
        body.AnimationTransform3D(transformGroup, transform3D, 0.0, thread);
        
    }
    
}
