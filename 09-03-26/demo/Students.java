
 package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Students {
    @PostMapping("/marks")
   public String totalmarks(@RequestBody demo s){
    int m1=s.getm1();
    int m2=s.getm2();
    int m3=s.getm3();
    int m4=s.getm4();
    int m5=s.getm5();

    
    double avg= (m1+m2+m3+m4+m5)/5.0;
    if(avg>75){
        return "Avg"+ avg + "Eligible";
     }
     else{
        return "Avg" + avg + "not eligible";
     }

   }

}


