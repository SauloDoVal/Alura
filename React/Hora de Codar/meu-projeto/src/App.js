import './App.css'
import HelloWolrd from './components/HelloWorld'
import SayMyName from './components/SayMyName'
import Pessoa from './components/Pessoa'
import Frase from './components/Frase'

function App() {
  const babySauro = 'Franscisco'

  return (
    <div className="App">
      <h1>Testando CSS</h1>
      <Frase />
      <Frase />
      <SayMyName name="Saulo" />
      <SayMyName name="Mariana" />
      <SayMyName name={babySauro} />
      <Pessoa
        nome="Nome Genérico"
        idade="28"
        profissao="Professor"
        foto="http://via.placeholder.com/150"
      />
    </div>
  )
}

export default App
