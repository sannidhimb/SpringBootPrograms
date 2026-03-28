function ListDisplay(){
    const users=["A","B","C"];
 return(
   <>
   {users.map((user)=>(
     <div>{user}</div>
   ))}
   </> 
 );
}
export default ListDisplay;