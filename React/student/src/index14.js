import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


//nested components
function makeDog(e) {
  e.target.setAttribute( 'src', 'https://source.unsplash.com/LYK3ksSQyeo');
  e.target.setAttribute('alt', 'dog');
}

const cat = (
  <div>
<img src="https://source.unsplash.com/Qmox1MkYDnY" alt="cat" onClick={makeDog}
  />
    <p>Click on the photo</p>
  </div>
);

ReactDOM.render(cat, document.getElementById('app'));