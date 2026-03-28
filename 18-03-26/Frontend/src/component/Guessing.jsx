import { useState } from "react";

function Guessing(){
    const[number,setNumber]=useState();
    const[result,setResult]=useState("Guess it");

    const validate=()=>{
        const hardNumber=5;
        if(number==hardNumber){
            setResult("Correct");
        }else{
            setResult("Wrong");
        }
    };
    return(
        <>
        <input
         type="number"
         value={number}
         onChange={(e)=>setNumber(e.target.value)}
         />
         <button onClick={validate}>Verify</button>
         <h2>{result}</h2>        
         </>
    )
}
export default Guessing;