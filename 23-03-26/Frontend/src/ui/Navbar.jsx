function Navbar(){
    return(
      <div className="flex justify-between px-5 py-3">
        <div className="flex gap-5">
        <div>Logo</div>
        <div>JCBM College</div>
        </div>
        
        <div className="flex gap-5 " >
        <div>Home</div>
        <div>About Us</div>
        <div>Services</div>
        <div>Products</div>
        <div>Contact Us</div>
        </div>

        <div className="flex gap-5">
            <div>SignUp</div>
            <div>Login</div>
        </div>
       </div>
    )
}
export default Navbar;