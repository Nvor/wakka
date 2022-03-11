import './App.css';
import Uploader from './components/uploader/uploader.js';
import Viewer from './components/viewer/viewer.js';

function App() {
  return (
    <div className="App">
      <h2>Wakka</h2>
      <Uploader />
      <Viewer />
    </div>
  );
}

export default App;
