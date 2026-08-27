const readline = require("readline");
const { calculateStrength, evaluate } = require("./strength");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("Enter password: ", (password) => {
  const score = calculateStrength(password);
  const result = evaluate(score);

  console.log(`Password strength: ${result}`);
  rl.close();
});