/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuraanimada;

import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

/**
 *
 * @author    : Yuri Domingos
 * Data       : 7 - 01 - 2020
 * Objectivo  : Criar todas funções necessárias para o desenvolvimento da nossa função 
 */
public class BodyBehavior {
    
    
    
    
   
    
     
    public void  AnimationTransform3D(TransformGroup transformGroup, Transform3D transform3D, double counter, Thread thread)
    {
     
        
        Thread primer_thread = Thread.currentThread();
        
        while( primer_thread == thread)
        {
            try {
                
                  counter +=0.1;
                  transform3D.rotY(counter);
                  transformGroup.setTransform(transform3D);
                  Thread.sleep(100);
                
                
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        
        
    }
    
    
   public void TransformStyle(TransformGroup transformGroup, Transform3D transform3D, BranchGroup root)
   {
       
       //-- Figure Criation 
       Sphere sphere = new Sphere(0.4f);
       transformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
       transformGroup.setTransform(transform3D);
       transformGroup.addChild(sphere);
       root.addChild(transformGroup);
       
       
   }
    
   public void DesignStyle3D(BranchGroup root)
   {
       Color3f colorLight = new Color3f(0.8f,2.1f,0.1f);
       BoundingSphere sphere = new BoundingSphere(new Point3d(0.0,0.0,0.0), 120.0);
       Vector3f lightDirection = new Vector3f(5.0f,-6.0f,-10.0f);
       DirectionalLight lighDeseinStyle = new DirectionalLight(colorLight, lightDirection);
       lighDeseinStyle.setInfluencingBounds(sphere);
       root.addChild(lighDeseinStyle);
      
   }
   
   
    
   public void ConnectionElementCenary3D(SimpleUniverse universe, BranchGroup rootSourse)
   {
       universe.getViewingPlatform().setNominalViewingTransform();
       universe.addBranchGraph(rootSourse);
       
   }
    
}
