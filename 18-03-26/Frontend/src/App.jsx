import { useState } from "react";
import Switch from "./component/switch";
import Guessing from "./component/Guessing";
import GradingSystem from "./component/GradingSystem";
import ListDisplay from "./component/ListDisplay";
import PrimeNumber from "./component/PrimeNumber";
import PrimeList from "./component/PrimeList";
import PassFail from "./component/PassFail";


function App(){
  const[count,setCount]=useState(0);

  const incrementCounter=()=>{
    setCount(count + 1);
  }
  const decrementCounter=()=>{
    setCount(count - 1);
  }

  return(
    <>
    <div>total count:{count}</div>
    <button onClick={incrementCounter}>Add+1</button>
    <button onClick={decrementCounter}>Add-1</button>
    <Switch/>
    <Guessing/>
    <GradingSystem/>
    <ListDisplay/>
    <PrimeNumber/>
    <PrimeList/>
    <PassFail/>
    </>
  );
}
export default App;