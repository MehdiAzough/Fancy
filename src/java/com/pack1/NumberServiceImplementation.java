
package com.pack1;
import javax.ejb.Stateless;
@Stateless (mappedName="NumberServiceJNDIName")

public class NumberServiceImplementation implements NumberService{
    public double getNumber(double range){
      return(Math.random()*range);
    }   
}
