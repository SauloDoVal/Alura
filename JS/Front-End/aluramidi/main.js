function tocaSom(seletorAudio) {
  const elemento = document.querySelector(seletorAudio)

  if (elemento != null && elemento.localName === 'audio') {
    elemento.play()
  } else {
    console.log('Elemento não encontrado ou seletor invalido')
  }
}

// function tocaSomPom() {
//   document.querySelector('#som_tecla_pom').play()
// }

// document.querySelector('.tecla_pom').onclick = tocaSomPom // para um botão só, não muito efetivo quando se tem uma lista.

const listaDeTeclas = document.querySelectorAll('.tecla')

for (let i = 0; i < listaDeTeclas.length; i++) {
  const tecla = listaDeTeclas[i]
  const somDaTecla = tecla.classList[1]
  //Template String
  const idAudio = `#som_${somDaTecla}`

  //console.log(idAudio)

  tecla.onclick = function () {
    tocaSom(idAudio)
  }

  tecla.onkeydown = function (evento) {
    if (evento.code === 'Space' || 'Enter') tecla.classList.add('ativa')
  }

  tecla.onkeyup = function () {
    tecla.classList.remove('ativa')
  }
}
