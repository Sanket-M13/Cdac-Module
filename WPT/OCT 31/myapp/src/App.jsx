import { HeaderSection } from "./headerSection";

function App() {

  return (
    <div>
      <h1>
        Hello
      </h1>
      <HeaderSection 
      heading = "Welcome" intro ="This is My first react app" buttonText="Know More"/>
      <HeaderSection 
      heading = "About Us" intro ="Learn about Us" buttonText="Know More About US"/>
    </div>
  )
}

export default App
