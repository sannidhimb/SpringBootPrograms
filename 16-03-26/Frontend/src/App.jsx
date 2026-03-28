import Hello from "./components/Hello";
import Home from "./components/Home";
import Add from "./Example/Add";
import Calculator from "./Example/Calculator";
import NumberAdd from "./Example/NumberAdd";

function App(){
  return(
    <div>
      <h1>Hello!</h1>
      <Home/>
      <Add/>
      <NumberAdd/>
      <Hello name={"sannidhi"} age={20}/>
      <Calculator/>
    </div>
  )
}
export default App;