import { useState } from "react";

function Switch(){
    const[count,setCount]=useState(true);
   
    const switchFunction=()=>{
        setCount(!count);
    }

    return(
        <>
        <div>
            {count && <div>True</div>}
            {!count && <div>False</div>}
            <button onClick={switchFunction}>Update State</button>
            
        </div>
        </>
    );
}
export default Switch;