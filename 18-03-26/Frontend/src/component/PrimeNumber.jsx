import { useState } from "react";

function PrimeNumber(){
const[number,setNumber]=useState();
const[result,setResult]=useState("Enter a number");

const checkPrime=()=>{
    let num = Number(number);

        if (num <= 1) {
            setResult("Not Prime");
            return;
        }

        let isPrime = true;
    for (let i = 2; i < num; i++) {
            if (num % i === 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            setResult("Prime Number");
        } else {
            setResult("Not Prime");
        }
};
    return(
        <>
        <div>Checking Prime Number</div>
        <input
         type="number"
         value={number}
         onChange={(e)=>setNumber(e.target.value)}
          />
          <button onClick={checkPrime}>Check</button>
          <h2>{result}</h2>
          </>
    );
}
export default PrimeNumber;