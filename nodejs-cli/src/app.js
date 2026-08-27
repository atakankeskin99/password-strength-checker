const readline = require("readline");
const { calculateStrength, evaluate } = require("./strength");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Enter password: ", (password) => {
  // Easter eggs (match Java behavior)
  if (password.toLowerCase() === "begubebek" || password.toLowerCase() === "begucuk") {
    console.log("\nPassword Strength: BITANEM");
    rl.close();
    return;
  }

  const score = calculateStrength(password);
  const result = evaluate(score);

  console.log(`Password strength: ${result}`);
  rl.close();
});
