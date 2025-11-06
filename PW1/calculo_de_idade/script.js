document.getElementById("calcular").addEventListener("click", calcularIdade);

function calcularIdade() {
  const anoNascimento = document.getElementById("anoNascimento").value;
  const idadeResultado = document.getElementById("idadeResultado");

  const anoAtual = new Date().getFullYear();

  const idade = anoAtual - anoNascimento;
  idadeResultado.textContent = `Você tem ${idade} anos.`;
}