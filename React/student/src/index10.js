import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


//class based components in React
//state in class based components
//function based components do not have their state while class based components have their state

class App extends React.Component
{

  constructor(props)
  {
    super(props); 
    this.a=parseInt("20");  
    this.b=parseInt("2"); 
  }
  render()
  {
    return <div><h2>Addition={this.a+this.b}</h2>
    <h2>subtraction={this.a-this.b}</h2>
    <h2>multiplication={this.a*this.b}</h2>
    <h2>division={this.a/this.b}</h2>
    </div>
  }
}
ReactDOM.render(  
  <App/> ,
document.getElementById('root')
);