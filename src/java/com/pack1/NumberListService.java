/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack1;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface NumberListService {
      public List<Double> getNumbers(int size ,double range);
    
}
