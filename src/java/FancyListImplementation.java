
import com.pack1.FancyList;
import com.pack1.NumberListService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@Stateful(mappedName="FancyListJNDIName")
public class FancyListImplementation implements FancyList {
    
   @EJB(mappedName="NumberListJNDIName")
   private NumberListService service ;
   private List<Double> nums =new ArrayList<>();
   public void initializeNumbers(int size, double range){
   nums = service.getNumbers(size,range);
}
  public List<Double> getNum(){
        return(nums);
    }
   public double getSum(){
         double sum=0;
        for(double num : nums){
            sum=sum+num;
                               }
        return(sum);
                         } 
 public double getSmallest(){
            return(Collections.min(nums));
                            }

  public double getLargest(){
            return(Collections.max(nums));
                           }
public void removeList(){nums=new ArrayList<Double>();}
    
    
    
}
