function calculateStrength(password) {
  let score = 0;
  // Easter eggs (match Java behavior)
  if (password === "begubebek" || password === "begucuk") return 5;

  if (password.length >= 9) score++;
  if (/[A-Z]/.test(password)) score++;
  if (/[a-z]/.test(password)) score++;
  if (/[0-9]/.test(password)) score++;
  if (/[!@#$%^&*().,?]/.test(password)) score++;

  return score;
}

function evaluate(score) {
  if (score <= 2) return "WEAK";
  if (score <= 4) return "MEDIUM";
  return "STRONG";
}

module.exports = { calculateStrength, evaluate };
