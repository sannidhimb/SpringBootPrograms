import { useState } from "react";

function gradingSystem(){
   const[number,setNumber]=useState();
   const[result,setResult]=useState();

   const grade=()=>{
    if(number>=90){
        setResult("Grade:A");
    }else if(number>=80){
        setResult("Grade:B");
    }else if(number>=70){
        setResult("Grade:C");
    }else if(number>=60){
        setResult("Grade:D");
    }else if(number>=50){
        setResult("Grade:E");
    }else{
        setResult("Grade:Fail");
    }
   }

    return(
        <>
         <div>Grading System</div>
          <input type="number" 
          value={number}
          onChange={(e)=>setNumber(e.target.value)}
         />
         <button onClick={grade}>Check</button>
         <h2>{result}</h2> 
        
        </>
    );
        
    }

export default gradingSystem;