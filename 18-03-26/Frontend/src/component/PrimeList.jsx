import { useState } from "react";

function PrimeList() {
  const [numbers, setNumbers] = useState("");

  return (
    <>
      <input
        type="text"
        placeholder="Enter the numbers"
        value={numbers}
        onChange={(e) => setNumbers(e.target.value)}
      />

      {numbers.split(",").map((n, i) => {
        let num = Number(n);

        if (num <= 1) return null;

        for (let j = 2; j < num; j++) {
          if (num % j === 0) return null;
        }

        return <div key={i}>{num}</div>;
      })}
    </>
  );
}

export default PrimeList;