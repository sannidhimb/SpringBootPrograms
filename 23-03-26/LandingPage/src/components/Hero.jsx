function Hero() {
  return (
    <>
      <section
        className="flex w-full justify-center items-center h-75 bg-cover bg-center"
        style={{
          backgroundImage:
            "url('https://www.carbonbrief.org/wp-content/uploads/2021/06/Blue-sky-with-clouds-1550x804.jpg')",
        }}
      >
        <div className="text-center flex flex-col items-center">
          <div className="text-6xl pb-5 italic">
            Find the best ✈flights faster
          </div>
          <div className="text-gray-800 text-4xl pb-8 italic">
            Travel Smarter
          </div>
        </div>
      </section>

      <section className="flex gap-5">
        <div>Round trip</div>
        <div>Passengers</div>
      </section>

      <section className="flex gap-5">
        <div>
          <div>From</div>
          <div>Warsaw,Poland</div>
        </div>
        <div>
          <div>To</div>
          <div>Bangkok,Thailand</div>
        </div>
        <button className="bg-black text-white px-6 py-2 rounded-xl">
          Search
        </button>
      </section>
    </>
  );
}
export default Hero;
