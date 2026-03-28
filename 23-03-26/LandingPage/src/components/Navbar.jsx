function Navbar() {
  return (
    <>
      <div className="flex justify-between px-5 py-3">
        <div className="flex gap-5 font-semibold">
          <div>SkyExplorer</div>
        </div>

        <div className="flex gap-5 ">
          <div>Features</div>
          <div>Method</div>
          <div>Pricing</div>
          <div>Changelog</div>
        </div>

        <div className="flex gap-5">
          <button className="bg-black text-white px-6 py-2 rounded-xl">Log in</button>
        </div>
      </div>
    </>
  );
}

export default Navbar;
