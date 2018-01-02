
package com.pack1;
import javax.ejb.Remote;
@Remote
public interface NumberService {
    public double getNumber(double range);
    
}
