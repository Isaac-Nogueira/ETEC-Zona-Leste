document.getElementById("verificar").addEventListener("click", verificarParOuImpar);

function verificarParOuImpar() {
    const campo = document.getElementById("numero");
    const resultado = document.getElementById("imparPar");
    const numero = parseInt(campo.value);

    if (numero % 2 === 0) {
        resultado.textContent = `O ${numero}, que é Par`;
    } else {
        resultado.textContent = `O ${numero}, que é Ímpar`;
    }
}